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

/**
 *
 * @author Trí Nguyễn
 */
public class Employee_SaleOrderUpdate_Servlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        ARSaleOrdersController obARSaleOrdersController = new ARSaleOrdersController();
        ARSaleOrdersInfo objARSaleOrdersInfo = new ARSaleOrdersInfo();
        objARSaleOrdersInfo.setARSaleOrderID(Integer.parseInt(request.getParameter("ARSaleOrderID")));
        objARSaleOrdersInfo.setARSaleOrderStatus(request.getParameter("ARSaleOrderStatus"));
        objARSaleOrdersInfo.setARSaleOrderPaymentStatus(request.getParameter("ARSaleOrderPaymentStatus"));
        objARSaleOrdersInfo.setARSaleOrderShippingFees(Double.parseDouble(request.getParameter("ARSaleOrderShippingFees")));
        if (obARSaleOrdersController.Update(objARSaleOrdersInfo)) {
            request.setAttribute("Complete", "Cập nhật thành công!");
            response.sendRedirect("Employee_SaleOrderManagement_Servlet");
        } else {
            try {
                request.setAttribute("Error", "Cập nhật không thành công!");
                ARSaleOrderItemsController objARSaleOrderItemsController = new ARSaleOrderItemsController();
                List<ARSaleOrderItemsInfo> listSaleOrderItem = objARSaleOrderItemsController.GetObjectBySaleOrderID(objARSaleOrdersInfo.getARSaleOrderID());
                request.setAttribute("saleorder", objARSaleOrdersInfo);
                request.setAttribute("listSaleOrderItem", listSaleOrderItem);
                request.getRequestDispatcher("Employee/employee_SaleOrderUpdate.jsp").forward(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(Admin_SaleOrderUpdate_Servlet.class.getName()).log(Level.SEVERE, null, ex);
            }
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
