/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.ThongKeDTO;
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
public class ThongKeDAO {

    Connection connection;

    public ArrayList<ThongKeDTO> getDanhSachThongKeDonTheoNgay(String tuNgay, String denNgay) {
        ArrayList<ThongKeDTO> danhSachThongKeTheoNgay = new ArrayList<>();
        if (connection == null) {
            connection = JDBCConnection.getConnection();
        }
        String sql = "SELECT DATE(NgayLapHD) as ngay, SUM(PhiDichVu) AS TongPhiDichVu, SUM(ChietKhau) AS TongKhuyenMai, SUM(TongThu) AS TongDoanhThu\n"
                + "FROM hoadon\n"
                + "GROUP BY ngay\n"
                + "HAVING ngay BETWEEN ? AND ?\n"
                + "ORDER BY ngay";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, tuNgay);
            preparedStatement.setString(2, denNgay);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ThongKeDTO thongKeNgay = new ThongKeDTO();
                thongKeNgay.setTenThongKe(rs.getDate("ngay").toString());
                thongKeNgay.setTongKhuyenMai(rs.getLong("TongKhuyenMai"));
                thongKeNgay.setTongPhiDichVu(rs.getLong("TongPhiDichVu"));
                thongKeNgay.setTongDoanhThu(rs.getLong("TongDoanhThu"));
                danhSachThongKeTheoNgay.add(thongKeNgay);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return danhSachThongKeTheoNgay;
    }

    public ArrayList<ThongKeDTO> getDanhSachThongKeDonTheoThang(String nam) {
        ArrayList<ThongKeDTO> danhSachThongKeTheoNam = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            danhSachThongKeTheoNam.add(new ThongKeDTO("Tháng " + i));
        }
        Connection connection = MyJDBCConnection.getConnection();
        String sql = "SELECT MONTH(NgayLapHD) AS thang, SUM(PhiDichVu) AS TongPhiDichVu, SUM(ChietKhau) AS TongKhuyenMai, SUM(TongThu) AS TongDoanhThu \n"
                + "FROM hoadon\n"
                + "WHERE YEAR(NgayLapHD) = ?\n"
                + "GROUP BY thang\n"
                + "ORDER BY thang";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, nam);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ThongKeDTO thang = danhSachThongKeTheoNam.get(rs.getInt("thang") - 1);
                thang.setTongPhiDichVu(rs.getLong("TongPhiDichVu"));
                thang.setTongKhuyenMai(rs.getLong("TongKhuyenMai"));
                thang.setTongDoanhThu(rs.getLong("TongDoanhThu"));

            }
            return danhSachThongKeTheoNam;

        } catch (SQLException ex) {
            Logger.getLogger(ThongKeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return danhSachThongKeTheoNam;
    }

    public ArrayList<ThongKeDTO> getDanhSachThongKeDonTheoQuy(String nam) {
        ArrayList<ThongKeDTO> danhSachThongKeQuy = new ArrayList<ThongKeDTO>();
        for (int i = 1; i <= 4; i++) {
            danhSachThongKeQuy.add(new ThongKeDTO("Quý " + i));
        }
        Connection connection = MyJDBCConnection.getConnection();
        String sql = "SELECT QUARTER(NgayLapHD) AS quy, SUM(PhiDichVu) AS TongPhiDichVu, SUM(ChietKhau) AS TongKhuyenMai, SUM(TongThu) AS TongDoanhThu \n"
                + "FROM hoadon\n"
                + "WHERE YEAR(NgayLapHD) = ?\n"
                + "GROUP BY quy\n"
                + "ORDER BY quy";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, nam);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                ThongKeDTO thongKeQuy = danhSachThongKeQuy.get(rs.getInt("quy") - 1);
                thongKeQuy.setTongPhiDichVu(rs.getLong("TongPhiDichVu"));
                thongKeQuy.setTongKhuyenMai(rs.getLong("TongKhuyenMai"));
                thongKeQuy.setTongDoanhThu(rs.getLong("TongDoanhThu"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(ThongKeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return danhSachThongKeQuy;
    }

    public ArrayList<ThongKeDTO> getDanhSachThongKeDonTheoApp() {
        ArrayList<ThongKeDTO> danhSachThongKeApp = new ArrayList<>();
        Connection connection = MyJDBCConnection.getConnection();
        String sql = "SELECT a.tenApp, SUM(hd.ChietKhau) AS TongKhuyenMai, SUM(hd.PhiDichVu) AS TongPhiDichVu,SUM(hd.TongThu) AS TongDoanhThu FROM app a\n"
                + "LEFT JOIN hoadon hd\n"
                + "ON a.maApp = hd.MaApp\n"
                + "GROUP BY a.tenApp\n"
                + "ORDER BY a.tenApp DESC";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ThongKeDTO thongKeApp = new ThongKeDTO();
                thongKeApp.setTenThongKe(rs.getString("tenApp"));
                thongKeApp.setTongPhiDichVu(rs.getLong("TongPhiDichVu"));
                thongKeApp.setTongKhuyenMai(rs.getLong("TongKhuyenMai"));
                thongKeApp.setTongDoanhThu(rs.getLong("TongDoanhThu"));
                danhSachThongKeApp.add(thongKeApp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return danhSachThongKeApp;
    }

    public ArrayList<ThongKeDTO> getDanhSachThongKeDonTheoNhanVien() {
        ArrayList<ThongKeDTO> danhSachThongKeNhanVien = new ArrayList<>();
        Connection connection = MyJDBCConnection.getConnection();
        String sql = "SELECT nv.TenNV,SUM(hd.ChietKhau) AS TongKhuyenMai, SUM(hd.PhiDichVu) AS TongPhiDichVu, SUM(hd.TongThu) AS TongDoanhThu FROM NhanVien nv\n"
                + "LEFT JOIN hoadon hd\n"
                + "ON nv.MaNV = hd.MaNV\n"
                + "GROUP BY nv.MaNV";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ThongKeDTO thongKeNhanVien = new ThongKeDTO();
                thongKeNhanVien.setTenThongKe(rs.getString("TenNV"));
                thongKeNhanVien.setTongDoanhThu(rs.getLong("TongDoanhThu"));
                thongKeNhanVien.setTongKhuyenMai(rs.getLong("TongKhuyenMai"));
                thongKeNhanVien.setTongPhiDichVu(rs.getLong("TongPhiDichVu"));
                danhSachThongKeNhanVien.add(thongKeNhanVien);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return danhSachThongKeNhanVien;
    }

    public static void main(String[] args) {
        ThongKeDAO dao = new ThongKeDAO();
        dao.getDanhSachThongKeDonTheoNgay("2021-04-12", "2021-04-27");
    }
}
