/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Info.ICProductDetailsInfo;
import Info.ICProductsInfo;
import Util.ConnectionPool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class ICProductDetailsController {

    private Connection conn;
    private ConnectionPool connection;
    private ResultSet rs;
    private PreparedStatement pst;

    public boolean Insert() throws SQLException {
        conn = ConnectionPool.getConnection();
        pst = conn.prepareCall("Call ICProductDetails_Insert()");
        pst.executeQuery();
        return true;
    }
    
    

    
    //Thêm chi tiết sản phẩm
    public ICProductDetailsInfo Add(ICProductDetailsInfo icpd) {
        try {
            conn = connection.getConnection();
            pst = conn.prepareCall("CALL ICProductDetail_Add(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            pst.setInt(1, icpd.getFK_ICProductID());
            pst.setString(2, icpd.getICProductDetail3G());
            pst.setString(3, icpd.getICProductDetail4G());
            pst.setString(4, icpd.getICProductDetailSIM());
            pst.setString(5, icpd.getICProductDetailKichThuoc());
            pst.setString(6, icpd.getICProductDetailMauSac());
            pst.setString(7, icpd.getICProductDetailTrongLuong());
            pst.setString(8, icpd.getICProductDetailLoai());
            pst.setString(9, icpd.getICProductDetailManHinh());
            pst.setString(10, icpd.getICProductDetailHeDieuHanh());
            pst.setString(11, icpd.getICProductDetailRAM());
            pst.setString(12, icpd.getICProductDetailJack());
            pst.setString(13, icpd.getICProductDetailBoNhoTrong());
            pst.setString(14, icpd.getICProductDetailBluetooth());
            pst.setString(15, icpd.getICProductDetailGPS());
            pst.setString(16, icpd.getICProductDetailPin());
            pst.setString(17, icpd.getICProductDetailWLAN());
            pst.setString(18, icpd.getICProductDetailCameraChinh());
            pst.setString(19, icpd.getICProductDetailCamaraPhu());
            pst.setString(20, icpd.getICProductDetailQuayPhim());
            pst.setString(21, icpd.getICProductDetailCPU());
            pst.setString(22, icpd.getICProductDetailBaoHanh());
            pst.setString(23, icpd.getICProductDetailDesc());
            pst.execute();
            return icpd;
        } catch (SQLException ex) {
            Logger.getLogger(ICProductController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
