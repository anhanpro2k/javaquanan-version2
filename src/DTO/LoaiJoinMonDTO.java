/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author nguye
 */
public class LoaiJoinMonDTO {
    private int maLoai;
    private String tenLoai;
    private int maMon;
    private String tenMon;

    public LoaiJoinMonDTO() {
    }

    public LoaiJoinMonDTO(int maLoai, String tenLoai, int maMon, String tenMon) {
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
        this.maMon = maMon;
        this.tenMon = tenMon;
    }

    public int getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(int maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public int getMaMon() {
        return maMon;
    }

    public void setMaMon(int maMon) {
        this.maMon = maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }
    
    
}
