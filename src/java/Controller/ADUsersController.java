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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Trí Nguyễn
 */
public class ADUsersController {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public ADUsersController() {
    }

    public void GetObjectByID() {

    }

    public ADUsersInfo GetObjectByNameAndPassword(String name, String pass) throws SQLException {
        conn = ConnectionPool.getConnection();
        ADUsersInfo objADUsersInfo = new ADUsersInfo();
        ps = conn.prepareCall("Call ADUsers_GetObjectByNameAnhPassword(?,?)");
        ps.setString(1, name);
        ps.setString(2, pass);
        rs = ps.executeQuery();
        while (rs.next()) {
            objADUsersInfo.setADUserID(rs.getInt("ADUserID"));
            objADUsersInfo.setADUserName(rs.getString("ADUserName"));
            objADUsersInfo.setFK_HREmployeeID(rs.getInt("FK_HREmployeeID"));
            objADUsersInfo.setFK_ADUserGroupID(rs.getInt("FK_ADUserGroupID"));
            if (objADUsersInfo != null) {
                conn.close();
                return objADUsersInfo;
            }
        }
        conn.close();
        return null;
    }

    public List<ADUsersInfo> GetAllObject() throws SQLException {
        List<ADUsersInfo> list = new ArrayList<>();
        conn = ConnectionPool.getConnection();
        ADUsersInfo objADUsersInfo;
        ps = conn.prepareCall("CALL ADUser_GetAllObject()");
        rs = ps.executeQuery();
        while (rs.next()) {
            objADUsersInfo = new ADUsersInfo();
            objADUsersInfo.setADUserID(rs.getInt("ADUserID"));
            objADUsersInfo.setADUserName(rs.getString("ADUserName"));
            objADUsersInfo.setFK_HREmployeeID(rs.getInt("FK_HREmployeeID"));
            objADUsersInfo.setFK_ADUserGroupID(rs.getInt("FK_ADUserGroupID"));
            objADUsersInfo.setMa(rs.getString("ma"));
            objADUsersInfo.setTen(rs.getString("ten"));
            objADUsersInfo.setUserGroup(rs.getString("userGroup"));
            list.add(objADUsersInfo);
        }
        return list;
    }

    public boolean Insert(ADUsersInfo objADUsersInfo) throws SQLException {
        conn = ConnectionPool.getConnection();
        ps = conn.prepareCall("Call ADUsers_Insert(?,?,?,?)");
        ps.setInt(1, objADUsersInfo.getFK_HREmployeeID());
        ps.setInt(2, objADUsersInfo.getFK_ADUserGroupID());
        ps.setString(3, objADUsersInfo.getADUserName());
        ps.setString(4, objADUsersInfo.getADPassword());
        rs = ps.executeQuery();
        conn.close();
        return true;
    }
}
