/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.TaiKhoanDAO;
import DTO.NhanVienDTO;
import DTO.TaiKhoanDTO;
import java.util.ArrayList;

/**
 *
 * @author anhanpro2k
 */
public class TaiKhoanBUS {

    public static ArrayList<TaiKhoanDTO> danhSachTaiKhoan;
    private TaiKhoanDAO taiKhoanDAO;

    public TaiKhoanBUS() {
        this.taiKhoanDAO = new TaiKhoanDAO();
        getDanhSachTaiKhoan();
    }

    public void getDanhSachTaiKhoan() {
        if (danhSachTaiKhoan != null) {
            return;
        }
        danhSachTaiKhoan = taiKhoanDAO.getList();
    }
}
