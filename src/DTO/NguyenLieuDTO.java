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
public class NguyenLieuDTO {

    private int maNL;
    private String ten;
    private int gia;

    public NguyenLieuDTO() {
    }

    public NguyenLieuDTO(int maNL, String ten, int gia) {
        this.maNL = maNL;
        this.ten = ten;
        this.gia = gia;
    }

    public int getMaNL() {
        return maNL;
    }

    public void setMaNL(int maNL) {
        this.maNL = maNL;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

}
