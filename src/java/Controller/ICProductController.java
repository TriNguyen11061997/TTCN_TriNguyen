/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Util.ConnectionPool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author KA
 */
public class ICProductController {
    private Connection conn;
    private ConnectionPool connection = new ConnectionPool();
    private ResultSet rs;
    private PreparedStatement pst;
    private Statement st;

   public ArrayList<ICProductController> getListProduct(){
       ArrayList<ICProductController> listPro = new ArrayList<>();
       
       
       
       return listPro;
   }    
}
