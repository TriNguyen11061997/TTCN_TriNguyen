/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Info.ARCartsInfo;
import Info.ARCustomersInfo;
import Info.ARSaleOrdersInfo;
import Info.ICProductsInfo;
import Util.ConnectionPool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KA
 */
public class ARCartsController {

    private Connection conn;
    private PreparedStatement ps;
    private PreparedStatement pst;
    private ResultSet rs;
    private Statement st;

    public ARCartsController() {
    }
//    public boolean Insert(ARCartsInfo objCart){
//        try {
//            sttm = conn.prepareCall("CALL ARCarts_AddProduct(?)");
//            //sttm.setDouble(1, objCart.getARCartQty());
//            sttm.setInt(1,objCart.getFK_ICProductID());
//            //sttm.setInt(3, objCart.getFK_ARCustomerID());
//       
//            rs = sttm.executeQuery();
//            sttm.execute();
//            conn.close();
//            return true;
//        } catch (Exception e) {
//            return false;
//        }
//        
//        
//    }

    public int Insert(ARCartsInfo objCart) {
        conn = ConnectionPool.getConnection();
        int result = 0;
        String sql = "INSERT INTO ARCarts(AAStatus,ARCartQty,FK_ICProductID) VALUES(?,?,?)";

        String sql = "INSERT INTO ARCarts(AAStatus,ARCartQty,FK_ICProductID,FK_ARCustomerID) VALUES(?,?,?,?)";        
        try {
            conn = ConnectionPool.getConnection();
            pst = conn.prepareStatement(sql);

            //pst.setDouble(1, objCart.getARCartQty());
            
            pst.setString(1, objCart.getAAStatus());
            pst.setInt(2, objCart.getARCartQty());
            pst.setInt(3, objCart.getFK_ICProductID());
            pst.setInt(2,objCart.getARCartQty());
            pst.setInt(3,objCart.getFK_ICProductID());
            pst.setInt(4, objCart.getFK_ARCustomerID());
            //pst.setInt(2, objCart.getFK_ARCustomerID());
            result = pst.executeUpdate();
        } catch (Exception e) {
        } finally {
            try {
                pst.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        return result;
    }

    public List<ARCartsInfo> GetALlObject() throws SQLException {
        conn = ConnectionPool.getConnection();
        List<ARCartsInfo> listARCartsInfos = new ArrayList<>();
        pst = conn.prepareCall("CALL ARCarts_GetAllObject()");
        rs = pst.executeQuery();
        ARCartsInfo objARCartsInfo;
        while (rs.next()) {
            objARCartsInfo = new ARCartsInfo();
            objARCartsInfo.setARCartID(rs.getInt("ARCartID"));
            objARCartsInfo.setARCartQty(rs.getInt("ARCartQty"));
            objARCartsInfo.setFK_ICProductID(rs.getInt("FK_ICProductID"));
            listARCartsInfos.add(objARCartsInfo);
        }
        return listARCartsInfos;
    }

    public int Update(ARCartsInfo objCart) {
        conn = ConnectionPool.getConnection();
    
    public ArrayList<ARCartsInfo> getListCartByID(int idcus){
        ArrayList<ARCartsInfo> listCart = new ArrayList<>();
        String sql = "SELECT * FROM ARCarts WHERE FK_ARCustomerID = ?";
         ARCartsInfo objARCartsInfo;
        try {
            conn = ConnectionPool.getConnection();
			
            pst = conn.prepareStatement(sql);
			
            pst.setInt(1, idcus);
			
            rs = pst.executeQuery();
            while(rs.next()){
                 objARCartsInfo = new ARCartsInfo();
                 objARCartsInfo.setARCartID(rs.getInt("ARCartID"));
                 objARCartsInfo.setARCartQty(rs.getInt("ARCartQty"));
                 objARCartsInfo.setFK_ICProductID(rs.getInt("FK_ICProductID"));
                 listCart.add(objARCartsInfo);
            }
        } catch (Exception e) {
        }finally {
			try {
				rs.close();
				pst.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
        
        return listCart;
    }
    public int Update(ARCartsInfo objCart){
        int result = 0;
        String sql = "UPDATE ARCarts SET ARCartQty = ? WHERE ARCartID = ?";
        try {
            conn = ConnectionPool.getConnection();
            pst = conn.prepareStatement(sql);

            pst.setInt(1, objCart.getARCartQty());
            pst.setInt(2, objCart.getARCartID());
            result = pst.executeUpdate();
        } catch (Exception e) {
        } finally {
            try {
                pst.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        return result;
    }

    //show ra giỏ hàng
    public List<ICProductsInfo> getListProduct() {
        conn = ConnectionPool.getConnection();
        List<ICProductsInfo> listProduct = new ArrayList<>();
        String sql = "SELECT *, ARCarts.ARCartQty as qty FROM ICProducts INNER JOIN ARCarts ON ICProducts.ICProductID=ARCarts.FK_ICProductID";

    public List<ICProductsInfo> getListProduct(int idcus){
        List<ICProductsInfo> listProduct = new ArrayList<>();
        String sql = "SELECT *, ARCarts.ARCartQty as qty FROM ICProducts INNER JOIN ARCarts ON ICProducts.ICProductID=ARCarts.FK_ICProductID WHERE ARCarts.FK_ARCustomerID = "+idcus;
        
        try {
            conn = ConnectionPool.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                ICProductsInfo item = new ICProductsInfo();

                //add them
                item.setICProductName(rs.getString("ICProductName"));
                item.setICProductSupplierPrice(rs.getDouble("ICProductSupplierPrice"));
                item.setQty(rs.getInt("qty"));

                listProduct.add(item);
            }
        } catch (Exception e) {
        } finally {
            try {
                rs.close();
                st.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        return listProduct;
    }
    
    //submit giỏ hàng
    public int submit_cart(ARSaleOrdersInfo objSale){
        int result = 0;
        String sql = "INSERT INTO ARSaleOrders(AAStatus,FK_ARCustomerID,ARSaleOrderStatus,ARSaleOrderShippingFees,ARSaleOrderTotalAmount) VALUES(?,?,?,?,?)";
        try {
            conn = ConnectionPool.getConnection();
            pst = conn.prepareStatement(sql);
            
            pst.setString(1, objSale.getAAStatus());
            pst.setInt(2, objSale.getFK_ARCustomerID());
            pst.setString(3, objSale.getARSaleOrderStatus());
            pst.setDouble(4, objSale.getARSaleOrderShippingFees());
            pst.setDouble(5, objSale.getARSaleOrderTotalAmount());
            
             result=pst.executeUpdate();
        } catch (Exception e) {
        }finally {
			try {
				pst.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
        
        
        return result;
    }
    //xóa đơn hàng khi đã submit
    public int delCart(int idcus){
        int result = 0;
        String sql = "DELETE FROM ARCarts WHERE ARCarts.FK_ARCustomerID = "+idcus;
        
        try {
            conn = ConnectionPool.getConnection();
            pst = conn.prepareStatement(sql);	
            result = pst.executeUpdate();
	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}finally {
			try {
				
				pst.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
        
        return result;
    }
}
