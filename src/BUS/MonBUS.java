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

    public static ArrayList<MonDTO> danhSachMon;
    public static ArrayList<MonDTO> danhSachMonTheoLoai;

    public MonBUS() {
        monDAO = new MonDAO();
    }

    public ArrayList<MonDTO> getDanhSachMon() {
        MonDAO data = new MonDAO();
        if (danhSachMon == null) {
            danhSachMon = new ArrayList<>();
        }
        danhSachMon = data.getDanhSachMon();
        return danhSachMon;
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

    public static void AddMon(MonDTO mon_DTO) {
        MonDAO data = new MonDAO();
        data.AddMon(mon_DTO);//gọi hàm thêm bên DAO để thêm sách vào database
        danhSachMon.add(mon_DTO);//
    }

    public static void ChangeMon(MonDTO mon_DTO) {
        MonDAO data = new MonDAO();
        data.ChangeMon(mon_DTO);
        danhSachMon.add(mon_DTO);
    }

    public static void DeleteMon(MonDTO mon_DTO) {
        MonDAO data = new MonDAO();
        data.DeleteMon(mon_DTO);
        danhSachMon.add(mon_DTO);
    }

    public static boolean checkID(int id, ArrayList<MonDTO> temp) {
        for (MonDTO loai_mon : temp) {
            if (loai_mon.getMaMon() == id) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<MonDTO> getDanhSachMonTheoMaLoai(int maLoai) {
        MonDAO data = new MonDAO();
        if (danhSachMonTheoLoai == null) {
            danhSachMonTheoLoai = new ArrayList<>();
        }
        danhSachMonTheoLoai = data.getDanhSachMonTheoMaLoai(maLoai);
        return danhSachMonTheoLoai;
    }

    public static ArrayList<MonDTO> TimKiemALL(String tuKhoa) {
        ArrayList<MonDTO> Arr_temp = new ArrayList<>();
        int changeTuKhoa = Integer.parseInt(tuKhoa);
        for (int i = 0; i < MonBUS.danhSachMonTheoLoai.size(); i++) {
            if (danhSachMonTheoLoai.get(i).getTenMon().contains(tuKhoa) || danhSachMonTheoLoai.get(i).getTenMon().toLowerCase().contains(tuKhoa.toLowerCase())
                    || danhSachMonTheoLoai.get(i).getMaMon() == changeTuKhoa
                    || danhSachMonTheoLoai.get(i).getMaLoaiMon() == changeTuKhoa
                    || danhSachMonTheoLoai.get(i).getGiaBan() == changeTuKhoa
                    || danhSachMonTheoLoai.get(i).isTinhTrang()) {
                Arr_temp.add(danhSachMonTheoLoai.get(i));
            }
        }
        return Arr_temp;
    }

}
