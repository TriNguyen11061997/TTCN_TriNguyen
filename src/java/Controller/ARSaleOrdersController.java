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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Trí Nguyễn
 */
public class ARSaleOrdersController {

    Connection conn;
    PreparedStatement sttm;
    ResultSet rs;

    public ARSaleOrdersController() {

    }

    public List<ARSaleOrdersInfo> GetAllObjectForEmployee() throws SQLException {
        conn = ConnectionPool.getConnection();
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
        return listSaleOrder;
    }

    public List<ARSaleOrdersInfo> GetAllObjectForAdmin() throws SQLException {
        conn = ConnectionPool.getConnection();
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
        return listSaleOrder;
    }

    public ARSaleOrdersInfo GetObjectByID(int saleOrderID) throws SQLException {
        conn = ConnectionPool.getConnection();
        sttm = conn.prepareCall("Call ARSaleOrders_GetObjectByID(?)");
        sttm.setInt(1, saleOrderID);
        rs = sttm.executeQuery();
        ARSaleOrdersInfo objARSaleOrdersInfo;
        while (rs.next()) {
            objARSaleOrdersInfo = new ARSaleOrdersInfo();
            objARSaleOrdersInfo.setARSaleOrderID(rs.getInt("ARSaleOrderID"));
            objARSaleOrdersInfo.setFK_ARCustomerID(rs.getInt("FK_ARCustomerID"));
            objARSaleOrdersInfo.setFK_HREmployeeID(rs.getInt("FK_HREmployeeID"));
            objARSaleOrdersInfo.setARSaleOrderDate(rs.getDate("ARSaleOrderDate"));
            objARSaleOrdersInfo.setARSaleOrderNo(rs.getString("ARSaleOrderNo"));
            objARSaleOrdersInfo.setARSaleOrderName(rs.getString("ARSaleOrderName"));
            objARSaleOrdersInfo.setARSaleOrderTotalAmount(rs.getDouble("ARSaleOrderTotalAmount"));
            objARSaleOrdersInfo.setARSaleOrderStatus(rs.getString("ARSaleOrderStatus"));
            objARSaleOrdersInfo.setARSaleOrderDesc(rs.getString("ARSaleOrderDesc"));
            objARSaleOrdersInfo.setARSaleOrderDiscountAmount(rs.getDouble("ARSaleOrderDiscountAmount"));
            objARSaleOrdersInfo.setARSaleOrderDiscountPerCent(rs.getDouble("ARSaleOrderDiscountPerCent"));
            objARSaleOrdersInfo.setARSaleOrderTaxPercent(rs.getDouble("ARSaleOrderTaxPercent"));
            objARSaleOrdersInfo.setARSaleOrderTaxAmount(rs.getDouble("ARSaleOrderTaxAmount"));
            objARSaleOrdersInfo.setARSaleOrderShippingFees(rs.getDouble("ARSaleOrderShippingFees"));
            objARSaleOrdersInfo.setARSaleOrderPaymentMethod(rs.getString("ARSaleOrderPaymentMethod"));
            objARSaleOrdersInfo.setARSaleOrderPaymentStatus(rs.getString("ARSaleOrderPaymentStatus"));
            ARCustomersInfo objARCustomersInfo = new ARCustomersInfo();
            objARCustomersInfo.setARCustomerName(rs.getString("ARCustomerName"));
            objARCustomersInfo.setARCustomerTel1(rs.getString("ARCustomerTel1"));
            objARCustomersInfo.setARCustomerEmail(rs.getString("ARCustomerEmail"));
            objARCustomersInfo.setARCustomerContactAddress(rs.getString("ARCustomerContactAddress"));
            objARCustomersInfo.setARCustomerContactAddressCity(rs.getString("ARCustomerContactAddressCity"));
            objARCustomersInfo.setARCustomerContactAddressCountry(rs.getString("ARCustomerContactAddressCountry"));
            objARSaleOrdersInfo.setCustomer(objARCustomersInfo);
            HREmployeesInfo objEmployeesInfo = new HREmployeesInfo();
            objEmployeesInfo.setHREmployeeName(rs.getString("HREmployeeName"));
            objARSaleOrdersInfo.setEmployee(objEmployeesInfo);
            return objARSaleOrdersInfo;
        }
        return null;
    }

    public boolean Update(ARSaleOrdersInfo objARSaleOrdersInfo) {
        conn = ConnectionPool.getConnection();
        try {
            sttm = conn.prepareCall("Call ARSaleOrders_Update(?,?,?,?,?)");
            sttm.setInt(1, objARSaleOrdersInfo.getARSaleOrderID());
            sttm.setString(2, objARSaleOrdersInfo.getARSaleOrderStatus());
            sttm.setString(3, objARSaleOrdersInfo.getARSaleOrderPaymentStatus());
            sttm.setDouble(4, objARSaleOrdersInfo.getARSaleOrderShippingFees());
            sttm.setInt(5, objARSaleOrdersInfo.getFK_HREmployeeID());
            rs = sttm.executeQuery();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public boolean AdminUpdate(ARSaleOrdersInfo objARSaleOrdersInfo) {
        conn = ConnectionPool.getConnection();
        try {
            sttm = conn.prepareCall("Call ARSaleOrders_AdminUpdate(?,?,?,?)");
            sttm.setInt(1, objARSaleOrdersInfo.getARSaleOrderID());
            sttm.setString(2, objARSaleOrdersInfo.getARSaleOrderStatus());
            sttm.setString(3, objARSaleOrdersInfo.getARSaleOrderPaymentStatus());
            sttm.setDouble(4, objARSaleOrdersInfo.getARSaleOrderShippingFees());
            rs = sttm.executeQuery();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public boolean UpdateComplete(int ID) {
        conn = ConnectionPool.getConnection();
        try {
            sttm = conn.prepareCall("Call ARSaleOrders_UpdateStatus(?,?)");
            sttm.setInt(1, ID);
            sttm.setString(2, "Complete");
            rs = sttm.executeQuery();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
     public boolean UpdateStatus(int ID,String status) {
        conn = ConnectionPool.getConnection();
        try {
            sttm = conn.prepareCall("Call ARSaleOrders_UpdateStatus(?,?)");
            sttm.setInt(1, ID);      
            sttm.setString(2, status);
            rs = sttm.executeQuery();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public List<ARSaleOrdersInfo> GetObjectForInvoice() throws SQLException {
        conn = ConnectionPool.getConnection();
        List<ARSaleOrdersInfo> listSaleOrder = new ArrayList<>();
        sttm = conn.prepareCall("Call ARSaleOrders_GetObjectForInvoice()");
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
            listSaleOrder.add(objARSaleOrdersInfo);
        }
        return listSaleOrder;
    }

    public List<ARSaleOrdersInfo> GetObjectForRevenue(int t, int n) throws SQLException {
        conn = ConnectionPool.getConnection();
        List<ARSaleOrdersInfo> listSaleOrder = new ArrayList<>();
        if (t == 0 && n != 0) {
            sttm = conn.prepareCall("Call ARSaleOrders_GetAllObjectForRevenueByYear(?)");
            sttm.setInt(1, n);
        } else if (n == 0 && t != 0) {
            sttm = conn.prepareCall("Call ARSaleOrders_GetAllObjectForRevenueByMonth(?)");
            sttm.setInt(1, t);
        } else if (t == 0 && n == 0) {
            sttm = conn.prepareCall("Call ARSaleOrders_GetAllObjectForRevenue()");
        } else {
            sttm = conn.prepareCall("Call ARSaleOrders_GetAllObjectForRevenueByMonthAndYear(?,?)");
            sttm.setInt(1, t);
            sttm.setInt(2, n);
        }
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
            listSaleOrder.add(objARSaleOrdersInfo);
        }
        return listSaleOrder;
    }
}
