/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.TaiKhoanDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author anhanpro2k
 */
public class TaiKhoanDAO {

    Connection connection;

    public ArrayList<TaiKhoanDTO> getList() {
        ArrayList<TaiKhoanDTO> danhSachTaiKhoan = new ArrayList<TaiKhoanDTO>();
        if (connection == null) {
            connection = JDBCConnection.getConnection();
        }
        String sql = "SELECT * FROM TaiKhoan";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                TaiKhoanDTO taiKhoan = new TaiKhoanDTO(rs.getInt("MaTK"), rs.getString("TenTK"), rs.getString("MatKhau"));
                danhSachTaiKhoan.add(taiKhoan);
                System.out.println(taiKhoan);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return danhSachTaiKhoan;
    }

    public void addTaiKhoan(TaiKhoanDTO tk) {
        if (connection == null) {
            connection = JDBCConnection.getConnection();
        }
        String sql = "INSERT INTO TAIKHOAN(MaTK,TenTK,MatKhau) VALUES (?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, tk.getMaTK());
            ps.setString(2, tk.getTenTK());
            ps.setString(3, tk.getMatKhau());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delTaiKhoan(int MaTK) {
        try {
            if (connection == null) {
                connection = JDBCConnection.getConnection();
            }
            String sql = "UPDATE TAIKHOAN SET TrangThai = ? WHERE MaTK = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, 0);
            ps.setInt(2, MaTK);
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void editTaiKhoan(TaiKhoanDTO tk) {
        Connection act = JDBCConnection.getConnection();
        String sql = "UPDATE TAIKHOAN SET TenTK=?,MatKhau=? WHERE MaTK=?";
        try {
            PreparedStatement ps = act.prepareStatement(sql);
            ps.setString(1, tk.getTenTK());
            ps.setString(2, tk.getMatKhau());
            ps.setInt(3, tk.getMaTK());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
