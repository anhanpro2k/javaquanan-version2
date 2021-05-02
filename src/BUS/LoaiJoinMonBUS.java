/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.LoaiMonDAO;
import DTO.LoaiJoinMonDTO;
import java.util.ArrayList;

/**
 *
 * @author nguye
 */
public class LoaiJoinMonBUS {
    private LoaiJoinMonBUS loai_join_mon_BUS;
    public static ArrayList<LoaiJoinMonDTO> danhSachLoaiJoinMon;

    public ArrayList<LoaiJoinMonDTO> getDanhSachLoaiJoinMon() throws Exception {
        LoaiMonDAO data = new LoaiMonDAO();
        if(danhSachLoaiJoinMon == null)
            danhSachLoaiJoinMon = new ArrayList<>();
        danhSachLoaiJoinMon = data.GetLoaiAndMonAn();
        return danhSachLoaiJoinMon;
    }
    
    public  ArrayList<LoaiJoinMonDTO> TimKiemTheoMa(int tuKhoa)
    {
        ArrayList<LoaiJoinMonDTO> kq = new ArrayList<LoaiJoinMonDTO>();
        for(LoaiJoinMonDTO loai_join_mon_DTO : danhSachLoaiJoinMon){
            if(loai_join_mon_DTO.getMaLoai() == tuKhoa)
                kq.add(loai_join_mon_DTO);
        }
        return kq;
    }
    
    public static ArrayList<LoaiJoinMonDTO> TimKiemALL(String tuKhoa){
         ArrayList<LoaiJoinMonDTO> Arr_temp = new ArrayList<>();
         int changeTuKhoa = Integer.parseInt(tuKhoa);
         for (int i =0; i < LoaiJoinMonBUS.danhSachLoaiJoinMon.size();i++) {
            if(danhSachLoaiJoinMon.get(i).getTenLoai().toLowerCase().contains(tuKhoa.toLowerCase())||
               danhSachLoaiJoinMon.get(i).getTenMon().toString().contains(tuKhoa) ||
               danhSachLoaiJoinMon.get(i).getMaLoai() == changeTuKhoa ||
                danhSachLoaiJoinMon.get(i).getMaMon()== changeTuKhoa){
                Arr_temp.add(danhSachLoaiJoinMon.get(i));
            }
        }
         return Arr_temp;
    }
}
