/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.AppDAO;
import DTO.AppDTO;
import java.util.ArrayList;

/**
 *
 * @author anhanpro2k
 */
public class AppBUS {
    private AppDAO appDAO;

    public AppBUS() {
        appDAO = new AppDAO();
    }
    
    public ArrayList<AppDTO> getDanhSachApp() {
        return appDAO.getDanhSachApp();
    }
    
}
