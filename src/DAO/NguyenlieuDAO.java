/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import DTO.NguyenlieuDTO;
/**
 *
 * @author Admin
 */
public class NguyenlieuDAO {
    public ArrayList<NguyenlieuDTO> getDanhSachNguyenLieu() {
        ArrayList<NguyenlieuDTO> danhSachNguyenLieu = new ArrayList<>();
        Connection connection = MyJDBCConnection.getConnection();
        String sql = "SELECT * FROM NguyenLieu";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()) {
                NguyenlieuDTO loaiNL = new NguyenlieuDTO();
                loaiNL.setMaNL(rs.getString("MaNL"));
                loaiNL.setTen(rs.getString("Ten"));
                loaiNL.setGia(rs.getDouble("Gia"));
                
                danhSachNguyenLieu.add(loaiNL);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(LoaiMonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        return danhSachNguyenLieu;
    }
}
