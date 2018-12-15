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
import java.util.ArrayList;
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
public class Search_Servlet extends HttpServlet {

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         doPost(request, response);
    }
        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            String name = request.getParameter("name");
            System.out.println(name);
            ICProductController ic = new ICProductController();
            ArrayList<ICProductsInfo> listsearch = ic.getListSearch(name);
            
            request.setAttribute("listsearch", listsearch);
        
            RequestDispatcher rd = request.getRequestDispatcher("/Public/products.jsp");
            rd.forward(request, response);
    }

}