/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.ChiTietHoaDonDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anhanpro2k
 */
public class ChiTietHoaDonDAO {
    
    public void themChiTietHoaDon(ChiTietHoaDonDTO chiTietHoaDon) {
        Connection connection = JDBCConnection.getConnection();
        String sql = "INSERT INTO `chitiethoadon`(`MaHD`,`MaMon`, `DonGia`, `SoLuong`, `ThanhTien`) VALUES (?,?,?,?,?)";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, chiTietHoaDon.getMaHD());
            preparedStatement.setInt(2, chiTietHoaDon.getMaMon());
            preparedStatement.setInt(3, chiTietHoaDon.getDonGia());
            preparedStatement.setInt(4, chiTietHoaDon.getSoLuong());
            preparedStatement.setInt(5, chiTietHoaDon.getThanhTien());
            
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
    public ArrayList<ChiTietHoaDonDTO> getCTHDTuMaHD(int maHD) {
        ArrayList<ChiTietHoaDonDTO> dsChiTietHoaDon = new ArrayList<>();
        
        Connection connection = JDBCConnection.getConnection();
        
        String sql = "SELECT * FROM ChiTietHoaDon WHERE MaHD = ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, maHD);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                ChiTietHoaDonDTO chiTietHoaDon = new ChiTietHoaDonDTO();
                
                chiTietHoaDon.setMaHD(rs.getInt("MaHD"));
                chiTietHoaDon.setMaMon(rs.getInt("MaMon"));
                chiTietHoaDon.setDonGia(rs.getInt("DonGia"));
                chiTietHoaDon.setSoLuong(rs.getInt("SoLuong"));              
                chiTietHoaDon.setThanhTien(rs.getInt("ThanhTien"));
                
                dsChiTietHoaDon.add(chiTietHoaDon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return dsChiTietHoaDon;
    }
    
    public void xoaChiTietHoaDon(ChiTietHoaDonDTO chiTietHoaDon) {
        Connection connection = JDBCConnection.getConnection();
        String sql = "DELETE FROM ChiTietHoaDon WHERE MaHD = ? AND MaMon = ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, chiTietHoaDon.getMaHD());
            preparedStatement.setInt(2, chiTietHoaDon.getMaMon());
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietHoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
