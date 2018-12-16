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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Trí Nguyễn
 */
public class Admin_SaleOrderLoadUpdate_Servlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        //if (session.getAttribute("HREmployeeID") != null) {
        try {
            ARSaleOrdersController objARSaleOrdersController = new ARSaleOrdersController();
            ARSaleOrdersInfo objARSaleOrdersInfo = objARSaleOrdersController.GetObjectByID(Integer.parseInt(request.getParameter("ARSaleOrderID")));
            ARSaleOrderItemsController objARSaleOrderItemsController = new ARSaleOrderItemsController();
            List<ARSaleOrderItemsInfo> listSaleOrderItem = objARSaleOrderItemsController.GetObjectBySaleOrderID(Integer.parseInt(request.getParameter("ARSaleOrderID")));
            request.setAttribute("saleorder", objARSaleOrdersInfo);
            request.setAttribute("listSaleOrderItem", listSaleOrderItem);
            request.getRequestDispatcher("Admin/admin_SaleOrderUpdate.jsp").forward(request, response);
        } catch (SQLException ex) {
            request.setAttribute("Error", "Không thể cập nhật cho đơn hàng này");
            request.getRequestDispatcher("Admin/admin_SaleOrderManagement.jsp").forward(request, response);
            //}
        }
    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
