/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.ChitietnhapDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class ChitietnhapDAO {
    public ArrayList<ChitietnhapDTO> getDanhSachChitietNhap() {
        ArrayList<ChitietnhapDTO> danhSachChitietnhap = new ArrayList<>();
        Connection connection = MyJDBCConnection.getConnection();
        String sql = "SELECT * FROM ChiTietNhap";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()) {
                ChitietnhapDTO ctnhap = new ChitietnhapDTO();
                ctnhap.setMaPhieuNhap(rs.getString("MaPhieuNhap"));
                ctnhap.setMaNL(rs.getString("MaNL"));
                ctnhap.setSoluong(rs.getInt("Soluong"));
                ctnhap.setThanhtien(rs.getDouble("Thanhtien"));
                
                danhSachChitietnhap.add(ctnhap);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(LoaiMonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        return danhSachChitietnhap;
    }
}
