/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Controller.HREmployeesController;
import Info.HREmployeesInfo;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Trí Nguyễn
 */
public class Admin_EmployeeUpdate_Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        // để mở project cũ ra xem có gì khác ko
        // 2 dòng trên ni có vấn đề, mở đoạn taaoj user hàm create employee t chưa viết hàm đó. mà 2 cai  như nahu
        HttpSession session = request.getSession();
        // lấy info gì sout info bị lỗi font ra xem thử
        if (session.getAttribute("HREmployeeID") != null) {
            HREmployeesController objEmployeesController = new HREmployeesController();
            HREmployeesInfo objEmployeesInfo = new HREmployeesInfo();
            objEmployeesInfo.setHREmployeeID(Integer.parseInt(request.getParameter("HREmployeeID")));
            System.out.println("tên jsp: "+request.getParameter("HREmployeeName"));
            objEmployeesInfo.setHREmployeeName(request.getParameter("HREmployeeName"));
            objEmployeesInfo.setHREmployeeNo(request.getParameter("HREmployeeNo"));
            objEmployeesInfo.setHREmployeePicture(request.getParameter("HREmployeePicture"));
            objEmployeesInfo.setHREmployeeGender(Integer.parseInt(request.getParameter("HREmployeeGender")));
            objEmployeesInfo.setHREmployeeBirthDay(Date.valueOf(request.getParameter("HREmployeeBirthDay")));
            objEmployeesInfo.setHREmployeeStatus(request.getParameter("HREmployeeStatus"));
            objEmployeesInfo.setHREmployeeDesc(request.getParameter("HREmployeeDecs"));
            objEmployeesInfo.setHREmployeeIDNumber(request.getParameter("HREmployeeIDNumber"));
            objEmployeesInfo.setHREmployeeCardNumber(request.getParameter("HREmployeeCardNumber"));
            objEmployeesInfo.setHREmployeeTaxNumber(request.getParameter("HREmployeeTaxNumber"));
            objEmployeesInfo.setHREmployeeTel1(request.getParameter("HREmployeeTel1"));
            objEmployeesInfo.setHREmployeeEmail(request.getParameter("HREmployeeEmail"));
            objEmployeesInfo.setHREmployeeContactAddress(request.getParameter("HREmployeeContactAddress"));
            objEmployeesInfo.setHREmployeeContactAddressCity(request.getParameter("HREmployeeContactAddressCity"));
            objEmployeesInfo.setHREmployeeContactAddressCountry(request.getParameter("HREmployeeContactAddressCountry"));
            HREmployeesInfo objHREmployeesInfo = objEmployeesController.Update(objEmployeesInfo);
            if (objHREmployeesInfo != null) {
                request.setAttribute("Employee", objHREmployeesInfo);
                request.setAttribute("Complete", "Cập nhật thông tin thành công!");
            } else {
                request.setAttribute("Employee", objEmployeesInfo);
                request.setAttribute("Error", "Cập nhật thông tin không thành công!");
            }
            request.getRequestDispatcher("Admin/admin_Home.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }
}
