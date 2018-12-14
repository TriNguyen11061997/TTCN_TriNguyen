/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Info.ARCustomersInfo;
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
        conn.close();
        return listARCustomersInfos;
    }
}
