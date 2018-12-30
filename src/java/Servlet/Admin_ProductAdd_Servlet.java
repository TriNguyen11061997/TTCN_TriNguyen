/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Controller.ICProductController;
import Info.ICProductsInfo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import libraryDB.LibraryFile;

/**
 *
 * @author PC
 */
@WebServlet(name = "Admin_ProductAdd_Servlet", urlPatterns = {"/Admin_ProductAdd_Servlet"})
@MultipartConfig
public class Admin_ProductAdd_Servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    protected String XuLyAnh(HttpServletRequest request, HttpServletResponse response, String name) throws IOException, IllegalStateException, ServletException{
        // xu ly anh
            String picture = "";
            // file
            final String path = request.getServletContext().getRealPath("Images");
            System.out.println(path);
            File dirFile = new File(path);
            if (!dirFile.exists()) {
                dirFile.mkdir();
            }

            final Part filePart = request.getPart(name);
            System.out.println("ten: " + filePart);
            final String fileName = LibraryFile.getName(filePart);

            if (!"".equals(fileName)) { // cÃ³ chá»�n áº£nh
                OutputStream out = null;

                InputStream filecontent = null;
                picture = LibraryFile.rename(fileName);
                System.out.println(picture);
                try {
                    out = new FileOutputStream(new File(path + File.separator + picture));
                    filecontent = filePart.getInputStream();

                    int read = 0;
                    final byte[] bytes = new byte[1024];

                    while ((read = filecontent.read(bytes)) != -1) {
                        out.write(bytes, 0, read);
                    }

                } catch (FileNotFoundException fne) {
                    fne.printStackTrace();
                } finally {
                    if (out != null) {
                        out.close();
                    }
                    if (filecontent != null) {
                        filecontent.close();
                    }
                }
            }
            return picture;
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        if (session.getAttribute("HREmployeeID") != null) {
            ICProductsInfo iCProductsInfo = new ICProductsInfo();
            ICProductController iCProductController = new ICProductController();
            
            iCProductsInfo.setICProductNo(request.getParameter("ICProductNo"));
            iCProductsInfo.setICProductName(request.getParameter("ICProductName"));
            iCProductsInfo.setICProductDate(Date.valueOf(request.getParameter("ICProductDate")));
            iCProductsInfo.setICProductSupplierPrice(Double.parseDouble(request.getParameter("ICProductSupplierPrice")));
            iCProductsInfo.setICProductPrice(Double.parseDouble(request.getParameter("ICProductPrice")));
            iCProductsInfo.setICProductVideo(request.getParameter("ICProductVideo"));
            iCProductsInfo.setICProductDesc(request.getParameter("ICProductDesc"));
            iCProductsInfo.setFK_HREmployeeID(Integer.parseInt(session.getAttribute("HREmployeeID").toString()));

            
            
              
            String a = XuLyAnh(request, response, "ICProductPicture1");
            iCProductsInfo.setICProductPicture1(a);
            
           
                
            a = XuLyAnh(request, response, "ICProductPicture2");
            iCProductsInfo.setICProductPicture2(a);
            
           
                
            a = XuLyAnh(request, response, "ICProductPicture3");
            iCProductsInfo.setICProductPicture3(a);
            
                
            a = XuLyAnh(request, response, "ICProductPicture4");
            iCProductsInfo.setICProductPicture4(a);
            
                
            a = XuLyAnh(request, response, "ICProductPicture5");
            iCProductsInfo.setICProductPicture5(a);
            
                
            a = XuLyAnh(request, response, "ICProductPicture6");
            iCProductsInfo.setICProductPicture6(a);
            
            
            ICProductsInfo icp = iCProductController.Add(iCProductsInfo);
            if(icp != null){
                response.sendRedirect("/Admin_ProductManagement");
            }
            else{
                request.setAttribute("ProductAdd", "Thêm thất bại");
                request.getRequestDispatcher("Admin/admin_ProductAdd.jsp").include(request, response);
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
