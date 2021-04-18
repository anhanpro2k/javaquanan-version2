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
public class NguyenlieuDTO {
    private String maNL;
    private String ten;
    private double gia;

    public NguyenlieuDTO() {
    }

    public NguyenlieuDTO(String maNL, String ten, double gia) {
        this.maNL = maNL;
        this.ten = ten;
        this.gia = gia;
    }

    public String getMaNL() {
        return maNL;
    }

    public void setMaNL(String maNL) {
        this.maNL = maNL;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    
    
    
}
