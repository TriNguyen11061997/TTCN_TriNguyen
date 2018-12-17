/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Controller.ARCartsController;
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
//@WebServlet(name = "Cart_SaleOrder_Servlet", urlPatterns = {"/Cart_SaleOrder_Servlet"})
public class Cart_SaleOrder_Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        int idcus = Integer.parseInt(request.getParameter("idcus"));
        ARCartsController arc = new ARCartsController();
        List<ICProductsInfo> listPro = arc.getListProduct(idcus);
        request.setAttribute("listProduct", listPro);
        request.getRequestDispatcher("/Public/cart.jsp").include(request, response);
    }

}
