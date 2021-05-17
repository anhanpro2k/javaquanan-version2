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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anhanpro2k
 */
public class AppDAO {

    protected Connection connection;

    public AppDAO() {
        if (connection == null) {
            connection = JDBCConnection.getConnection();
        }
    }

    public ArrayList<AppDTO> getDanhSachApp() {
        ArrayList<AppDTO> danhSachApp = new ArrayList<AppDTO>();
        String sql = "SELECT maApp,tenApp,phiHoaHong FROM app WHERE TrangThai=1";
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
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

    public void add(AppDTO app) {
        String sql = "INSERT INTO app (maApp,tenApp,phiHoaHong,TrangThai) VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, app.getMaApp());
            ps.setString(2, app.getTenApp());
            ps.setInt(3, app.getPhiHoaHong());
            ps.setInt(4, 1);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delApp(int id) {
        String sql = "UPDATE app SET TrangThai = 0 WHERE maApp=" + id;
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void editApp(AppDTO app) {
        String sql = "UPDATE app SET tenApp=?,phiHoaHong=? WHERE maApp=?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, app.getTenApp());
            ps.setInt(2, app.getPhiHoaHong());
            ps.setInt(3, app.getMaApp());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
