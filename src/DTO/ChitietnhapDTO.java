/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Admin
 */
public class ChitietnhapDTO {
    private String maPhieuNhap;
    private String maNL;
    private int Soluong;
    private double thanhtien;

    public ChitietnhapDTO() {
    }

    public ChitietnhapDTO(String maPhieuNhap, String maNL, int Soluong, double thanhtien) {
        this.maPhieuNhap = maPhieuNhap;
        this.maNL = maNL;
        this.Soluong = Soluong;
        this.thanhtien = thanhtien;
    }

    public String getMaPhieuNhap() {
        return maPhieuNhap;
    }

    public void setMaPhieuNhap(String maPhieuNhap) {
        this.maPhieuNhap = maPhieuNhap;
    }

    public String getMaNL() {
        return maNL;
    }

    public void setMaNL(String maNL) {
        this.maNL = maNL;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

    public double getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(double thanhtien) {
        this.thanhtien = thanhtien;
    }
    
    
}
