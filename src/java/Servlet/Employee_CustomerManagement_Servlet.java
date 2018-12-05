/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Controller.ARCustomersController;
import Info.ARCustomersInfo;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
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
public class Employee_CustomerManagement_Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            response.setContentType("text/html; charset=UTF-8");
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            ARCustomersController objARCustomersController = new ARCustomersController();
            List<ARCustomersInfo> listCustomer =  new ArrayList<>();
            listCustomer = objARCustomersController.GetALlObject();
            request.setAttribute("listCustomer", listCustomer);
            request.getRequestDispatcher("Employee/employee_CustomerManagement.jsp").include(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Employee_CustomerManagement_Servlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
