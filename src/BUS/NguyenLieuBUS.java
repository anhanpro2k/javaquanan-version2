/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.NguyenLieuDAO;
import DTO.NguyenLieuDTO;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class NguyenLieuBUS {

    private NguyenLieuDAO nguyenLieuDAO;
    public static ArrayList<NguyenLieuDTO> danhSachNguyenLieu;

    public NguyenLieuBUS() {
        nguyenLieuDAO = new NguyenLieuDAO();
        danhSachNguyenLieu = getDsNguyenLieu();
    }

    public ArrayList<NguyenLieuDTO> getDsNguyenLieu() {
        return nguyenLieuDAO.getDanhSachNguyenLieu();
    }

    public void addNguyenLieu(NguyenLieuDTO nguyenLieu) {
        nguyenLieuDAO.addNguyenLieu(nguyenLieu);
        danhSachNguyenLieu.add(nguyenLieu);
    }

    public void updateNguyenLieu(NguyenLieuDTO nguyenLieu) {
        nguyenLieuDAO.updateNguyenLieu(nguyenLieu);
        NguyenLieuDTO nguyenLieuCu = getNguyenLieuVoiMa(nguyenLieu.getMaNL());
        nguyenLieuCu.setGia(nguyenLieu.getGia());
        nguyenLieuCu.setTen(nguyenLieu.getTen());
    }

    public NguyenLieuDTO getNguyenLieuVoiMa(int maNguyenLieu) {
        for (NguyenLieuDTO nguyenLieu : danhSachNguyenLieu) {
            if (nguyenLieu.getMaNL() == maNguyenLieu) {
                return nguyenLieu;
            }
        }
        return null;
    }

    public void deleteNguyenLieu(int maNguyenLieu) {
        nguyenLieuDAO.deleteNguyenLieu(maNguyenLieu);
        danhSachNguyenLieu.remove(getNguyenLieuVoiMa(maNguyenLieu));
    }

}
