/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Controller.ADUsersController;
import Info.ADUsersInfo;
import Util.Constants;
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
                session.setAttribute("HREmployeeID", objADUsersInfo.getFK_HREmployeeID());
                switch (objADUsersInfo.getFK_ADUserGroupID()) {
                    case Constants.UserGroup.Admin:
                        //request.getRequestDispatcher("/Admin_Home_Servlet").include(request, response);
                        response.sendRedirect("/Admin_Home_Servlet");
                        break;
                    case Constants.UserGroup.Employee:
                        response.sendRedirect("/Employee_Home_Servlet");
                        break;
                    case Constants.UserGroup.Customer:
                        request.getRequestDispatcher("index.jsp").include(request, response);
                        break;
                    default:
                        break;
                }
            } else {
                request.setAttribute("Error", "UserName or Parsword không đúng!");
                request.getRequestDispatcher("Public/login.jsp").include(request, response);
            }
        } catch (SQLException ex) {
            request.getRequestDispatcher("Public/login.jsp").include(request, response);
        }
    }

}
