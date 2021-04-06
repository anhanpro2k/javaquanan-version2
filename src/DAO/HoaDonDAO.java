/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.HoaDonDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author An Tran
 */
public class HoaDonDAO {
    public List<HoaDonDTO> getAllHoaDon() {
        List<HoaDonDTO> danhSachHoaDon = new ArrayList<>();
        
        Connection connection = JDBCConnection.getConnection();
        
        String sql = "SELECT * FROM hoadon";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                HoaDonDTO hoadon = new HoaDonDTO();
                
                hoadon.setMaHD(rs.getInt("MaHD"));
                hoadon.setMaNV(rs.getInt("MaNV"));
                hoadon.setNgay(rs.getString("NgayLapHD"));
                hoadon.setMaApp(rs.getInt("MaApp"));              
                hoadon.setMaDonTrenApp(rs.getString("MaDonTrenApp"));
                hoadon.setTongTien(rs.getInt("TongTien"));
                hoadon.setChietKhau(rs.getInt("ChietKhau"));
                hoadon.setPhiDichVu(rs.getInt("ChietKhau"));
                hoadon.setTongThu(rs.getInt("TongThu"));
                
                danhSachHoaDon.add(hoadon);
            }
        } catch (SQLException e) {
        }
        
        return danhSachHoaDon;
    }
    
    public void insertHoaDon(HoaDonDTO hoaDon) {
        Connection connection = JDBCConnection.getConnection();
        String sql = "INSERT INTO `hoadon`(`MaHD`, `MaNV`, `NgayLapHD`, `MaApp`, `MaDonTrenApp`, `TongTien`, `ChietKhau`, `PhiDichVu`, `TongThu`) VALUES (?,?,?,?,?,?,?,?,?);";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, hoaDon.getMaHD());
            preparedStatement.setInt(2, hoaDon.getMaNV());
            preparedStatement.setString(3, hoaDon.getNgay());
            preparedStatement.setInt(4, hoaDon.getMaApp());
            preparedStatement.setString(5, hoaDon.getMaDonTrenApp());
            preparedStatement.setInt(6, hoaDon.getTongTien());
            preparedStatement.setInt(7, hoaDon.getChietKhau());
            preparedStatement.setInt(8, hoaDon.getPhiDichVu());
            preparedStatement.setInt(9, hoaDon.getTongThu());
            
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
            
        } catch(SQLException e) {
            
        }
    }
    
}
