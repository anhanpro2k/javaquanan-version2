package DAO;

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
    
    public List<NhanVienDTO> getList(){
        List<NhanVienDTO> lstNhanVien= new ArrayList();
        Connection conn=null;
        try {
            conn=MyJDBCConnection.getConnection();
            String strSQL="Select * from nhanvien";
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(strSQL);
            NhanVienDTO objNV=null;
            while(rs.next()){
                objNV=new NhanVienDTO();
                objNV.setMaNV(rs.getInt("MaNV"));
                objNV.setMaCV(rs.getInt("MaCV"));
                objNV.setTenNV(rs.getString("TenNV"));
                objNV.setDienThoai(rs.getString("DienThoai"));
                objNV.setMaTK(rs.getInt("MaTK"));
                lstNhanVien.add(objNV);
            }
        } catch (SQLException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
        finally{
            try{
                if(conn!=null){
                    conn.close();
                }

            }catch(SQLException ex){
                Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lstNhanVien;
    }
    
    public void addnv(NhanVienDTO nv){
        Connection act = JDBCConnection.getConnection();
        String sql = "INSERT INTO NHANVIEN(MaNV,MaCV,TenNV,DienThoai,MaTK) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps=act.prepareStatement(sql);
            ps.setInt(1,nv.getMaNV());
            ps.setInt(2, nv.getMaCV());
            ps.setString(3, nv.getTenNV());
            ps.setString(4, nv.getDienThoai());
            ps.setInt(5, nv.getMaTK());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        public void editnv(NhanVienDTO nv){
            Connection act = JDBCConnection.getConnection();
            String sql = "UPDATE NHANVIEN SET TenNV=?,DienThoai=?,MaCV=?,MaTK=? WHERE MaNV=?";
            try {
                PreparedStatement ps = act.prepareStatement(sql);
                ps.setString(1,nv.getTenNV());
                ps.setString(2,nv.getDienThoai());
                ps.setInt(3,nv.getMaCV());
                ps.setInt(4, nv.getMaTK());
                ps.setInt(5, nv.getMaNV());
                ps.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
         public void delnv(int manv){
            try{
            Connection act = JDBCConnection.getConnection();
            String sql = "DELETE FROM NHANVIEN WHERE MaNV=?";
            PreparedStatement ps = act.prepareStatement(sql);
            ps.setInt(1,manv);
            ps.executeUpdate();
            }
            catch(SQLException ex){
               ex.printStackTrace();
        }
    }
}
