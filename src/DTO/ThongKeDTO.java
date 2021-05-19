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
public class ThongKeDTO {

    String tenThongKe;
    long tongDoanhThu = 0;
    long tongKhuyenMai = 0;
    long tongPhiDichVu = 0;

    public ThongKeDTO(String tenThongKe) {
        this.tenThongKe = tenThongKe;
    }

    public ThongKeDTO() {
    }

    public ThongKeDTO(String thoiGian, long tongDoanhThu, long tongKhuyenMai, long tongPhiDichVu) {
        this.tenThongKe = thoiGian;
        this.tongDoanhThu = tongDoanhThu;
        this.tongKhuyenMai = tongKhuyenMai;
        this.tongPhiDichVu = tongPhiDichVu;
    }

    public String getTenThongKe() {
        return tenThongKe;
    }

    public void setTenThongKe(String thoiGian) {
        this.tenThongKe = thoiGian;
    }

    public long getTongDoanhThu() {
        return tongDoanhThu;
    }

    public void setTongDoanhThu(long tongDoanhThu) {
        this.tongDoanhThu = tongDoanhThu;
    }

    public long getTongKhuyenMai() {
        return tongKhuyenMai;
    }

    public void setTongKhuyenMai(long tongKhuyenMai) {
        this.tongKhuyenMai = tongKhuyenMai;
    }

    public long getTongPhiDichVu() {
        return tongPhiDichVu;
    }

    public void setTongPhiDichVu(long tongPhiDichVu) {
        this.tongPhiDichVu = tongPhiDichVu;
    }

    @Override
    public String toString() {
        return "ThongKeThoiGianDTO{" + "thoiGian=" + tenThongKe + ", tongDoanhThu=" + tongDoanhThu + ", tongKhuyenMai=" + tongKhuyenMai + ", tongPhiDichVu=" + tongPhiDichVu + '}';
    }

}
