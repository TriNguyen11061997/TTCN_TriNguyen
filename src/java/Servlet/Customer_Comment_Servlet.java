/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Controller.ARCustomersController;
import Info.ARCustomerCommentsInfo;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author KA
 */
@WebServlet(name = "Customer_Comment_Servlet", urlPatterns = {"/Customer_Comment_Servlet"})
public class Customer_Comment_Servlet extends HttpServlet {

    ARCustomersController arc = new ARCustomersController();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        int idProduct = Integer.parseInt(request.getParameter("idpro"));
        int idCus = Integer.parseInt(request.getParameter("idcus"));
        String comment = request.getParameter("ARCustomerCommentDesc");

        if (arc.InsertComment(idProduct, idCus, comment) == true) {

            try {
                //chuyển list comment qua trang chi tiết
                List<ARCustomerCommentsInfo> list = arc.ListComment(idProduct);
                System.out.println("List" + list.size());
                request.setAttribute("listcomment", list);
                RequestDispatcher rd = request.getRequestDispatcher("/preview?id=" + idProduct);
                rd.forward(request, response);

            } catch (SQLException ex) {
                Logger.getLogger(Customer_Comment_Servlet.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

//            RequestDispatcher rd = request.getRequestDispatcher("/Public/about.jsp");
//            rd.forward(request, response);
    }

}
