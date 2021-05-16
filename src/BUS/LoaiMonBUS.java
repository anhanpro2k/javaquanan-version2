/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.LoaiMonDAO;
import DTO.LoaiMonDTO;
import java.util.ArrayList;

/**
 *
 * @author anhanpro2k
 */
public class LoaiMonBUS {

    private LoaiMonDAO loaiMonDAO;
    public static ArrayList<LoaiMonDTO> danhSachLoaiMon = new ArrayList<>();

    public LoaiMonBUS() {
        loaiMonDAO = new LoaiMonDAO();
        danhSachLoaiMon = getDanhSachLoaiMon();
    }

    public ArrayList<LoaiMonDTO> getDanhSachLoaiMon() {
        if (danhSachLoaiMon == null) {
            danhSachLoaiMon = new ArrayList<>();
        }
        danhSachLoaiMon = loaiMonDAO.getDanhSachLoaiMon();
        return danhSachLoaiMon;
    }

    public static void AddLoaiMon(LoaiMonDTO loai_mon_DTO) {
        LoaiMonDAO data = new LoaiMonDAO();
        data.AddLoaiMon(loai_mon_DTO);//gọi hàm thêm bên DAO để thêm sách vào database
        danhSachLoaiMon.add(loai_mon_DTO);//
    }

    public static void ChangeLoaiMon(LoaiMonDTO loai_mon_DTO) {
        LoaiMonDAO data = new LoaiMonDAO();
        data.ChangeLoaiMon(loai_mon_DTO);
        danhSachLoaiMon.add(loai_mon_DTO);
    }

    public static void DeleteLoaiMon(LoaiMonDTO loai_mon_DTO) {
        LoaiMonDAO data = new LoaiMonDAO();
        data.DeleteLoaiMon(loai_mon_DTO);
        danhSachLoaiMon.add(loai_mon_DTO);
    }

    public static boolean checkID(int id, ArrayList<LoaiMonDTO> temp) {
        for (LoaiMonDTO loai_mon : temp) {
            if (loai_mon.getMaLoai() == id) {
                return true;
            }
        }
        return false;
    }
}
