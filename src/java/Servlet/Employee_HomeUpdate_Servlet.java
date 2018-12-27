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
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author PC
 */
@WebServlet(name = "Employee_HomeUpdate_Servlet", urlPatterns = {"/Employee_HomeUpdate_Servlet"})
public class Employee_HomeUpdate_Servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        if (session.getAttribute("HREmployeeID") != null) {
            ARCustomersController aRCustomersController = new ARCustomersController();
            ARCustomersInfo aRCustomersInfo = new ARCustomersInfo();
            aRCustomersInfo.setARCustomerID(Integer.parseInt(request.getParameter("ARCustomerID")));
            aRCustomersInfo.setARCustomerNo(request.getParameter("ARCustomerNo"));
            aRCustomersInfo.setARCustomerName(request.getParameter("ARCustomerName"));
            aRCustomersInfo.setARCustomerGender(Integer.parseInt(request.getParameter("ARCustomerGender")));
            aRCustomersInfo.setARCustomerBirthDay(Date.valueOf(request.getParameter("ARCustomerBirthDay")));
            aRCustomersInfo.setARCustomerTel1(request.getParameter("ARCustomerTel1"));
            aRCustomersInfo.setARCustomerEmail(request.getParameter("ARCustomerEmail"));
            aRCustomersInfo.setARCustomerIDNumber(request.getParameter("ARCustomerIDNumber"));
            aRCustomersInfo.setARCustomerCardNumber(request.getParameter("ARCustomerCardNumber"));
            aRCustomersInfo.setARCustomerContactAddressCity(request.getParameter("ARCustomerContactAddressCity"));
            aRCustomersInfo.setARCustomerContactAddressCountry(request.getParameter("ARCustomerContactAddressCountry"));
            aRCustomersInfo.setARCustomerContactAddress(request.getParameter("ARCustomerContactAddress"));
            aRCustomersInfo.setARCustomerDesc(request.getParameter("ARCustomerDesc"));
            ARCustomersInfo arc = aRCustomersController.Update(aRCustomersInfo);
            if(arc != null){
                response.sendRedirect("Employee_CustomerManagement_Servlet");
            }
            else{
                response.sendRedirect("Employee_CustomerManagement_Servlet");
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
