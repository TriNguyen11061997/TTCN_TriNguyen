/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Controller.ARSaleOrdersController;
import Controller.HREmployeesController;
import Info.ARSaleOrdersInfo;
import Info.HREmployeesInfo;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Trí Nguyễn
 */
public class Admin_EmployeeManagement_Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            response.setContentType("text/html; charset=UTF-8");
            request.setCharacterEncoding("UTF-8");
            HttpSession session = request.getSession();
            if (session.getAttribute("HREmployeeID") != null) {
                HREmployeesController objHEmployeesController = new HREmployeesController();
                List<HREmployeesInfo> listEmployees = objHEmployeesController.GetALlObject();
                if (listEmployees.size() > 0) {
                    request.setAttribute("listEmployees", listEmployees);
                    request.getRequestDispatcher("Admin/admin_EmployeeManagement.jsp").include(request, response);
                }
            } else {
                request.getRequestDispatcher("Public/login.jsp").include(request, response);
            }
        } catch (SQLException ex) {
            request.getRequestDispatcher("Admin/admin_Home.jsp").include(request, response);
        }
    }
}
