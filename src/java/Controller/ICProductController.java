/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

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
public class ICProductController {
    private Connection conn;
    private ConnectionPool connection;
    private ResultSet rs;
    private PreparedStatement pst;
    private Statement st;
    
    /*
	 * Connection conn = ConnectionPool.getConnection();
        //Statement sttm =(Statement) conn.createStatement();
        //ResultSet rs = sttm.executeQuery("SELECT * FROM ARCustomers");
        PreparedStatement prpSttm = conn.prepareCall("CALL ARCustomers_GetALLObject()");
        prpSttm.executeQuery();
        ResultSet rs = prpSttm.getResultSet();
        return GetListFromDataSet(rs);
	 
	 */

   public List<ICProductsInfo> getListProduct() throws SQLException{
       List<ICProductsInfo> listPro = new ArrayList<>();
       try{
       conn = connection.getConnection();
       pst = conn.prepareCall("CALL ICProducts_GetObjectByIndex()");
       pst.executeQuery();
       rs = pst.getResultSet();
       while(rs.next()){
           ICProductsInfo item = new ICProductsInfo();
           item.setICProductID(rs.getInt("ICProductID"));
           item.setICProductName(rs.getString("ICProductName"));
           item.setICProductDesc(rs.getString("ICProductDesc"));
           item.setICProductSupplierPrice(rs.getDouble("ICProductSupplierPrice"));
           item.setICProductPicture1(rs.getString("ICProductPicture1"));
           listPro.add(item);
       }
       }catch(SQLException e){
           e.printStackTrace();
       }finally{
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
   //Số lượng sản phẩm
   public int countProducts(){
       int result = 0;
       
       String sql = "SELECT COUNT(*) as sum FROM ICProducts";
       
       try {
           conn = ConnectionPool.getConnection();
           st = conn.createStatement();
           rs = st.executeQuery(sql);
           if(rs.next()){
               result = rs.getInt("sum");
           }
       } catch (Exception e) {
       }finally {
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
   public ArrayList<ICProductsInfo> getItemPagination(int offset){
       ArrayList<ICProductsInfo> listProduct = new ArrayList<>();
       
       String sql = "SELECT * FROM ICProducts ORDER BY ICProducts.ICProductID DESC LIMIT " + offset +",4";
       try {
           conn = ConnectionPool.getConnection();
           st = conn.createStatement();
           rs = st.executeQuery(sql);
           while(rs.next()){
               ICProductsInfo objProduct = new ICProductsInfo();
               objProduct.setICProductID(rs.getInt("ICProductID"));
               objProduct.setICProductName(rs.getString("ICProductName"));
               objProduct.setICProductSupplierPrice(rs.getDouble("ICProductSupplierPrice"));
               objProduct.setICProductPicture1(rs.getString("ICProductPicture1"));
               
               listProduct.add(objProduct);
           }
       } catch (Exception e) {
           
       }finally {
			if(rs != null && st != null && conn != null){
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
       
       
       return  listProduct;
   }
   
   //tìm kiếm sản phẩm 
   public ArrayList<ICProductsInfo> getListSearch(String name){
       ArrayList<ICProductsInfo> listPro = new ArrayList<>();
       String sql = "SELECT * FROM ICProducts WHERE ICProducts.ICProductName LIKE "  + "'%"+name+"%'" ;
       try {
           conn = ConnectionPool.getConnection();
           st = conn.createStatement();
           rs = st.executeQuery(sql);
           while(rs.next()){
               ICProductsInfo obj = new ICProductsInfo();
                obj.setICProductID(rs.getInt("ICProductID"));
                obj.setICProductName(rs.getString("ICProductName"));
                obj.setICProductDesc(rs.getString("ICProductDesc"));
                obj.setICProductSupplierPrice(rs.getDouble("ICProductSupplierPrice"));
                obj.setICProductPicture1(rs.getString("ICProductPicture1"));
               
               
               listPro.add(obj);
           }
           
       } catch (Exception e) {
       }finally {
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
}
