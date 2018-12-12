/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Info.ARCustomersInfo;
import Info.ARSaleOrdersInfo;
import Info.HREmployeesInfo;
import Util.ConnectionPool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Trí Nguyễn
 */
public class ARSaleOrdersController {

    Connection conn;
    PreparedStatement sttm;
    ResultSet rs;

    public ARSaleOrdersController() {
        conn = ConnectionPool.getConnection();
    }

    public List<ARSaleOrdersInfo> GetAllObjectForEmployee() throws SQLException {
        List<ARSaleOrdersInfo> listSaleOrder = new ArrayList<>();
        sttm = conn.prepareCall("Call ARSaleOrders_GetAllObjectForEmployee()");
        rs = sttm.executeQuery();
        ARSaleOrdersInfo objARSaleOrdersInfo;
        while (rs.next()) {
            objARSaleOrdersInfo = new ARSaleOrdersInfo();
            objARSaleOrdersInfo.setARSaleOrderID(rs.getInt("ARSaleOrderID"));
            objARSaleOrdersInfo.setARSaleOrderDate(rs.getDate("ARSaleOrderDate"));
            objARSaleOrdersInfo.setARSaleOrderNo(rs.getString("ARSaleOrderNo"));
            objARSaleOrdersInfo.setARSaleOrderName(rs.getString("ARSaleOrderName"));
            listSaleOrder.add(objARSaleOrdersInfo);
        }
        conn.close();
        return listSaleOrder;
    }

    public List<ARSaleOrdersInfo> GetAllObjectForAdmin() throws SQLException {
        List<ARSaleOrdersInfo> listSaleOrder = new ArrayList<>();
        sttm = conn.prepareCall("Call ARSaleOrders_GetAllObjectForAdmin()");
        rs = sttm.executeQuery();
        ARSaleOrdersInfo objARSaleOrdersInfo;
        while (rs.next()) {
            objARSaleOrdersInfo = new ARSaleOrdersInfo();
            objARSaleOrdersInfo.setARSaleOrderID(rs.getInt("ARSaleOrderID"));
            objARSaleOrdersInfo.setARSaleOrderDate(rs.getDate("ARSaleOrderDate"));
            objARSaleOrdersInfo.setARSaleOrderNo(rs.getString("ARSaleOrderNo"));
            objARSaleOrdersInfo.setARSaleOrderName(rs.getString("ARSaleOrderName"));
            objARSaleOrdersInfo.setARSaleOrderTotalAmount(rs.getDouble("ARSaleOrderTotalAmount"));
            objARSaleOrdersInfo.setARSaleOrderStatus(rs.getString("ARSaleOrderStatus"));
            objARSaleOrdersInfo.setARSaleOrderDesc(rs.getString("ARSaleOrderDesc"));
            ARCustomersInfo objARCustomersInfo = new ARCustomersInfo();
            objARCustomersInfo.setARCustomerName(rs.getString("ARCustomerName"));
            objARSaleOrdersInfo.setCustomer(objARCustomersInfo);
            HREmployeesInfo objEmployeesInfo = new HREmployeesInfo();
            objEmployeesInfo.setHREmployeeName(rs.getString("HREmployeeName"));
            objARSaleOrdersInfo.setEmployee(objEmployeesInfo);
            listSaleOrder.add(objARSaleOrdersInfo);
        }
        conn.close();
        return listSaleOrder;
    }
}
