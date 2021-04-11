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

    public LoaiMonBUS() {
        loaiMonDAO = new LoaiMonDAO();
    }
    
    public ArrayList<LoaiMonDTO> getDanhSachLoaiMon() {
        return loaiMonDAO.getDanhSachLoaiMon();
    }
}
