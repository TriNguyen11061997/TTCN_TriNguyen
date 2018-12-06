/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Controller.ICProductController;
import Info.ICProductsInfo;
import java.io.IOException;
import java.io.PrintWriter;
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
//@WebServlet(name = "Index_Servlet", urlPatterns = {"/Index_Servlet"})
public class Index_Servlet extends HttpServlet {
    private ICProductController ProductDAO = new ICProductController();
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
//            List<ICProductsInfo> listPro = null;
//            listPro = ProductDAO.getListProduct();
//            request.setAttribute("listPro", listPro);
//            
            RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
            rd.forward(request, response);

//        } catch (SQLException ex) {
//            Logger.getLogger(Index_Servlet.class.getName()).log(Level.SEVERE, null, ex);
//     }
        
           }

}
