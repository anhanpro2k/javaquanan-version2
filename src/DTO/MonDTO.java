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
public class MonDTO {
    private int maMon;
    private int maLoaiMon;
    private String tenMon;
    private int giaBan;
    private boolean tinhTrang;

    public MonDTO(int maLoaiMon, String tenMon, int giaBan, boolean tinhTrang) {
        this.maLoaiMon = maLoaiMon;
        this.tenMon = tenMon;
        this.giaBan = giaBan;
        this.tinhTrang = tinhTrang;
    }

    public MonDTO(int maMon, int maLoaiMon, String tenMon, int giaBan, boolean tinhTrang) {
        this.maMon = maMon;
        this.maLoaiMon = maLoaiMon;
        this.tenMon = tenMon;
        this.giaBan = giaBan;
        this.tinhTrang = tinhTrang;
    }

    public MonDTO() {
    }

    public int getMaMon() {
        return maMon;
    }

    public void setMaMon(int maMon) {
        this.maMon = maMon;
    }

    public int getMaLoaiMon() {
        return maLoaiMon;
    }

    public void setMaLoaiMon(int maLoaiMon) {
        this.maLoaiMon = maLoaiMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public boolean isTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Override
    public String toString() {
        return "MonDTO{" + "maMon=" + maMon + ", maLoaiMon=" + maLoaiMon + ", tenMon=" + tenMon + ", giaBan=" + giaBan + ", tinhTrang=" + tinhTrang + '}';
    }
    
    
}
