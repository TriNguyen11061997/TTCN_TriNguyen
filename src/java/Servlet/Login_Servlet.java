/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Controller.ADUsersController;
import Info.ADUsersInfo;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
//@WebServlet(name = "Login_Servlet", urlPatterns = {"/Login_Servlet"})
public class Login_Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            response.setContentType("text/html; charset=UTF-8");
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            HttpSession session = request.getSession();           
            ADUsersController objADUsersController = new ADUsersController();
            ADUsersInfo objADUsersInfo = objADUsersController.GetObjectByNameAndPassword(request.getParameter("UserName"), request.getParameter("Password"));
            if (objADUsersInfo != null) {
                session.setAttribute("HREmployeeID",objADUsersInfo.getFK_HREmployeeID());
                request.getRequestDispatcher("Employee/employee_Home.jsp").include(request, response);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login_Servlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
