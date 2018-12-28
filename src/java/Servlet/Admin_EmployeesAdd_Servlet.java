/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;


import Controller.HREmployeesController;
import Info.HREmployeesInfo;
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
@MultipartConfig
public class Admin_EmployeesAdd_Servlet extends HttpServlet {

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
        if (session.getAttribute("HREmployeeID") != null){
            HREmployeesController hREmployeesController = new HREmployeesController();
            HREmployeesInfo objEmployeesInfo = new HREmployeesInfo();
            // xu ly anh
		String picture = "";
		// file
		final String path = request.getServletContext().getRealPath("Images");
		System.out.println(path);
		File dirFile = new File(path);
		if (!dirFile.exists()) {
			dirFile.mkdir();
		}

		final Part filePart = request.getPart("hinhanh");
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
            objEmployeesInfo.setHREmployeePicture(picture);
            objEmployeesInfo.setHREmployeeNo(request.getParameter("HREmployeeNo"));
            objEmployeesInfo.setHREmployeeName(request.getParameter("HREmployeeName"));
            objEmployeesInfo.setHREmployeeGender(Integer.parseInt(request.getParameter("HREmployeeGender")));
            objEmployeesInfo.setHREmployeeBirthDay(Date.valueOf(request.getParameter("HREmployeeBirthDay")));
            objEmployeesInfo.setHREmployeeStatus(request.getParameter("HREmployeeStatus"));
            objEmployeesInfo.setHREmployeeDesc(request.getParameter("HREmployeeDesc"));
            objEmployeesInfo.setHREmployeeIDNumber(request.getParameter("HREmployeeIDNumber"));
            objEmployeesInfo.setHREmployeeCardNumber(request.getParameter("HREmployeeCardNumber"));
            objEmployeesInfo.setHREmployeeTel1(request.getParameter("HREmployeeTel1"));
            objEmployeesInfo.setHREmployeeEmail(request.getParameter("HREmployeeEmail"));
            objEmployeesInfo.setHREmployeeContactAddress(request.getParameter("HREmployeeContactAddress"));
            objEmployeesInfo.setHREmployeeContactAddressCity(request.getParameter("HREmployeeContactAddressCity"));
            objEmployeesInfo.setHREmployeeContactAddressCountry(request.getParameter("HREmployeeContactAddressCountry"));
            
                HREmployeesInfo objHREmployeesInfo = hREmployeesController.Add(objEmployeesInfo);
            if (objHREmployeesInfo != null) {
                response.sendRedirect("/Admin_EmployeeManagement_Servlet");
                request.setAttribute("Complete", "Thêm thông tin thành công!");
            } else {
                request.setAttribute("Employee", objEmployeesInfo);
                request.setAttribute("Error", "Thêm thông tin thất bại!");
                request.getRequestDispatcher("Admin/admin_EmployeeAdd.jsp");
            }
    
        }
        else {
            request.getRequestDispatcher("index.jsp").forward(request, response);
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
