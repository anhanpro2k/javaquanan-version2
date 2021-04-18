/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.ChitietnhapDAO;
import DTO.ChitietnhapDTO;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ChitietnhapBUS {
    public static ChitietnhapDAO ctnhapDAO;

    public ChitietnhapBUS() {
    }
    
    public ArrayList<ChitietnhapDTO> getDsChitietnhap(){
        return ctnhapDAO.getDanhSachChitietNhap();
    }
}
