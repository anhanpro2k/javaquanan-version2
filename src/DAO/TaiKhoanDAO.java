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
import java.util.ArrayList;

/**
 *
 * @author anhanpro2k
 */
public class TaiKhoanDAO {

    public ArrayList<TaiKhoanDTO> getList() {
        ArrayList<TaiKhoanDTO> danhSachTaiKhoan = new ArrayList<TaiKhoanDTO>();
        Connection connection = MyJDBCConnection.getConnection();

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
}
