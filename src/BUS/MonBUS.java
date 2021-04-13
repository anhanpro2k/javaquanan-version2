/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.MonDAO;
import DTO.MonDTO;
import java.util.ArrayList;

/**
 *
 * @author anhanpro2k
 */
public class MonBUS {

    private MonDAO monDAO;

    public MonBUS() {
        monDAO = new MonDAO();
    }

    public ArrayList<MonDTO> getDanhSachMon() {
        return monDAO.getDanhSachMon();
    }

    public ArrayList<MonDTO> getDanhSachMonTheoMaLoaiMon(int maLoaiMon) {
        ArrayList<MonDTO> danhSachMon = getDanhSachMon();
        ArrayList<MonDTO> danhSachMonTheoLoaiMon = new ArrayList<>();
        for (MonDTO mon : danhSachMon) {
            if (mon.getMaLoaiMon() == maLoaiMon) {
                danhSachMonTheoLoaiMon.add(mon);
            }
        }

        return danhSachMonTheoLoaiMon;
    }

    public String getTenMonTheoMaMon(int maMon) {
        String tenMon = "";
        for (MonDTO mon : getDanhSachMon()) {
            if (mon.getMaMon() == maMon) {
                tenMon = mon.getTenMon();
            }
        }
        return tenMon;
    }

}
