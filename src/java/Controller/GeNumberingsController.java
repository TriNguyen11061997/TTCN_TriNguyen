/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Info.GENumberingsInfo;
import Util.ConnectionPool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Trí Nguyễn
 */
public class GeNumberingsController {

    Connection conn;
    PreparedStatement sttm;
    ResultSet rs;

    public String GetNo(String table) {
        try {
            conn = ConnectionPool.getConnection();
            sttm = conn.prepareCall("Call GENumberings_GetObjectByTableName(?)");
            sttm.setString(1, table);
            rs = sttm.executeQuery();
            GENumberingsInfo objNumberingsInfo = new GENumberingsInfo();
            while (rs.next()) {
                objNumberingsInfo.setGENumberingName(rs.getString("GENumberingName"));
                objNumberingsInfo.setGENumberingNumber(rs.getInt("GENumberingNumber"));
                break;
            }
            String no = objNumberingsInfo.getGENumberingName() + objNumberingsInfo.getGENumberingNumber();
            return no;
        } catch (SQLException ex) {
            return null;
        }
    }

    public void Update(String table) {
        try {
            conn = ConnectionPool.getConnection();
            sttm = conn.prepareCall("Call GENumberings_Update(?)");
            sttm.setString(1, table);
            sttm.executeQuery();
        } catch (SQLException ex) {
            
        }
    }
}
