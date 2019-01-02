/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Controller.ARCustomersController;
import Controller.ICProductController;
import Info.ARCustomerCommentsInfo;
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

/**
 *
 * @author KA
 */
//@WebServlet(name = "Preview_Servlet", urlPatterns = {"/Preview_Servlet"})
public class Preview_Servlet extends HttpServlet {
    ICProductController icDAO = new ICProductController();
    ARCustomersController arc = new ARCustomersController();
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         doPost(request, response);
    }
        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
             int id = Integer.parseInt(request.getParameter("id"));
        
        
        try {
            //truy van
            List<ARCustomerCommentsInfo> list = arc.ListComment(id);
            //System.out.println("List" + list.size());
            request.setAttribute("listcomment", list);
            request.setAttribute("ObjProduct", icDAO.getObjectProductDetail(id));
            RequestDispatcher rd = request.getRequestDispatcher("/Public/preview.jsp");
            rd.forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Preview_Servlet.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }
}
