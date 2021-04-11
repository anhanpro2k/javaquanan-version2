/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.AppDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anhanpro2k
 */
public class AppDAO {
    public ArrayList<AppDTO> getDanhSachApp() {
        ArrayList<AppDTO> danhSachApp = new ArrayList<AppDTO>();
        Connection connection = MyJDBCConnection.getConnection();
        
        String sql = "SELECT * FROM app";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()) {
                AppDTO app = new AppDTO();
                app.setMaApp(rs.getInt("MaApp"));
                app.setTenApp(rs.getString("TenApp"));
                app.setPhiHoaHong(rs.getInt("PhiHoaHong"));
                danhSachApp.add(app);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(AppDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return danhSachApp;
        
    }
}
