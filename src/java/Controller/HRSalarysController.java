/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Info.HREmployeesInfo;
import Info.HRSalarysInfo;
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
public class HRSalarysController {

    Connection conn;
    PreparedStatement sttm;
    ResultSet rs;

    public List<HRSalarysInfo> GetAllObject() throws SQLException {
        conn = ConnectionPool.getConnection();
        sttm = conn.prepareCall("CALL HRSalarys_GetAllObject()");
        rs = sttm.executeQuery();
        List<HRSalarysInfo> list = new ArrayList<>();
        HRSalarysInfo objHRSalarysInfo;
        while (rs.next()) {
            objHRSalarysInfo = new HRSalarysInfo();
            objHRSalarysInfo.setHRSalaryID(rs.getInt("HRSalaryID"));
            objHRSalarysInfo.setFK_HREmployeeID(rs.getInt("FK_HREmployeeID"));
            objHRSalarysInfo.setHRSalaryMonth(rs.getInt("HRSalaryMonth"));
            objHRSalarysInfo.setHRSalaryYear(rs.getInt("HRSalaryYear"));
            objHRSalarysInfo.setHRSalaryQty(rs.getDouble("HRSalaryQty"));
            objHRSalarysInfo.setHRSalaryBonus(rs.getDouble("HRSalaryBonus"));
            objHRSalarysInfo.setHRSalaryBasic(rs.getDouble("HRSalaryBasic"));
            objHRSalarysInfo.setHRSalaryToTal(rs.getDouble("HRSalaryToTal"));
            objHRSalarysInfo.setHRSalaryReduce(rs.getDouble("HRSalaryReduce"));
            HREmployeesInfo objEmployeesInfo = new HREmployeesInfo();
            objEmployeesInfo.setHREmployeeNo(rs.getString("HREmployeeNo"));
            objEmployeesInfo.setHREmployeeName(rs.getString("HREmployeeName"));
            objHRSalarysInfo.setEmployee(objEmployeesInfo);
            list.add(objHRSalarysInfo);
        }
        return list;
    }

    public boolean Insert(HRSalarysInfo objHRSalarysInfo) throws SQLException {
        conn = ConnectionPool.getConnection();
        sttm = conn.prepareCall("CALL HRSalarys_Insert(?,?,?,?,?,?,?,?)");
        sttm.setInt(1, objHRSalarysInfo.getFK_HREmployeeID());
        sttm.setInt(2, objHRSalarysInfo.getHRSalaryMonth());
        sttm.setInt(3, objHRSalarysInfo.getHRSalaryYear());
        sttm.setDouble(4, objHRSalarysInfo.getHRSalaryQty());
        sttm.setDouble(5, objHRSalarysInfo.getHRSalaryBonus());
        sttm.setDouble(6, objHRSalarysInfo.getHRSalaryBasic());
        sttm.setDouble(7, objHRSalarysInfo.getHRSalaryToTal());
        sttm.setDouble(8, objHRSalarysInfo.getHRSalaryReduce());
        sttm.executeQuery();
        return true;
    }
}
