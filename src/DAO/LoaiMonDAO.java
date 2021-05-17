/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.LoaiJoinMonDTO;
import DTO.LoaiMonDTO;
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
 * @author anhanpro2k
 */
public class LoaiMonDAO {

    Connection connection = MyJDBCConnection.getConnection();

    public ArrayList<LoaiMonDTO> getDanhSachLoaiMon() {
        ArrayList<LoaiMonDTO> danhSachLoaiMon = new ArrayList<>();
        if (connection == null) {
            connection = JDBCConnection.getConnection();
        }
        String sql = "SELECT * FROM LoaiMon WHERE TrangThai = 1";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
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

    public ArrayList GetLoaiAndMonAn() throws Exception {
        // join 2 entity
        ArrayList<LoaiJoinMonDTO> danhSachLoaiJoinMon = new ArrayList();
        String sql = "SELECT MaLoai, TenLoai, MaMon, TenMon"
                + " FROM loaimon AS L, mon AS M"
                + " WHERE L.MaLoai = M.MaLoaiMon";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                LoaiJoinMonDTO loaiJoinMon = new LoaiJoinMonDTO();
                loaiJoinMon.setMaLoai(rs.getInt("MaLoai"));
                loaiJoinMon.setTenLoai(rs.getString("TenLoai"));
                loaiJoinMon.setMaMon(rs.getInt("MaMon"));
                loaiJoinMon.setTenMon(rs.getString("TenMon"));
                danhSachLoaiJoinMon.add(loaiJoinMon);
            }
        } catch (Exception e) {
            Logger.getLogger(LoaiMonDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return danhSachLoaiJoinMon;
    }

    public void AddLoaiMon(LoaiMonDTO loai_DTO) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT into loaimon(maloai,tenloai) values(?,?)");
            preparedStatement.setInt(1, loai_DTO.getMaLoai());
            preparedStatement.setString(2, loai_DTO.getTenLoai());
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi");
        }
    }

    public void ChangeLoaiMon(LoaiMonDTO loai_DTO) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE loaimon SET TenLoai = ?  WHERE MaLoai = ?");
            preparedStatement.setString(1, loai_DTO.getTenLoai());
            preparedStatement.setInt(2, loai_DTO.getMaLoai());
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi");
        }
    }

    public void DeleteLoaiMon(LoaiMonDTO loai_DTO) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM loaimon WHERE MaLoai = ?");
            preparedStatement.setInt(1, loai_DTO.getMaLoai());
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi");
        }
    }
}
