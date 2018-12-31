/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Controller.ICProductController;
import Info.ICProductDetailsInfo;
import Info.ICProductsInfo;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "Admin_ProductDetailAdd_Servlet", urlPatterns = {"/Admin_ProductDetailAdd_Servlet"})
public class Admin_ProductDetailAdd_Servlet extends HttpServlet {

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
            ICProductDetailsInfo iCProductDetailsInfo = new ICProductDetailsInfo();
            ICProductController iCProductController = new ICProductController();
            
            
            //ICProductsInfo iCProductsInfo = iCProductController.GetObjectByID(Integer.parseInt(request.getParameter("ID")));
            
            iCProductDetailsInfo.setFK_ICProductID(Integer.parseInt(request.getParameter("FK_ICProductID")));
            iCProductDetailsInfo.setICProductDetail3G(request.getParameter("ICProductDetail3G"));
            iCProductDetailsInfo.setICProductDetail4G(request.getParameter("ICProductDetail4G"));
            iCProductDetailsInfo.setICProductDetailSIM(request.getParameter("ICProductDetailSIM"));
            iCProductDetailsInfo.setICProductDetailKichThuoc("ICProductDetailKichThuoc");
            iCProductDetailsInfo.setICProductDetailMauSac(request.getParameter("ICProductDetailMauSac"));
            iCProductDetailsInfo.setICProductDetailTrongLuong(request.getParameter("ICProductDetailTrongLuong"));
            iCProductDetailsInfo.setICProductDetailLoai(request.getParameter("ICProductDetailLoai"));
            iCProductDetailsInfo.setICProductDetailManHinh(request.getParameter("ICProductDetailManHinh"));
            iCProductDetailsInfo.setICProductDetailHeDieuHanh(request.getParameter("ICProductDetailHeDieuHanh"));
            iCProductDetailsInfo.setICProductDetailLoaNgoai(request.getParameter("ICProductDetailLoaNgoai"));
            iCProductDetailsInfo.setICProductDetailJack3dot5mm(request.getParameter("ICProductDetailJack3dot5mm"));
            iCProductDetailsInfo.setICProductDetailBoNhoTrong(request.getParameter("ICProductDetailBoNhoTrong"));
            iCProductDetailsInfo.setICProductDetailBluetooth(request.getParameter("ICProductDetailBluetooth"));
            iCProductDetailsInfo.setICProductDetailGPS(request.getParameter("ICProductDetailGPS"));
            iCProductDetailsInfo.setICProductDetailPin(request.getParameter("ICProductDetailPin"));
            iCProductDetailsInfo.setICProductDetailWLAN(request.getParameter("ICProductDetailWLAN"));
            iCProductDetailsInfo.setICProductDetailCameraChinh(request.getParameter("ICProductDetailCameraChinh"));
            iCProductDetailsInfo.setICProductDetailCamaraPhu(request.getParameter("ICProductDetailCamaraPhu"));
            iCProductDetailsInfo.setICProductDetailQuayPhim(request.getParameter("ICProductDetailQuayPhim"));
            iCProductDetailsInfo.setICProductDetailCPU(request.getParameter("ICProductDetailCPU"));
            iCProductDetailsInfo.setICProductDetailBaoHanh(request.getParameter("ICProductDetailBaoHanh"));
            
            ICProductDetailsInfo icpd = iCProductController.Add(iCProductDetailsInfo);
            if(icpd != null){
                response.sendRedirect("/Admin_ProductManagement");
            }
            else{
                request.setAttribute("ProductDetailAdd", "Thêm thông tin thất bại");
                request.getRequestDispatcher("/Admin/admin_ProductDetailAdd.jsp?ID=" + request.getParameter("FK_ICProductID")).include(request, response);
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
