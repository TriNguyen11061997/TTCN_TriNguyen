/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Controller.HREmployeesController;
import Controller.HRSalarysController;
import Info.HREmployeesInfo;
import Info.HRSalarysInfo;
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
public class Admin_SalaryAdd_Servlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        if (session.getAttribute("HREmployeeID") != null) {
            try {
                HRSalarysController objHRSalarysController = new HRSalarysController();
                HRSalarysInfo objHRSalarysInfo = new HRSalarysInfo();
                objHRSalarysInfo.setFK_HREmployeeID(Integer.parseInt(request.getParameter("FK_HREmployeeID")));
                objHRSalarysInfo.setHRSalaryMonth(Integer.parseInt(request.getParameter("HRSalaryMonth")));
                objHRSalarysInfo.setHRSalaryYear(Integer.parseInt(request.getParameter("HRSalaryYear")));
                objHRSalarysInfo.setHRSalaryBasic(Double.parseDouble(request.getParameter("HRSalaryBasic")));
                objHRSalarysInfo.setHRSalaryBonus(Double.parseDouble(request.getParameter("HRSalaryBonus")));
                objHRSalarysInfo.setHRSalaryReduce(Double.parseDouble(request.getParameter("HRSalaryReduce")));
                objHRSalarysInfo.setHRSalaryQty(Double.parseDouble(request.getParameter("HRSalaryQty")));
                double total = (objHRSalarysInfo.getHRSalaryQty() * 4) * objHRSalarysInfo.getHRSalaryBasic()
                        + objHRSalarysInfo.getHRSalaryBonus() - objHRSalarysInfo.getHRSalaryReduce();
                objHRSalarysInfo.setHRSalaryToTal(total);
                response.sendRedirect("/Admin_SalaryManagement");
                objHRSalarysController.Insert(objHRSalarysInfo);
            } catch (SQLException ex) {
                response.sendRedirect("/Admin_SalaryManagement");
            }
        } else {
            request.getRequestDispatcher("Public/login.jsp").forward(request, response);
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
