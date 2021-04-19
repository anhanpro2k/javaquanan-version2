/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.NguyenlieuDAO;
import DTO.NguyenlieuDTO;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class NguyenlieuBUS {
    private static NguyenlieuDAO nguyenlieuDAO;

    public NguyenlieuBUS() {
    }
    
    public ArrayList<NguyenlieuDTO> getDsNguyenLieu(){
        return nguyenlieuDAO.getDanhSachNguyenLieu();
    }
}
