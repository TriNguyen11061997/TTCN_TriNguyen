/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Info.ARSaleOrderItemsInfo;
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
public class ARSaleOrderItemsController {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public ARSaleOrderItemsController() {
    }

    public List<ARSaleOrderItemsInfo> GetObjectBySaleOrderID(int saleOrderID) throws SQLException {
        conn = ConnectionPool.getConnection();
        List<ARSaleOrderItemsInfo> listSaleOrderItem = new ArrayList<>();
        ps = conn.prepareCall("CALL ARSaleOrderItems_GetObjectBySaleOrderID(?)");
        ps.setInt(1, saleOrderID);
        rs = ps.executeQuery();
        ARSaleOrderItemsInfo objARSaleOrderItemsInfo;
        while (rs.next()) {
            objARSaleOrderItemsInfo = new ARSaleOrderItemsInfo();
            objARSaleOrderItemsInfo.setARSaleOrderItemName(rs.getString("ARSaleOrderItemName"));
            objARSaleOrderItemsInfo.setARSaleOrderItemDesc(rs.getString("ARSaleOrderItemDesc"));
            objARSaleOrderItemsInfo.setARSaleOrderItemTotalAmount(rs.getDouble("ARSaleOrderItemTotalAmount"));
            objARSaleOrderItemsInfo.setARSaleOrderItemQty(rs.getDouble("ARSaleOrderItemQty"));
            objARSaleOrderItemsInfo.setARSaleOrderItemUnitCost(rs.getDouble("ARSaleOrderItemUnitCost"));
            objARSaleOrderItemsInfo.setPicture(rs.getString("picture"));
            listSaleOrderItem.add(objARSaleOrderItemsInfo);
        }
        conn.close();
        return listSaleOrderItem;
    }

    public boolean Insert(ARSaleOrderItemsInfo objSaleOrderItemsInfo) {
        try {
            conn = ConnectionPool.getConnection();
            ps = conn.prepareCall("CALL ARSaleOrderItems_Insert(?,?,?,?,?,?)");
            ps.setInt(1, objSaleOrderItemsInfo.getFK_ICProductID());
            ps.setString(2, objSaleOrderItemsInfo.getARSaleOrderItemName());
            ps.setString(3, objSaleOrderItemsInfo.getARSaleOrderItemDesc());
            ps.setDouble(4, objSaleOrderItemsInfo.getARSaleOrderItemQty());
            ps.setDouble(5, objSaleOrderItemsInfo.getARSaleOrderItemUnitCost());
            ps.setDouble(6, objSaleOrderItemsInfo.getARSaleOrderItemTotalAmount());
            rs = ps.executeQuery();
            conn.close();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

}
