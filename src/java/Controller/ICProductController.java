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
}
