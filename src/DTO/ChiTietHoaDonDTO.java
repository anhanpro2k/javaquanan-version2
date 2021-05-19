/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author anhanpro2k
 */
public class ChiTietHoaDonDTO {
    int maHD;
    int maMon;
    int donGia;
    int soLuong;
    int thanhTien;

    public ChiTietHoaDonDTO() {
    }

    public ChiTietHoaDonDTO(int maMon, int donGia, int soLuong, int thanhTien) {
        this.maMon = maMon;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
    }
    
    

    
    public ChiTietHoaDonDTO(int maHD, int maMon, int donGia, int soLuong, int thanhTien) {
        this.maHD = maHD;
        this.maMon = maMon;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
    }

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public int getMaMon() {
        return maMon;
    }

    public void setMaMon(int maMon) {
        this.maMon = maMon;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(int thanhTien) {
        this.thanhTien = thanhTien;
    }

    @Override
    public String toString() {
        return "ChiTietHoaDonDTO{" + "maHD=" + maHD + ", maMon=" + maMon + ", donGia=" + donGia + ", soLuong=" + soLuong + ", thanhTien=" + thanhTien + '}';
    }
    
}
