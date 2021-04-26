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
import java.util.ArrayList;

/**
 *
 * @author anhanpro2k
 */
public class ChucVuDAO {

    public ArrayList<ChucVuDTO> getDanhSachChucVu() {
        ArrayList<ChucVuDTO> danhSachChucVu = new ArrayList<ChucVuDTO>();
        Connection connection = MyJDBCConnection.getConnection();
        String sql = "SELECT * FROM ChucVu";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
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
