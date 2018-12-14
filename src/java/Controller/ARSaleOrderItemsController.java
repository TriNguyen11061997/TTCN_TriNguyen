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

/**
 *
 * @author Trí Nguyễn
 */
public class ARSaleOrderItemsController {
    
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    
    public ARSaleOrderItemsController() {
        conn = ConnectionPool.getConnection();
    }
    
    public List<ARSaleOrderItemsInfo> GetObjectBySaleOrderID(int saleOrderID) throws SQLException {
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
            listSaleOrderItem.add(objARSaleOrderItemsInfo);
        }
        return listSaleOrderItem;
    }
    
}
