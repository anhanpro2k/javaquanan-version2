/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.*;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ADmin
 */
public class MyJDBCConnection {
    private final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private final static String DATABASE_LINK = "jdbc:mysql://localhost:3306/quanan?userUnicode=true&characterEncoding=UTF-8";
    
    public static Connection getConnection(){
        Connection conn  = null;
        
        try {
            Class.forName(JDBC_DRIVER);
            conn=DriverManager.getConnection(DATABASE_LINK,"root","");
            
        } catch (ClassNotFoundException ex) {
            System.err.println("Không tìm thấy Driver.Chi tiết: "+ex.getMessage());
        }catch(SQLException ex){
            System.err.println("Không kết nối đến MySQL.Chi tiết: "+ex.getMessage());
        }
        return conn;
    }
}