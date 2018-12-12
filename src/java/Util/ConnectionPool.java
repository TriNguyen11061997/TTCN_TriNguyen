/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *
 * @author Trí Nguyễn
 */
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionPool {

    public static Connection getConnection() {
        try {
            InitialContext ctx = new InitialContext();
            DataSource ds
                    = (DataSource) ctx.lookup("java:comp/env/jdbc/sql12269683");
            return ds.getConnection();
        } catch (NamingException ex) {
            return null;
        } catch (SQLException ex) {
            return null;
        }
    }
}
