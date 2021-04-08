/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.sql.Date;

/**
 *
 * @author anhanpro2k
 */
public class HoaDonDTO {
    int maHD;
    int maNV;
    String ngay;
    int maApp;
    String maDonTrenApp;
    int tongTien;
    int chietKhau;
    int phiDichVu;
    int tongThu;

    public HoaDonDTO() {
    }

    public HoaDonDTO(int maNV, String ngay, int maApp, String maDonTrenApp, int tongTien, int chietKhau, int phiDichVu, int tongThu) {
        this.maNV = maNV;
        this.ngay = ngay;
        this.maApp = maApp;
        this.maDonTrenApp = maDonTrenApp;
        this.tongTien = tongTien;
        this.chietKhau = chietKhau;
        this.phiDichVu = phiDichVu;
        this.tongThu = tongThu;
    }

    
    
    
    public HoaDonDTO(int maHD, int maNV, String ngay, int maApp, String maDonTrenApp, int tongTien, int chietKhau, int phiDichVu, int tongThu) {
        this.maHD = maHD;
        this.maNV = maNV;
        this.ngay = ngay;
        this.maApp = maApp;
        this.maDonTrenApp = maDonTrenApp;
        this.tongTien = tongTien;
        this.chietKhau = chietKhau;
        this.phiDichVu = phiDichVu;
        this.tongThu = tongThu;
    }
    
    


    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public int getMaApp() {
        return maApp;
    }

    public void setMaApp(int maApp) {
        this.maApp = maApp;
    }

    public String getMaDonTrenApp() {
        return maDonTrenApp;
    }

    public void setMaDonTrenApp(String maDonTrenApp) {
        this.maDonTrenApp = maDonTrenApp;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public int getChietKhau() {
        return chietKhau;
    }

    public void setChietKhau(int chietKhau) {
        this.chietKhau = chietKhau;
    }

    public int getPhiDichVu() {
        return phiDichVu;
    }

    public void setPhiDichVu(int phiDichVu) {
        this.phiDichVu = phiDichVu;
    }

    public int getTongThu() {
        return tongThu;
    }

    public void setTongThu(int tongThu) {
        this.tongThu = tongThu;
    }

    @Override
    public String toString() {
        return "HoaDonDTO{" + "maHD=" + maHD + ", maNV=" + maNV + ", ngay=" + ngay + ", maApp=" + maApp + ", maDonTrenApp=" + maDonTrenApp + ", tongTien=" + tongTien + ", chietKhau=" + chietKhau + ", phiDichVu=" + phiDichVu + ", tongThu=" + tongThu + '}';
    }

    

    
    
    
    
}
