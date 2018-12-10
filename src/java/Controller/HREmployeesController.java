/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Info.ARCustomersInfo;
import Info.HREmployeesInfo;
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
public class HREmployeesController {

    Connection conn;
    PreparedStatement sttm;
    ResultSet rs;

    public HREmployeesController() {
        conn = ConnectionPool.getConnection();
    }

    public List<HREmployeesInfo> GetALlObject() throws SQLException {
        List<HREmployeesInfo> listHREmployeesInfos = new ArrayList<>();
        sttm = conn.prepareCall("CALL HREmployees_GetAllObject()");
        rs = sttm.executeQuery();
        HREmployeesInfo objHREmployeesInfo;
        while (rs.next()) {
            objHREmployeesInfo = new HREmployeesInfo();
            objHREmployeesInfo.setHREmployeeID(rs.getInt("HREmployeeID"));
            objHREmployeesInfo.setHREmployeeName(rs.getString("HREmployeeName"));
            objHREmployeesInfo.setHREmployeeNo(rs.getString("HREmployeeNo"));
            objHREmployeesInfo.setHREmployeeBirthDay(rs.getDate("HREmployeeBirthDay"));
            objHREmployeesInfo.setHREmployeeCardNumber(rs.getString("HREmployeeCardNumber"));
            objHREmployeesInfo.setHREmployeeTel1(rs.getString("HREmployeeTel1"));
            objHREmployeesInfo.setHREmployeeContactAddress(rs.getString("HREmployeeContactAddress"));
            objHREmployeesInfo.setHREmployeeContactAddressCity(rs.getString("HREmployeeContactAddressCity"));
            objHREmployeesInfo.setHREmployeeContactAddressCountry(rs.getString("HREmployeeContactAddressCountry"));
            objHREmployeesInfo.setHREmployeeStatus(rs.getString("HREmployeeStatus"));
            listHREmployeesInfos.add(objHREmployeesInfo);
        }
        conn.close();
        return listHREmployeesInfos;
    }
    public HREmployeesInfo GetObjectByID(int ID) throws SQLException{
        List<HREmployeesInfo> listHREmployeesInfos = new ArrayList<>();
        sttm = conn.prepareCall("CALL HREmployees_GetObjectByID(?)");
        sttm.setInt(1, ID);
        rs = sttm.executeQuery();
        HREmployeesInfo objHREmployeesInfo;
        while (rs.next()) {
            objHREmployeesInfo = new HREmployeesInfo();
            objHREmployeesInfo.setHREmployeeID(rs.getInt("HREmployeeID"));
            objHREmployeesInfo.setHREmployeeName(rs.getString("HREmployeeName"));
            objHREmployeesInfo.setHREmployeeNo(rs.getString("HREmployeeNo"));
            objHREmployeesInfo.setHREmployeeBirthDay(rs.getDate("HREmployeeBirthDay"));
            objHREmployeesInfo.setHREmployeeCardNumber(rs.getString("HREmployeeCardNumber"));
            objHREmployeesInfo.setHREmployeeTel1(rs.getString("HREmployeeTel1"));
            objHREmployeesInfo.setHREmployeeContactAddress(rs.getString("HREmployeeContactAddress"));
            objHREmployeesInfo.setHREmployeeContactAddressCity(rs.getString("HREmployeeContactAddressCity"));
            objHREmployeesInfo.setHREmployeeContactAddressCountry(rs.getString("HREmployeeContactAddressCountry"));
            objHREmployeesInfo.setHREmployeeStatus(rs.getString("HREmployeeStatus"));
            return objHREmployeesInfo;
        }
        conn.close();
        return null;
    }
    public boolean Update(HREmployeesInfo objEmployeesInfo){
        
        return  false;
    }
}
