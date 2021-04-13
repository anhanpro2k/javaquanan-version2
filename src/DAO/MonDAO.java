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

/**
 *
 * @author anhanpro2k
 */
public class MonDAO {
    public ArrayList<MonDTO> getDanhSachMon() {
        ArrayList<MonDTO> danhSachMon = new ArrayList();
        Connection connection = MyJDBCConnection.getConnection();
        String sql = "SELECT * FROM mon";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()) {
                MonDTO mon = new MonDTO();
                mon.setMaMon(rs.getInt("MaMon"));
                mon.setMaLoaiMon(rs.getInt("MaLoaiMon"));
                mon.setTenMon(rs.getString("TenMon"));
                mon.setGiaBan(rs.getInt("GiaBan"));
                mon.setTinhTrang(rs.getBoolean("TinhTrang"));
                
                danhSachMon.add(mon);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return danhSachMon;
    }
    
    

}
