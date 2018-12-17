/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Info.ARCustomersInfo;
import Info.ARInvoicesInfo;
import Info.ARSaleOrdersInfo;
import Info.HREmployeesInfo;
import Util.ConnectionPool;
import java.sql.Connection;
import java.sql.Date;
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
public class ARInvoicesController {

    Connection conn;
    PreparedStatement sttm;
    ResultSet rs;

    public ARInvoicesController() {       
    }

    public List<ARInvoicesInfo> GetAllObject() throws SQLException {
        conn = ConnectionPool.getConnection();
        List<ARInvoicesInfo> listInvoice = new ArrayList<>();
        sttm = conn.prepareCall("Call ARInvoices_GetAllObject()");
        rs = sttm.executeQuery();
        ARInvoicesInfo objARInvoicesInfo;
        while (rs.next()) {
            objARInvoicesInfo = new ARInvoicesInfo();
            objARInvoicesInfo.setARInvoiceID(rs.getInt("ARInvoiceID"));
            objARInvoicesInfo.setARInvoiceDate(rs.getDate("ARInvoiceDate"));
            objARInvoicesInfo.setARInvoiceNo(rs.getString("ARInvoiceNo"));
            objARInvoicesInfo.setARInvoiceName(rs.getString("ARInvoiceName"));
            objARInvoicesInfo.setARInvoiceTotalAmount(rs.getDouble("ARInvoiceTotalAmount"));
            objARInvoicesInfo.setARInvoiceStatus(rs.getString("ARInvoiceStatus"));
            objARInvoicesInfo.setARInvoiceDesc(rs.getString("ARInvoiceDesc"));
            ARCustomersInfo objARCustomersInfo = new ARCustomersInfo();
            objARCustomersInfo.setARCustomerName(rs.getString("ARCustomerName"));
            objARInvoicesInfo.setCustomer(objARCustomersInfo);
            HREmployeesInfo objEmployeesInfo = new HREmployeesInfo();
            objEmployeesInfo.setHREmployeeName(rs.getString("HREmployeeName"));
            objARInvoicesInfo.setEmployee(objEmployeesInfo);
            ARSaleOrdersInfo obARSaleOrdersInfo = new ARSaleOrdersInfo();
            obARSaleOrdersInfo.setARSaleOrderNo(rs.getString("ARSaleOrderNo"));
            objARInvoicesInfo.setSaleorder(obARSaleOrdersInfo);
            listInvoice.add(objARInvoicesInfo);
        }
        conn.close();
        return listInvoice;
    }

    public ARInvoicesInfo GetObjectByID(int ID) throws SQLException {
        conn = ConnectionPool.getConnection();
        sttm = conn.prepareCall("Call ARInvoices_GetObjectByID(?)");
        sttm.setInt(1, ID);
        rs = sttm.executeQuery();
        ARInvoicesInfo objARInvoicesInfo;
        while (rs.next()) {
            objARInvoicesInfo = new ARInvoicesInfo();
            objARInvoicesInfo.setARInvoiceID(rs.getInt("ARInvoiceID"));
            objARInvoicesInfo.setARInvoiceDate(rs.getDate("ARInvoiceDate"));
            objARInvoicesInfo.setARInvoiceNo(rs.getString("ARInvoiceNo"));
            objARInvoicesInfo.setARInvoiceName(rs.getString("ARInvoiceName"));
            objARInvoicesInfo.setARInvoiceFeeShipment(rs.getDouble("ARInvoiceFeeShipment"));
            objARInvoicesInfo.setARInvoiceTotalAmount(rs.getDouble("ARInvoiceTotalAmount"));
            objARInvoicesInfo.setARInvoiceDiscountAmount(rs.getDouble("ARInvoiceDiscountAmount"));
            objARInvoicesInfo.setARInvoiceStatus(rs.getString("ARInvoiceStatus"));
            objARInvoicesInfo.setARInvoiceDesc(rs.getString("ARInvoiceDesc"));
            ARCustomersInfo objARCustomersInfo = new ARCustomersInfo();
            objARCustomersInfo.setARCustomerName(rs.getString("ARCustomerName"));
            objARCustomersInfo.setARCustomerTel1(rs.getString("ARCustomerTel1"));
            objARCustomersInfo.setARCustomerEmail(rs.getString("ARCustomerEmail"));
            objARCustomersInfo.setARCustomerContactAddress(rs.getString("ARCustomerContactAddress"));
            objARCustomersInfo.setARCustomerContactAddressCity(rs.getString("ARCustomerContactAddressCity"));
            objARCustomersInfo.setARCustomerContactAddressCountry(rs.getString("ARCustomerContactAddressCountry"));
            objARInvoicesInfo.setCustomer(objARCustomersInfo);
            HREmployeesInfo objEmployeesInfo = new HREmployeesInfo();
            objEmployeesInfo.setHREmployeeName(rs.getString("HREmployeeName"));
            objARInvoicesInfo.setEmployee(objEmployeesInfo);
            ARSaleOrdersInfo obARSaleOrdersInfo = new ARSaleOrdersInfo();
            obARSaleOrdersInfo.setARSaleOrderNo(rs.getString("ARSaleOrderNo"));
            obARSaleOrdersInfo.setARSaleOrderID(Integer.parseInt(rs.getString("ARSaleOrderID")));
            obARSaleOrdersInfo.setARSaleOrderPaymentMethod(rs.getString("ARSaleOrderPaymentMethod"));
            obARSaleOrdersInfo.setARSaleOrderPaymentStatus(rs.getString("ARSaleOrderPaymentStatus"));
            objARInvoicesInfo.setSaleorder(obARSaleOrdersInfo);
            return objARInvoicesInfo;
        }
        conn.close();
        return null;
    }

    public boolean Insert(int SaleOrderID) throws SQLException{  
        ARSaleOrdersController objARSaleOrdersController = new ARSaleOrdersController();
        ARSaleOrdersInfo objARSaleOrdersInfo = objARSaleOrdersController.GetObjectByID(SaleOrderID);
        if (objARSaleOrdersInfo != null) {
            try {
                ARInvoicesInfo objARInvoicesInfo = new ARInvoicesInfo();
                objARInvoicesInfo.setARInvoiceDate(new Date(System.currentTimeMillis()));
                objARInvoicesInfo.setARInvoiceDesc(objARSaleOrdersInfo.getARSaleOrderDesc());
                objARInvoicesInfo.setARInvoiceName(objARSaleOrdersInfo.getARSaleOrderName());
                objARInvoicesInfo.setFK_ARCustomersID(objARSaleOrdersInfo.getFK_ARCustomerID());
                objARInvoicesInfo.setFK_ARSaleOrderID(SaleOrderID);
                objARInvoicesInfo.setFK_HREmployeeID(objARSaleOrdersInfo.getFK_HREmployeeID());
                objARInvoicesInfo.setARInvoiceDiscountAmount(objARSaleOrdersInfo.getARSaleOrderDiscountAmount());
                objARInvoicesInfo.setARInvoiceFeeShipment(objARSaleOrdersInfo.getARSaleOrderShippingFees());
                objARInvoicesInfo.setARInvoiceTotalAmount(objARSaleOrdersInfo.getARSaleOrderTotalAmount());
                conn = ConnectionPool.getConnection();
                sttm = conn.prepareCall("Call ARInvoices_Insert(?,?,?,?,?,?,?,?,?)");
                sttm.setDate(1, objARInvoicesInfo.getARInvoiceDate());
                sttm.setString(2, objARInvoicesInfo.getARInvoiceName());
                sttm.setString(3, objARInvoicesInfo.getARInvoiceDesc());
                sttm.setInt(4, objARInvoicesInfo.getFK_ARCustomersID());
                sttm.setInt(5, objARInvoicesInfo.getFK_ARSaleOrderID());
                sttm.setInt(6, objARInvoicesInfo.getFK_HREmployeeID());
                sttm.setDouble(7, objARInvoicesInfo.getARInvoiceDiscountAmount());
                sttm.setDouble(8, objARInvoicesInfo.getARInvoiceFeeShipment());
                sttm.setDouble(9, objARInvoicesInfo.getARInvoiceTotalAmount());
                sttm.executeQuery();
                return true;
            } catch (SQLException ex) {
                System.out.println(ex.toString());
                return false;
            }
        } else {
            return false;
        }
    }
}
