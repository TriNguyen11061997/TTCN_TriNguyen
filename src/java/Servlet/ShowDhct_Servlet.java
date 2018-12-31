/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Controller.ARSaleOrderItemsController;
import Controller.ARSaleOrdersController;
import Info.ARSaleOrderItemsInfo;
import Info.ARSaleOrdersInfo;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author KA
 */

public class ShowDhct_Servlet extends HttpServlet {
    ARSaleOrdersController arSaleDAO = new ARSaleOrdersController();
    
         @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         doPost(request, response);
    }
        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            HttpSession session = request.getSession();
            int id = (Integer) session.getAttribute("HREmployeeID");
            
        try {
            //show du liệu đơn hàng theo id khách hàng
            List<ARSaleOrdersInfo> list =  arSaleDAO.getListOrderById(id);
            System.out.println("list = " + list.size());
            request.setAttribute("list", list);
            RequestDispatcher rd = request.getRequestDispatcher("/Public/dhct.jsp");
            rd.forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ShowDhct_Servlet.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
            
    }
}
