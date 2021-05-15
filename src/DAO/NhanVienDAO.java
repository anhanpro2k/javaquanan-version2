package DAO;

import BUS.NhanVienBus;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import DTO.NhanVienDTO;
import java.sql.PreparedStatement;

public class NhanVienDAO {
    protected Connection connection;
    public NhanVienDAO(){
        connection = MyJDBCConnection.getConnection();
    }
    
    public ArrayList<NhanVienDTO> getList() {
        ArrayList<NhanVienDTO> lstNhanVien = new ArrayList();
        try {
            String strSQL = "Select * from nhanvien where TrangThai=1";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(strSQL);
            NhanVienDTO objNV = null;
            while (rs.next()) {
                objNV = new NhanVienDTO();
                objNV.setMaNV(rs.getInt("MaNV"));
                objNV.setMaCV(rs.getInt("MaCV"));
                objNV.setTenNV(rs.getString("TenNV"));
                objNV.setDienThoai(rs.getString("DienThoai"));
                objNV.setMaTK(rs.getInt("MaTK"));
                lstNhanVien.add(objNV);
            }
        }
         catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }

            } catch (SQLException ex) {
                Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lstNhanVien;
    }

    /**
     *
     * @param nv
     */
    public void addnv(NhanVienDTO nv) {
        Connection act = JDBCConnection.getConnection();
        String sql = "INSERT INTO NHANVIEN(MaNV,MaCV,TenNV,DienThoai,MaTK) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = act.prepareStatement(sql);
            ps.setInt(1, nv.getMaNV());
            ps.setInt(2, nv.getMaCV());
            ps.setString(3, nv.getTenNV());
            ps.setString(4, nv.getDienThoai());
            ps.setInt(5, nv.getMaTK());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Lỗi khi thêm nhân viên vào cơ sở dữ liệu.");
        }
    }

    public void editnv(NhanVienDTO nv) {
        Connection act = JDBCConnection.getConnection();
        String sql = "UPDATE NHANVIEN SET TenNV=?,DienThoai=?,MaCV=? WHERE MaNV=?";
        try {
            PreparedStatement ps = act.prepareStatement(sql);
            ps.setString(1, nv.getTenNV());
            ps.setString(2, nv.getDienThoai());
            ps.setInt(3, nv.getMaCV());
            ps.setInt(4, nv.getMaNV());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delnv(int manv) {
        try {
            Connection act = JDBCConnection.getConnection();
            String sql = "UPDATE NHANVIEN SET TrangThai = ? WHERE MaNV = ?";
            PreparedStatement ps = act.prepareStatement(sql);
            ps.setInt(1, 0);
            ps.setInt(2, manv);
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
