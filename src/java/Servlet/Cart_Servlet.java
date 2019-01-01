/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Controller.ARCartsController;
import Info.ADUsersInfo;
import Info.ARCartsInfo;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/**
 *
 * @author KA
 */
//@WebServlet(name = "Cart_Servlet", urlPatterns = {"/Cart_Servlet"})
public class Cart_Servlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private ARCartsController ARCart = new ARCartsController();

    public Cart_Servlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            int idProduct = Integer.parseInt(request.getParameter("id"));
            int idCus = Integer.parseInt(request.getParameter("idcus"));
            ARCartsController arcc = new ARCartsController();
            List<ARCartsInfo> obj = arcc.getListCartByID(idCus);
            for (int i = 0; i < obj.size(); i++) {
                //Kiem tra trung san pham
                if (obj.get(i).getFK_ICProductID() == idProduct) {
                    int qtyAfter = obj.get(i).getARCartQty() + 1;
                    obj.get(i).setARCartQty(qtyAfter);
                    obj.get(i).setARCartID(obj.get(i).getARCartID());
                    if (ARCart.Update(obj.get(i)) == 1) {
                        RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
                        rd.forward(request, response);
                        return;
                    }
                }
            }
            //code thêm giỏ hàng
            ARCartsInfo objCart = new ARCartsInfo();
            //set id user vao
            //objCart.setFK_ARCustomerID(objUsers.getADUserID());
            objCart.setFK_ARCustomerID(idCus);
            objCart.setFK_ICProductID(idProduct);
            objCart.setARCartQty(1);
            objCart.setAAStatus("Alive");
            if (ARCart.Insert(objCart) == 1) {
                request.getRequestDispatcher("/index.jsp").forward(request, response);
            } else {
                System.out.println("Thêm thất bại");
            }
            System.out.println("id = " + idProduct);
        } catch (SQLException ex) {
            Logger.getLogger(Cart_Servlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
