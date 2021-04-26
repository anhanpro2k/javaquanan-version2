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
        danhSachChucVu = getDanhSachChucVu();
    }

    public ArrayList<ChucVuDTO> getDanhSachChucVu() {
        return chucVuDAO.getDanhSachChucVu();
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
