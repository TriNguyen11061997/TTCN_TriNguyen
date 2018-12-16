/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Controller.HREmployeesController;
import Info.HREmployeesInfo;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
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
//@WebServlet(name = "Employee_Home_Servlet", urlPatterns = {"/Employee_Home_Servlet"})
public class Employee_Home_Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            response.setContentType("text/html; charset=UTF-8");
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            HttpSession session = request.getSession();
            if (session.getAttribute("HREmployeeID") != null) {
                HREmployeesController objEmployeesController = new HREmployeesController();
                HREmployeesInfo objEmployeesInfo = objEmployeesController.GetObjectByID(Integer.parseInt(session.getAttribute("HREmployeeID").toString()));
                request.setAttribute("Employee", objEmployeesInfo);
                request.getRequestDispatcher("Employee/employee_Home.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        } catch (SQLException ex) {
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }
}
