/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.ChiTietHoaDonDAO;
import DTO.ChiTietHoaDonDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anhanpro2k
 */
public class ChiTietHoaDonBUS {
    public static List<ChiTietHoaDonDTO> dsChiTiet;

    public ChiTietHoaDonBUS() {
        chiTietDAO = new ChiTietHoaDonDAO();
    }
    
    
    
    public ChiTietHoaDonDAO chiTietDAO;
    public void themChiTietHoaDon(ChiTietHoaDonDTO chiTiet) {
        chiTietDAO.themChiTietHoaDon(chiTiet);
    }
    public ArrayList<ChiTietHoaDonDTO> getDanhSachChiTietTuMaHoaDon(int maHD) {
        return chiTietDAO.getCTHDTuMaHD(maHD);
    }
}
