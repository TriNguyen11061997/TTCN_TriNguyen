/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Info.ADUsersInfo;
import Info.ARCustomersInfo;
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
public class ARCustomersController {

    Connection conn;
    PreparedStatement sttm;
    ResultSet rs;

    public ARCustomersController() {
        conn = ConnectionPool.getConnection();
    }

    public List<ARCustomersInfo> GetALlObject() throws SQLException {
        List<ARCustomersInfo> listARCustomersInfos = new ArrayList<>();
        sttm = conn.prepareCall("CALL ARCustomers_GetALLObject()");
        rs = sttm.executeQuery();
        ARCustomersInfo objARCustomersInfo;
        while (rs.next()) {
            objARCustomersInfo = new ARCustomersInfo();
            objARCustomersInfo.setARCustomerID(rs.getInt("ARCustomerID"));
            objARCustomersInfo.setARCustomerName(rs.getString("ARCustomerName"));
            objARCustomersInfo.setARCustomerNo(rs.getString("ARCustomerNo"));
            objARCustomersInfo.setARCustomerBirthDay(rs.getDate("ARCustomerBirthDay"));
            objARCustomersInfo.setARCustomerTel1(rs.getString("ARCustomerTel1"));
            objARCustomersInfo.setARCustomerEmail(rs.getString("ARCustomerEmail"));
            objARCustomersInfo.setARCustomerContactAddress(rs.getString("ARCustomerContactAddress"));
            objARCustomersInfo.setARCustomerContactAddressCity(rs.getString("ARCustomerContactAddressCity"));
            listARCustomersInfos.add(objARCustomersInfo);
        }
        return listARCustomersInfos;
    }

    public boolean CreateAccount(String user, String password, ARCustomersInfo arc) {
        ADUsersInfo objADUsersInfo = new ADUsersInfo();
        try {
            sttm = conn.prepareCall("CALL ADUsers_CheckAccount(?, ?)");
            sttm.setString(1, user);
            sttm.setString(2, arc.getARCustomerIDNumber());
            rs = sttm.executeQuery();
            while (rs.next()) {
                return false;
            }

            sttm = conn.prepareCall("CALL ARCustomesr_Add(?, ?, ?, ?, ?, ?, ?)");
            sttm.setString(1, arc.getARCustomerName());
            sttm.setString(2, arc.getARCustomerTel1());
            sttm.setString(3, arc.getARCustomerEmail());
            sttm.setString(4, arc.getARCustomerIDNumber());
            sttm.setString(5, arc.getARCustomerContactAddress());
            sttm.setString(6, arc.getARCustomerContactAddressCity());
            sttm.setString(7, arc.getARCustomerContactAddressCountry());
            if (sttm.execute()) {
                return false;
            }

            sttm = conn.prepareCall("CALL CreateAccount(?, ?, ?)");
            sttm.setString(1, user);
            sttm.setString(2, password);
            sttm.setString(3, arc.getARCustomerIDNumber());
            if (sttm.execute()) {
                conn.close();
                return false;
            }
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(ARCustomersController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
