/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Controller.ICProductController;
import Info.ICProductsInfo;
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
@WebServlet(name = "Admin_ProductUpdate_Servlet", urlPatterns = {"/Admin_ProductUpdate_Servlet"})
public class Admin_ProductUpdate_Servlet extends HttpServlet {

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
        HttpSession session = request.getSession();
        if (session.getAttribute("HREmployeeID") != null) {
            ICProductController iCProductController = new ICProductController();
            ICProductsInfo iCProductsInfo = new ICProductsInfo();
            
            iCProductsInfo.setICProductID(Integer.parseInt(request.getParameter("ICProductID")));
            iCProductsInfo.setICProductName(request.getParameter("ICProductName"));
            iCProductsInfo.setICProductDate(Date.valueOf(request.getParameter("ICProductDate")));
            iCProductsInfo.setICProductSupplierPrice(Double.parseDouble(request.getParameter("ICProductSupplierPrice")));
            iCProductsInfo.setICProductPrice(Double.parseDouble(request.getParameter("ICProductPrice")));
            iCProductsInfo.setICProductVideo(request.getParameter("ICProductVideo"));
            iCProductsInfo.setICProductDesc(request.getParameter("ICProductDesc"));
            
            ICProductsInfo icp = iCProductController.Update(iCProductsInfo);
            if(icp != null){
                request.setAttribute("Execute", "Chỉnh sửa thông tin thành công");
                request.getRequestDispatcher("/Admin_ProductManagement").include(request, response);
            }
            else{
                request.setAttribute("ProductUpdate", "Chỉnh sửa thông tin thất bại");
                request.getRequestDispatcher("/Admin_ProductLoadupdate_Servlet?ID=" + request.getParameter("ICProductID")).include(request, response);
            }
        }
        else {
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
