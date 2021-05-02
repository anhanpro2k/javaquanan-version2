/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.MonDTO;
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
public class MonDAO {

    Connection connection = MyJDBCConnection.getConnection();

    public ArrayList<MonDTO> getDanhSachMon() {
        ArrayList<MonDTO> danhSachMon = new ArrayList();
        Connection connection = MyJDBCConnection.getConnection();
        String sql = "SELECT * FROM mon";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                MonDTO mon = new MonDTO();
                mon.setMaMon(rs.getInt("MaMon"));
                mon.setMaLoaiMon(rs.getInt("MaLoaiMon"));
                mon.setTenMon(rs.getString("TenMon"));
                mon.setGiaBan(rs.getInt("GiaBan"));
                mon.setTinhTrang(rs.getBoolean("TrangThai"));

                danhSachMon.add(mon);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return danhSachMon;
    }

    public void AddMon(MonDTO mon_DTO) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT into mon values(?,?,?,?)");
            preparedStatement.setInt(1, mon_DTO.getMaMon());
            preparedStatement.setString(2, mon_DTO.getTenMon());
            preparedStatement.setInt(3, mon_DTO.getGiaBan());
            preparedStatement.setBoolean(4, mon_DTO.isTinhTrang());
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi");
        }
    }

    public void ChangeMon(MonDTO mon_DTO) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE mon SET TenMon = ?, GiaBan = ?, TrangThai = ?,   WHERE MaMon = ?");
            preparedStatement.setString(1, mon_DTO.getTenMon());
            preparedStatement.setInt(2, mon_DTO.getGiaBan());
            preparedStatement.setBoolean(3, mon_DTO.isTinhTrang());
            preparedStatement.setInt(4, mon_DTO.getMaMon());
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi");
        }
    }

    public void DeleteMon(MonDTO mon_DTO) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM mon WHERE MaMon = ?");
            preparedStatement.setInt(1, mon_DTO.getMaMon());
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi");
        }
    }

    public ArrayList<MonDTO> getDanhSachMonTheoMaLoai(int maLoai) {
        ArrayList<MonDTO> danhSachMonTheoLoai = new ArrayList();
        Connection connection = MyJDBCConnection.getConnection();
        String sql = "SELECT MaMon,TenMon,GiaBan,TrangThai FROM mon WHERE MaLoaiMon = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT MaMon,TenMon,GiaBan,TrangThai FROM mon WHERE MaLoaiMon = ?");
            preparedStatement.setInt(1, maLoai);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                MonDTO mon = new MonDTO();
                mon.setMaMon(rs.getInt("MaMon"));
                mon.setTenMon(rs.getString("TenMon"));
                mon.setGiaBan(rs.getInt("GiaBan"));
                mon.setTinhTrang(rs.getBoolean("TrangThai"));
                danhSachMonTheoLoai.add(mon);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return danhSachMonTheoLoai;
    }

}
