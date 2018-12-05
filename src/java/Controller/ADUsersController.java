/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Info.ADUsersInfo;
import Util.ConnectionPool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Trí Nguyễn
 */
public class ADUsersController {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public ADUsersController() {
        conn = ConnectionPool.getConnection();
    }

    public void GetObjectByID() {

    }

    public ADUsersInfo GetObjectByNameAndPassword(String name, String pass) throws SQLException {
        ADUsersInfo objADUsersInfo = new ADUsersInfo();
        ps = conn.prepareCall("Call ADUsers_GetObjectByNameAnhPassword(?,?)");
        ps.setString(1, name);
        ps.setString(2, pass);
        rs = ps.executeQuery();
        while (rs.next()) {
            objADUsersInfo.setADUserName(rs.getString("ADUserName"));
            objADUsersInfo.setFK_HREmployeeID(rs.getInt("FK_HREmployeeID"));
            objADUsersInfo.setFK_ADUserGroupID(rs.getInt("FK_ADUserGroupID"));
            if(objADUsersInfo != null){
                return objADUsersInfo;
            }
        }
        return null;
    }
}
