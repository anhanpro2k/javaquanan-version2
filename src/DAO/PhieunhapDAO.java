/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.PhieunhapDTO;
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
public class PhieunhapDAO {
    public ArrayList<PhieunhapDTO> getDanhSachPhieuNhap() {
        ArrayList<PhieunhapDTO> danhSachPhieunhap = new ArrayList<>();
        Connection connection = MyJDBCConnection.getConnection();
        String sql = "SELECT * FROM PhieuNhap";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()) {
                PhieunhapDTO phieunhap = new PhieunhapDTO();
                phieunhap.setMaPhieuNhap(rs.getString("MaPhieuNhap"));
                phieunhap.setMaNhanVien(rs.getString("MaNhanVien"));
                //phieunhap.setThoigian(rs.getString("Thoigian"));
                phieunhap.setTongTien(rs.getDouble("Tongtien"));
                
                danhSachPhieunhap.add(phieunhap);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(LoaiMonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        return danhSachPhieunhap;
    }
}
