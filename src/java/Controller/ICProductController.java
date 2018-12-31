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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KA
 */
public class ICProductController {

    private Connection conn;
    private ConnectionPool connection;
    private ResultSet rs;
    private PreparedStatement pst;
    private Statement st;

    public List<ICProductsInfo> getListProduct() throws SQLException {
        List<ICProductsInfo> listPro = new ArrayList<>();
        try {
            conn = connection.getConnection();
            pst = conn.prepareCall("CALL ICProducts_GetObjectByIndex()");
            pst.executeQuery();
            rs = pst.getResultSet();
            while (rs.next()) {
                ICProductsInfo item = new ICProductsInfo();
                item.setICProductID(rs.getInt("ICProductID"));
                item.setICProductName(rs.getString("ICProductName"));
                item.setICProductDesc(rs.getString("ICProductDesc"));
                item.setICProductSupplierPrice(rs.getDouble("ICProductSupplierPrice"));
                item.setICProductPicture1(rs.getString("ICProductPicture1"));
                listPro.add(item);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                st.close();
                conn.close();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return listPro;
    }
    
    public ICProductDetailsInfo getObjectProductDetail(int ID) throws SQLException {
        
        try {
            conn = connection.getConnection();
            pst = conn.prepareCall("CALL ICProductDetails_GetObjectByProductID(?)");
            pst.setInt(1, ID);
            rs = pst.executeQuery();
            ICProductDetailsInfo obj;
            while (rs.next()) {
                
              obj  = new ICProductDetailsInfo();
              
              obj.setICProductDetail3G(rs.getString("ICProductDetail3G"));
              obj.setICProductDetail4G(rs.getString("ICProductDetail4G"));
              obj.setICProductDetailSIM(rs.getString("ICProductDetailSIM"));
              obj.setICProductDetailKichThuoc(rs.getString("ICProductDetailKichThuoc"));
              obj.setICProductDetailMauSac(rs.getString("ICProductDetailMauSac"));
              obj.setICProductDetailTrongLuong(rs.getString("ICProductDetailTrongLuong"));
              obj.setICProductDetailLoai(rs.getString("ICProductDetailLoai"));
              obj.setICProductDetailManHinh(rs.getString("ICProductDetailManHinh"));
              //obj.setICProductDetailAudio(rs.getString("ICProductDetailAudio"));
              obj.setICProductDetailLoaNgoai(rs.getString("ICProductDetailLoaNgoai"));
              //obj.setICProductDetailVideo(rs.getString("ICProductDetailVideo"));
              obj.setICProductDetailBoNhoTrong(rs.getString("ICProductDetailBoNhoTrong"));
              obj.setICProductDetailBluetooth(rs.getString("ICProductDetailBluetooth"));
              obj.setICProductDetailGPS(rs.getString("ICProductDetailGPS"));
              obj.setICProductDetailPin(rs.getString("ICProductDetailPin"));
              obj.setICProductDetailWLAN(rs.getString("ICProductDetailWLAN"));
              obj.setICProductDetailCameraChinh(rs.getString("ICProductDetailCameraChinh"));
              obj.setICProductDetailCamaraPhu(rs.getString("ICProductDetailCamaraPhu"));
              obj.setICProductDetailQuayPhim(rs.getString("ICProductDetailQuayPhim"));
              obj.setICProductDetailCPU(rs.getString("ICProductDetailCPU"));
              obj.setICProductDetailBaoHanh(rs.getString("ICProductDetailBaoHanh"));
              obj.setICProductDetailHeDieuHanh(rs.getString("ICProductDetailHeDieuHanh"));
              obj.setICProductDetailJack3dot5mm(rs.getString("ICProductDetailJack3dot5mm"));
              
              //bang product
              ICProductsInfo productInfo = new ICProductsInfo();
              productInfo.setICProductName(rs.getString("ICProductName"));
              productInfo.setICProductPrice(rs.getDouble("ICProductPrice"));
              productInfo.setICProductDesc(rs.getString("ICProductDesc"));
              productInfo.setICProductID(rs.getInt("ICProductID"));
              productInfo.setICProductPicture1(rs.getString("ICProductPicture1"));
              obj.setProduct(productInfo);
              
              return obj;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                st.close();
                conn.close();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        return null;
    }
    
    //Số lượng sản phẩm

    public int countProducts() {
        int result = 0;

        String sql = "SELECT COUNT(*) as sum FROM ICProducts";

        try {
            conn = ConnectionPool.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                result = rs.getInt("sum");
            }
        } catch (Exception e) {
        } finally {
            try {
                rs.close();
                st.close();
                conn.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        return result;
    }

    //phân trang public cho phần sản phẩm 
    public ArrayList<ICProductsInfo> getItemPagination() {
        ArrayList<ICProductsInfo> listProduct = new ArrayList<>();

        String sql = "SELECT * FROM ICProducts ORDER BY ICProducts.ICProductID DESC LIMIT 4";
        try {
            conn = ConnectionPool.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                ICProductsInfo objProduct = new ICProductsInfo();
                objProduct.setICProductID(rs.getInt("ICProductID"));
                objProduct.setICProductName(rs.getString("ICProductName"));
                objProduct.setICProductPrice(rs.getDouble("ICProductPrice"));
                objProduct.setICProductPicture1(rs.getString("ICProductPicture1"));

                listProduct.add(objProduct);
            }
        } catch (Exception e) {

        } finally {
            if (rs != null && st != null && conn != null) {
                try {
                    rs.close();
                    st.close();
                    conn.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

        return listProduct;
    }

    //tìm kiếm sản phẩm 
    public ArrayList<ICProductsInfo> getListSearch(String name) {
        ArrayList<ICProductsInfo> listPro = new ArrayList<>();
        String sql = "SELECT * FROM ICProducts WHERE ICProducts.ICProductName LIKE " + "'%" + name + "%'";
        try {
            conn = ConnectionPool.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                ICProductsInfo obj = new ICProductsInfo();
                obj.setICProductID(rs.getInt("ICProductID"));
                obj.setICProductName(rs.getString("ICProductName"));
                obj.setICProductDesc(rs.getString("ICProductDesc"));
                obj.setICProductSupplierPrice(rs.getDouble("ICProductSupplierPrice"));
                obj.setICProductPicture1(rs.getString("ICProductPicture1"));

                listPro.add(obj);
            }

        } catch (Exception e) {
        } finally {
            try {
                rs.close();
                st.close();
                conn.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        return listPro;
    }

    public List<ICProductsInfo> GetAllObject() {
        List<ICProductsInfo> listPro = new ArrayList<>();
        try {
            conn = connection.getConnection();
            pst = conn.prepareCall("CALL ICProducts_GetAllObject()");
            rs = pst.executeQuery();
            while (rs.next()) {
                ICProductsInfo item = new ICProductsInfo();
                item.setICProductID(rs.getInt("ICProductID"));
                item.setICProductNo(rs.getString("ICProductNo"));
                item.setICProductName(rs.getString("ICProductName"));
                item.setICProductDesc(rs.getString("ICProductDesc"));
                item.setICProductSupplierPrice(rs.getDouble("ICProductSupplierPrice"));
                item.setICProductPrice(rs.getDouble("ICProductPrice"));
                listPro.add(item);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                st.close();
                conn.close();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return listPro;
    }
    
    public ICProductsInfo GetObjectByID(int ID){
        try {
            conn = connection.getConnection();
            pst = conn.prepareCall("CALL ICProducts_GetObjectByID(?)");
            pst.setInt(1, ID);
            rs = pst.executeQuery();
            ICProductsInfo iCProductsInfo = new ICProductsInfo();
            while(rs.next()){
                iCProductsInfo.setICProductID(rs.getInt("ICProductID"));
                iCProductsInfo.setICProductNo(rs.getString("ICProductNo"));
                iCProductsInfo.setICProductName(rs.getString("ICProductName"));
                iCProductsInfo.setICProductDate(rs.getDate("ICProductDate"));
            } 
            return iCProductsInfo;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public ICProductsInfo Add(ICProductsInfo icp){
        try {
            conn =connection.getConnection();
            pst = conn.prepareCall("CALL ICProducts_Add(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            pst.setString(1, icp.getICProductNo());
            pst.setDouble(2, icp.getICProductPrice());
            pst.setDouble(3, icp.getICProductSupplierPrice());
            pst.setString(4, icp.getICProductName());
            pst.setString(5, icp.getICProductDesc());
            pst.setInt(6, icp.getFK_HREmployeeID());
            pst.setString(7, icp.getICProductPicture1());
            pst.setString(8, icp.getICProductPicture2());
            pst.setString(9, icp.getICProductPicture3());
            pst.setString(10, icp.getICProductPicture4());
            pst.setString(11, icp.getICProductPicture5());
            pst.setString(12, icp.getICProductPicture6());
            pst.setString(13, icp.getICProductVideo());
            pst.setDate(14, icp.getICProductDate());
            pst.execute();
            GeNumberingsController objGeNumberingsController = new GeNumberingsController();
            objGeNumberingsController.Update("ICProducts");
            return icp;
        } catch (SQLException ex) {
            Logger.getLogger(ICProductController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public ICProductDetailsInfo Add(ICProductDetailsInfo icpd){
        try {
            conn =connection.getConnection();
            pst = conn.prepareCall("CALL ICProductDetail_Add(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
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
            pst.setString(11, icpd.getICProductDetailLoaNgoai());
            pst.setString(12, icpd.getICProductDetailJack3dot5mm());
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
            pst.execute();
            return icpd;
        } catch (SQLException ex) {
            Logger.getLogger(ICProductController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
