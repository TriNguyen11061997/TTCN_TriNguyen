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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author PC
 */
public class CreacteAccount_Servlet extends HttpServlet {

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
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        
        ARCustomersController customer = new ARCustomersController();
        
        ARCustomersInfo aRCustomersInfo = new ARCustomersInfo();
        aRCustomersInfo.setARCustomerName( request.getParameter("name"));
        aRCustomersInfo.setARCustomerEmail(request.getParameter("email"));
        aRCustomersInfo.setARCustomerTel1(request.getParameter("phone"));
        aRCustomersInfo.setARCustomerIDNumber( request.getParameter("numberID"));
        aRCustomersInfo.setARCustomerContactAddress( request.getParameter("address"));
        aRCustomersInfo.setARCustomerContactAddressCity( request.getParameter("city"));
        aRCustomersInfo.setARCustomerContactAddressCountry( request.getParameter("country"));
        
        boolean result = customer.CreateAccount(request.getParameter("user"), request.getParameter("password"), aRCustomersInfo);
        
        if(result){
            request.setAttribute("dangky", "Đăng ký tài khoản thành công");
            request.getRequestDispatcher("Public/login.jsp").include(request, response);
        }
        else{
            request.setAttribute("dangky", "Đăng ký tài khoản thất bại!");
            request.getRequestDispatcher("Public/login.jsp").include(request, response);
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
