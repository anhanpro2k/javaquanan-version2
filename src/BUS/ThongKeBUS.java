/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.ThongKeDAO;
import DTO.ThongKeDTO;
import java.util.ArrayList;

/**
 *
 * @author anhanpro2k
 */
public class ThongKeBUS {

    private ThongKeDAO thongKeDAO;

    public ThongKeBUS() {
        thongKeDAO = new ThongKeDAO();
    }

    public ArrayList<ThongKeDTO> danhSachThongKeNgay(String tuNgay, String denNgay) {
        return thongKeDAO.getDanhSachThongKeDonTheoNgay(tuNgay, denNgay);
    }

    public ArrayList<ThongKeDTO> getDanhSachThongKeThang(String nam) {
        return thongKeDAO.getDanhSachThongKeDonTheoThang(nam);
    }

    public ArrayList<ThongKeDTO> getDanhSachThongKeQuy(String nam) {
        return thongKeDAO.getDanhSachThongKeDonTheoQuy(nam);
    }

    public ArrayList<ThongKeDTO> getDanhSachThongKeApp() {
        return thongKeDAO.getDanhSachThongKeDonTheoApp();
    }

    public ArrayList<ThongKeDTO> getDanhSachThongKeNhanVien() {
        return thongKeDAO.getDanhSachThongKeDonTheoNhanVien();
    }

}
