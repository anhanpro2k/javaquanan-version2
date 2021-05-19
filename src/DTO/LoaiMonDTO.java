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
public class LoaiMonDTO {
    private int maLoai;
    private String tenLoai;

    public LoaiMonDTO(int maLoai, String tenLoai) {
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
    }

    public LoaiMonDTO() {
    }

    public LoaiMonDTO(String tenLoai) {
        this.tenLoai = tenLoai;
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

    @Override
    public String toString() {
        return "LoaiMonDTO{" + "maLoai=" + maLoai + ", tenLoai=" + tenLoai + '}';
    }
    
    
}
