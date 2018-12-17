package Servlet;

import Controller.ARSaleOrdersController;
import Info.ARSaleOrdersInfo;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
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
public class Admin_Revenue_Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            response.setContentType("text/html; charset=UTF-8");
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            ARSaleOrdersController objARSaleOrdersController = new ARSaleOrdersController();
            int thang = 0;
            int nam = 0;
            double sumMoney = 0;
            if (request.getParameter("month") == null && request.getParameter("year") != null) {
                nam = Integer.parseInt(request.getParameter("year"));
            } else if (request.getParameter("year") == null && request.getParameter("month") != null) {
                thang = Integer.parseInt(request.getParameter("month"));
            } else if (request.getParameter("month") == null && request.getParameter("year") == null) {
                thang = 0;
                nam = 0;
            } else if (request.getParameter("month") != null && request.getParameter("year") != null) {
                nam = Integer.parseInt(request.getParameter("year"));
                thang = Integer.parseInt(request.getParameter("month"));
            } else {
                thang = 0;
                nam = 0;
            }
            List<ARSaleOrdersInfo> listSaleOrder;
            listSaleOrder = objARSaleOrdersController.GetObjectForRevenue(thang, nam);
            for (ARSaleOrdersInfo objARSaleOrdersInfo : listSaleOrder) {
                sumMoney += objARSaleOrdersInfo.getARSaleOrderTotalAmount();
            }
            request.setAttribute("sum", sumMoney);
            request.setAttribute("listSaleOrder", listSaleOrder);
            request.getRequestDispatcher("Admin/admin_Revenue.jsp").include(request, response);

        } catch (SQLException ex) {
            request.getRequestDispatcher("Admin/admin_Home.jsp").include(request, response);
        }
    }

}
