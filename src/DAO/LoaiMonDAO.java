/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.LoaiMonDTO;
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
public class LoaiMonDAO {
    public ArrayList<LoaiMonDTO> getDanhSachLoaiMon() {
        ArrayList<LoaiMonDTO> danhSachLoaiMon = new ArrayList<>();
        Connection connection = MyJDBCConnection.getConnection();
        String sql = "SELECT * FROM LoaiMon";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()) {
                LoaiMonDTO loaiMon = new LoaiMonDTO();
                loaiMon.setMaLoai(rs.getInt("MaLoai"));
                loaiMon.setTenLoai(rs.getString("TenLoai"));
                
                danhSachLoaiMon.add(loaiMon);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(LoaiMonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        return danhSachLoaiMon;
    }
}
