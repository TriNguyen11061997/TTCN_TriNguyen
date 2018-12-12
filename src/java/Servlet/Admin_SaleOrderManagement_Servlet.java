/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Controller.ARSaleOrdersController;
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
public class Admin_SaleOrderManagement_Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            response.setContentType("text/html; charset=UTF-8");
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            ARSaleOrdersController objARSaleOrdersController = new ARSaleOrdersController();
            List<ARSaleOrdersInfo> listSaleOrder = objARSaleOrdersController.GetAllObjectForAdmin();
            if (listSaleOrder.size() > 0) {
                request.setAttribute("listSaleOrder", listSaleOrder);
                request.getRequestDispatcher("Admin/admin_SaleOrderManagement.jsp").include(request, response);
            }
        } catch (SQLException ex) {
            request.getRequestDispatcher("Admin/admin_Home.jsp").include(request, response);
        }
    }

}
