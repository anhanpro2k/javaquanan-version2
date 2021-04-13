/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.HoaDonDAO;
import DTO.HoaDonDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anhanpro2k
 */
public class HoaDonBUS {

    private HoaDonDAO hoaDonDAO;

    public HoaDonBUS() {
        hoaDonDAO = new HoaDonDAO();
    }

    public ArrayList<HoaDonDTO> getDanhSachHoaDon() {
        return hoaDonDAO.getDanhSachHoaDon();
    }

    public void themHoaDon(HoaDonDTO hoaDon) {
        hoaDonDAO.themHoaDon(hoaDon);
    }

    public int lamTronTien(int tien) {
        return tien % 1000 < 500 ? tien - tien % 1000 : tien + (1000 - tien % 1000);
    }

    public void xoaHoaDon(HoaDonDTO hoaDon) {
        hoaDonDAO.xoaHoaDon(hoaDon);
    }

}
