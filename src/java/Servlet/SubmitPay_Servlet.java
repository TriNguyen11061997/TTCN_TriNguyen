/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Controller.ARCartsController;
import Controller.ARSaleOrderItemsController;
import Controller.GeNumberingsController;
import Info.ARSaleOrderItemsInfo;
import Info.ARSaleOrdersInfo;
import Info.ICProductsInfo;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author KA
 */
//@WebServlet(name = "About_Servlet", urlPatterns = {"/About_Servlet"})
public class SubmitPay_Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            //chuyển trạng thái submit của giỏ hàng
            int idcus = Integer.parseInt(request.getParameter("idcus"));
            ARCartsController arc = new ARCartsController();
            ARSaleOrdersInfo objSale = new ARSaleOrdersInfo();
            ARSaleOrderItemsController objARSaleOrderItemsController = new ARSaleOrderItemsController();
            List<ICProductsInfo> listPro = arc.getListProduct(idcus);
            List<ARSaleOrderItemsInfo> listSaleOrderItems = new ArrayList<>();
            ARSaleOrderItemsInfo objARSaleOrderItemsInfo;
            double tongphu = 0, tongchinh = 0, phiship = 30000.0;
            for (ICProductsInfo item : listPro) {
                objARSaleOrderItemsInfo = new ARSaleOrderItemsInfo();
                objARSaleOrderItemsInfo.setFK_ICProductID(item.getICProductID());
                objARSaleOrderItemsInfo.setARSaleOrderItemName(item.getICProductName());
                objARSaleOrderItemsInfo.setARSaleOrderItemDesc(item.getICProductDesc());
                objARSaleOrderItemsInfo.setARSaleOrderItemQty((double) item.getQty());
                objARSaleOrderItemsInfo.setARSaleOrderItemUnitCost(item.getICProductPrice());
                double tongTien = item.getQty() * item.getICProductPrice();
                objARSaleOrderItemsInfo.setARSaleOrderItemTotalAmount(tongTien);
                listSaleOrderItems.add(objARSaleOrderItemsInfo);
                tongphu += tongTien;
            }   tongchinh = tongphu + phiship;
            objSale.setFK_ARCustomerID(idcus);
            objSale.setARSaleOrderShippingFees(phiship);
            objSale.setARSaleOrderTotalAmount(tongchinh);
            objSale.setARSaleOrderDate(new Date(System.currentTimeMillis()));
            GeNumberingsController objGeNumberingsController = new GeNumberingsController();
            String no = objGeNumberingsController.GetNo("ARSaleOrders");
            objSale.setARSaleOrderNo(no);
            if (arc.submit_cart(objSale) == 1) {
                for (ARSaleOrderItemsInfo SaleOrderItem : listSaleOrderItems) {
                    objARSaleOrderItemsController.Insert(SaleOrderItem);
                }
                System.out.println("Them thanh cong vao order");
                if (arc.delCart(idcus) == 1) {
                    RequestDispatcher rd = request.getRequestDispatcher("/index_servlet");
                    rd.forward(request, response);
                    return;
                }
            }   //chuyển trang về index
            RequestDispatcher rd = request.getRequestDispatcher("/index_servlet");
            rd.forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(SubmitPay_Servlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
