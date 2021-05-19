/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.ChucVuDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ChucVuDAO {

    Connection connection;

    public ArrayList<ChucVuDTO> getDanhSachChucVu() {
        ArrayList<ChucVuDTO> danhSachChucVu = new ArrayList<ChucVuDTO>();
        if (connection == null) {
            connection = MyJDBCConnection.getConnection();
        }
        String sql = "SELECT * FROM ChucVu";
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                ChucVuDTO chucVu = new ChucVuDTO(rs.getInt("MaChucVu"), rs.getString("TenChucVu"));
                danhSachChucVu.add(chucVu);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return danhSachChucVu;
    }
}
