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

/**
 *
 * @author Trí Nguyễn
 */
public class ARInvoicesController {

    Connection conn;
    PreparedStatement sttm;
    ResultSet rs;

    public ARInvoicesController() {
        conn = ConnectionPool.getConnection();
    }
    
}
