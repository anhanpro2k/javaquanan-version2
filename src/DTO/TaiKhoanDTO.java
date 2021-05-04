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
public class TaiKhoanDTO {

    int maTK;
    String tenTK;
    String MatKhau;

    public TaiKhoanDTO(){
    }
    
    public TaiKhoanDTO(int maTK, String tenTK, String MatKhau) {
        this.maTK = maTK;
        this.tenTK = tenTK;
        this.MatKhau = MatKhau;
    }

    public int getMaTK() {
        return maTK;
    }

    public void setMaTK(int maTK) {
        this.maTK = maTK;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    @Override
    public String toString() {
        return "TaiKhoanDTO{" + "maTK=" + maTK + ", tenTK=" + tenTK + ", MatKhau=" + MatKhau + '}';
    }

}
