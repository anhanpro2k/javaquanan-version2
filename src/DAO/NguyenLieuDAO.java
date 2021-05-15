/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.NguyenLieuDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class NguyenLieuDAO {

    public ArrayList<NguyenLieuDTO> getDanhSachNguyenLieu() {
        ArrayList<NguyenLieuDTO> danhSachNguyenLieu = new ArrayList<>();
        Connection connection = MyJDBCConnection.getConnection();
        String sql = "SELECT * FROM NguyenLieu WHERE TrangThai = 1";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                NguyenLieuDTO loaiNL = new NguyenLieuDTO();
                loaiNL.setMaNL(rs.getInt("MaNL"));
                loaiNL.setTen(rs.getString("TenNL"));
                loaiNL.setGia(rs.getInt("DonGia"));

                danhSachNguyenLieu.add(loaiNL);
            }

        } catch (SQLException ex) {
            Logger.getLogger(LoaiMonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return danhSachNguyenLieu;
    }

    public void addNguyenLieu(NguyenLieuDTO nguyenLieu) {
        Connection connection = MyJDBCConnection.getConnection();
        String sql = "INSERT INTO `nguyenlieu`(`TenNL`, `DonGia`) VALUES (?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, nguyenLieu.getTen());
            preparedStatement.setInt(2, nguyenLieu.getGia());
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(NguyenLieuDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Lỗi khi thêm nguyên liệu vào cơ sở dữ liệu.");
        }
    }

    public void updateNguyenLieu(NguyenLieuDTO nguyenLieu) {
        Connection connection = MyJDBCConnection.getConnection();
        String sql = "UPDATE NguyenLieu "
                + "SET TenNL = ?, DonGia = ? WHERE MaNL = ? ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, nguyenLieu.getTen());
            preparedStatement.setInt(2, nguyenLieu.getGia());
            preparedStatement.setInt(3, nguyenLieu.getMaNL());
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void deleteNguyenLieu(int maNguyenLieu) {
        Connection connection = MyJDBCConnection.getConnection();
        String sql = "UPDATE NguyenLieu SET TrangThai = 0 WHERE MaNL = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, maNguyenLieu);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
