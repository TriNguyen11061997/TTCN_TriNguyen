/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Info.ARCustomersInfo;
import Info.HREmployeeCommentsInfo;
import Info.HREmployeesInfo;
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
public class HREmployeesController {

    Connection conn;
    PreparedStatement sttm;
    ResultSet rs;

    public HREmployeesController() {

    }

    public List<HREmployeesInfo> GetALlObject() throws SQLException {
        conn = ConnectionPool.getConnection();
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

    public HREmployeesInfo GetObjectByID(int ID) throws SQLException {
        conn = ConnectionPool.getConnection();
        sttm = conn.prepareCall("CALL HREmployees_GetObjectByID(?)");
        sttm.setInt(1, ID);
        rs = sttm.executeQuery();
        HREmployeesInfo objHREmployeesInfo;
        while (rs.next()) {
            objHREmployeesInfo = new HREmployeesInfo();
            objHREmployeesInfo.setHREmployeeID(rs.getInt("HREmployeeID"));
            objHREmployeesInfo.setHREmployeeName(rs.getString("HREmployeeName"));
            objHREmployeesInfo.setHREmployeeGender(rs.getInt("HREmployeeGender"));
            objHREmployeesInfo.setHREmployeeNo(rs.getString("HREmployeeNo"));
            objHREmployeesInfo.setHREmployeeBirthDay(rs.getDate("HREmployeeBirthDay"));
            objHREmployeesInfo.setHREmployeeCardNumber(rs.getString("HREmployeeCardNumber"));
            objHREmployeesInfo.setHREmployeeTel1(rs.getString("HREmployeeTel1"));
            objHREmployeesInfo.setHREmployeeEmail(rs.getString("HREmployeeEmail"));
            objHREmployeesInfo.setHREmployeeContactAddress(rs.getString("HREmployeeContactAddress"));
            objHREmployeesInfo.setHREmployeeContactAddressCity(rs.getString("HREmployeeContactAddressCity"));
            objHREmployeesInfo.setHREmployeeContactAddressCountry(rs.getString("HREmployeeContactAddressCountry"));
            objHREmployeesInfo.setHREmployeeStatus(rs.getString("HREmployeeStatus"));
            objHREmployeesInfo.setHREmployeePicture(rs.getString("HREmployeePicture"));
            objHREmployeesInfo.setHREmployeeDesc(rs.getString("HREmployeeDesc"));
            objHREmployeesInfo.setHREmployeeIDNumber(rs.getString("HREmployeeIDNumber"));
            objHREmployeesInfo.setHREmployeeStartWorkingDate(rs.getDate("HREmployeeStartWorkingDate"));
            objHREmployeesInfo.setHREmployeeEndWorkingDate(rs.getDate("HREmployeeEndWorkingDate"));
            conn.close();
            return objHREmployeesInfo;
        }
        return null;
    }

    public HREmployeesInfo Update(HREmployeesInfo objEmployeesInfo) {
        try {
            conn = ConnectionPool.getConnection();
            sttm = conn.prepareCall("CALL HREmployees_Update(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            sttm.setInt(1, objEmployeesInfo.getHREmployeeID());
            sttm.setString(2, objEmployeesInfo.getHREmployeeName());
            sttm.setInt(3, objEmployeesInfo.getHREmployeeGender());
            sttm.setDate(4, objEmployeesInfo.getHREmployeeBirthDay());
            sttm.setString(5, objEmployeesInfo.getHREmployeeStatus());
            sttm.setString(6, objEmployeesInfo.getHREmployeeDesc());
            sttm.setString(7, objEmployeesInfo.getHREmployeeIDNumber());
            sttm.setString(8, objEmployeesInfo.getHREmployeeCardNumber());
            sttm.setString(9, objEmployeesInfo.getHREmployeeTaxNumber());
            sttm.setString(10, objEmployeesInfo.getHREmployeeTel1());
            sttm.setString(11, objEmployeesInfo.getHREmployeeEmail());
            sttm.setString(12, objEmployeesInfo.getHREmployeeContactAddress());
            sttm.setString(13, objEmployeesInfo.getHREmployeeContactAddressCity());
            sttm.setString(14, objEmployeesInfo.getHREmployeeContactAddressCountry());
            rs = sttm.executeQuery();
            sttm.execute();
            conn.close();
            return objEmployeesInfo;
        } catch (SQLException ex) {
            return null;
        }
    }

    public HREmployeesInfo Add(HREmployeesInfo objEmployeesInfo) {
        try {
            conn = ConnectionPool.getConnection();
            sttm = conn.prepareCall("CALL HREmployees_Add(?, ?, ?, ?, ? ,?, ?, ?, ?, ?, ?, ?, ?, ?,?)");
            sttm.setString(1, objEmployeesInfo.getHREmployeeNo());
            sttm.setString(2, objEmployeesInfo.getHREmployeeName());
            sttm.setInt(3, objEmployeesInfo.getHREmployeeGender());
            sttm.setDate(4, objEmployeesInfo.getHREmployeeBirthDay());
            sttm.setString(5, objEmployeesInfo.getHREmployeeStatus());
            sttm.setString(6, objEmployeesInfo.getHREmployeeDesc());
            sttm.setString(7, objEmployeesInfo.getHREmployeePicture());
            sttm.setString(8, objEmployeesInfo.getHREmployeeIDNumber());
            sttm.setString(9, objEmployeesInfo.getHREmployeeCardNumber());
            sttm.setString(10, objEmployeesInfo.getHREmployeeTel1());
            sttm.setString(11, objEmployeesInfo.getHREmployeeEmail());
            sttm.setString(12, objEmployeesInfo.getHREmployeeContactAddress());
            sttm.setString(13, objEmployeesInfo.getHREmployeeContactAddressCity());
            sttm.setString(14, objEmployeesInfo.getHREmployeeContactAddressCountry());
            sttm.setDate(15, objEmployeesInfo.getHREmployeeStartWorkingDate());
            sttm.execute();
            GeNumberingsController objGeNumberingsController = new GeNumberingsController();
            objGeNumberingsController.Update("HREmployees");
            conn.close();
            return objEmployeesInfo;
        } catch (SQLException ex) {
            Logger.getLogger(HREmployeesController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public HREmployeesInfo Delete(HREmployeesInfo objEmployeesInfo) {
        try {
            conn = ConnectionPool.getConnection();
            sttm = conn.prepareCall("CALL HREmployees_Delete(?)");
            sttm.setInt(1, objEmployeesInfo.getHREmployeeID());
            sttm.execute();
            conn.close();
            return objEmployeesInfo;
        } catch (SQLException ex) {
            Logger.getLogger(HREmployeesController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<HREmployeesInfo> Sort(String info) {

        List<HREmployeesInfo> listHREmployeesInfos = new ArrayList<>();
        try {
            conn = ConnectionPool.getConnection();
            sttm = conn.prepareStatement("SELECT 	*\n"
                    + "	FROM 	hremployees so\n"
                    + "	WHERE	so.AAStatus = 'Alive'\n"
                    + "	AND (so.HREmployeeNo like '%" + info + "%' "
                    + "or so.HREmployeeName like '%" + info + "%' "
                    + "or so.HREmployeeIDNumber like '%" + info + "%' "
                    + "or so.HREmployeeContactAddress like '%" + info + "%' "
                    + "or so.HREmployeeContactAddressCity like '%" + info + "%' "
                    + "or so.HREmployeeTel1 like '%" + info + "%')"
            );
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
        } catch (SQLException ex) {
            Logger.getLogger(HREmployeesController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean comment_insert(HREmployeeCommentsInfo objCommentsInfo) {
        try {
            conn = ConnectionPool.getConnection();
            sttm = conn.prepareCall("CALL HREmployeeComments_Insert(?,?,?,?)");
            sttm.setString(1, objCommentsInfo.getHREmployeeCommentDesc());
            sttm.setInt(2, objCommentsInfo.getFK_ARCustomerCommentID());
            sttm.setInt(3, objCommentsInfo.getFK_ICProductID());
            sttm.setInt(4, objCommentsInfo.getFK_HREmployeeID());
            sttm.execute();
            conn.close();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
}
