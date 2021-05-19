/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.ChucVuDAO;
import DTO.ChucVuDTO;
import java.util.ArrayList;

/**
 *
 * @author anhanpro2k
 */
public class ChucVuBUS {

    public static ArrayList<ChucVuDTO> danhSachChucVu;
    private ChucVuDAO chucVuDAO;

    public ChucVuBUS() {
        chucVuDAO = new ChucVuDAO();
        getDanhSachChucVu();
    }

    public ArrayList<ChucVuDTO> getDanhSachChucVu() {
        if(danhSachChucVu == null){
            danhSachChucVu = chucVuDAO.getDanhSachChucVu();
        }
        return danhSachChucVu;
    }

    public String getNameByID(int id){
        for(ChucVuDTO chucvu : danhSachChucVu){
            if(chucvu.getMaChucVu() == id){
                return chucvu.getTenChucVu();
            }
        }
        return "";
    }
    
    public ChucVuDTO getChucVuByMaChucVu(int maChucVu) {
        for (ChucVuDTO chucVu : danhSachChucVu) {
            if (chucVu.getMaChucVu() == maChucVu) {
                return chucVu;
            }
        }
        return null;
    }

}
