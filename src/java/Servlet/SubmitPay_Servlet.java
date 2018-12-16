/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Controller.ARCartsController;
import Info.ARSaleOrdersInfo;
import Info.ICProductsInfo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
            
            //chuyển trạng thái submit của giỏ hàng
            int idcus = Integer.parseInt(request.getParameter("idcus"));
            ARCartsController arc = new ARCartsController();
            ARSaleOrdersInfo objSale = new ARSaleOrdersInfo();
            List<ICProductsInfo> listPro = arc.getListProduct(idcus);
            
            double tongphu=0,tongchinh=0,phiship=30000.0;
            
            for(ICProductsInfo item : listPro){
                double tongTien = item.getQty() * item.getICProductSupplierPrice();
                tongphu+=tongTien;
            }
            tongchinh = tongphu + phiship;
            
            objSale.setAAStatus("Alive");
            objSale.setFK_ARCustomerID(idcus);
            objSale.setARSaleOrderStatus("NEW");
            objSale.setARSaleOrderShippingFees(phiship);
            objSale.setARSaleOrderTotalAmount(tongchinh);
            
            if(arc.submit_cart(objSale) == 1){
                //xóa đơn hàng
                System.out.println("Them thanh cong vao order");
                if(arc.delCart(idcus) == 1){
                     RequestDispatcher rd = request.getRequestDispatcher("/index_servlet");
                     rd.forward(request, response);
                     return;
                }
            }
                //chuyển trang về index
            RequestDispatcher rd = request.getRequestDispatcher("/index_servlet");
            rd.forward(request, response);
            
            
            
    }

}
