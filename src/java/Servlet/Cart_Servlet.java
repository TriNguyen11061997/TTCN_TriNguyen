/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Controller.ARCartsController;
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
/**
 *
 * @author KA
 */
//@WebServlet(name = "Cart_Servlet", urlPatterns = {"/Cart_Servlet"})
public class Cart_Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private ARCartsController ARCart = new ARCartsController();
    public Cart_Servlet(){
        super();
    }
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
             int idProduct = Integer.parseInt(request.getParameter("id"));
            ARCartsController arcc = new ARCartsController();
            List<ARCartsInfo> obj = arcc.GetALlObject();
            for(int i=0;i<obj.size();i++){
                //Kiem tra trung san pham
                if(obj.get(i).getFK_ICProductID()==idProduct){
                    int qtyAfter = obj.get(i).getARCartQty()+1;
                    obj.get(i).setARCartQty(qtyAfter);
                    obj.get(i).setARCartID(obj.get(i).getARCartID());
                    if(ARCart.Update(obj.get(i))==1){
                        RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
                        rd.forward(request, response);
                        return;
                    }
                }
            }
            
            //code thêm giỏ hàng
            ARCartsInfo objCart = new ARCartsInfo();
            
           
            objCart.setFK_ICProductID(idProduct);
            
            objCart.setARCartQty(1);
            objCart.setAAStatus("Alive");
            //objCart.setARCartQty(2.0);
            //objCart.setFK_ARCustomerID(12);
            //objCart.setARCartDate();
            if(ARCart.Insert(objCart)==1){
                RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
                rd.forward(request, response);
            }else
                System.out.println("Thêm thất bại");
            System.out.println("id = " + idProduct);
        } catch (SQLException ex) {
            Logger.getLogger(Cart_Servlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
                //thêm csdl cart
                doGet(request, response);
//        int i=1;
//       
//           // System.out.println("gia tri" + idProduct);
//        response.getWriter().print("<div class=\"cart\">\n" +"<a href=\"#\" title=\"View my shopping cart\" rel=\"nofollow\">\n" +"<strong class=\"opencart\"> </strong>\n" +"<span class=\"cart_title\">Giỏ hàng</span>\n" +"<span class=\"no_product\">1</span>\n" +"</a>\n" +"</div>");
	
        
       
        
    }

}
