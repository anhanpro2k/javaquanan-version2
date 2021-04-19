/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.PhieunhapDAO;
import DTO.PhieunhapDTO;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class PhieunhapBUS {
    public static PhieunhapDAO phieunhapDAO;

    public PhieunhapBUS() {
    }
    
    public ArrayList<PhieunhapDTO> getDsPhieunhap(){
        return phieunhapDAO.getDanhSachPhieuNhap();
    }
}
