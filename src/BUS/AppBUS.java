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
    public static ArrayList<AppDTO> danhSachApp;

    public AppBUS() {
        appDAO = new AppDAO();
    }

    public ArrayList<AppDTO> getDanhSachApp() {
        return appDAO.getDanhSachApp();
    }

    public void addApp(AppDTO app) {
        appDAO.add(app);
        danhSachApp = null;
    }

    public void delApp(int id) {
        appDAO.delApp(id);
        danhSachApp = null;
    }

    public void editNV(AppDTO app) {
        appDAO.editApp(app);
        danhSachApp = null;
    }

    public String getTenAppByMaApp(int maApp) {
        if (danhSachApp == null) {
            danhSachApp = appDAO.getDanhSachApp();
        }
        for (AppDTO app : danhSachApp) {
            if (app.getMaApp() == maApp) {
                return app.getTenApp();
            }
        }
        return null;
    }

    public ArrayList<AppDTO> getDanhSachAppTheoTenApp(String tenApp) {
        ArrayList<AppDTO> danhSachAppTimDuoc = new ArrayList<>();
        for (AppDTO app : danhSachApp) {
            if (app.getTenApp().contains(tenApp)) {
                danhSachAppTimDuoc.add(app);
            }
        }
        return danhSachAppTimDuoc;
    }

    public ArrayList<AppDTO> searchByID(String id) {
        ArrayList<AppDTO> listSearch = new ArrayList<AppDTO>();
        for (AppDTO app : danhSachApp) {
            if (Integer.toString(app.getMaApp()).contains(id)) {
                listSearch.add(app);
            }
        }
        return listSearch;
    }

    public ArrayList<AppDTO> searchByName(String name) {
        String n = KiemTraDuLieu.removeAccent(name).toLowerCase();
        ArrayList<AppDTO> listSearch = new ArrayList<AppDTO>();
        for (AppDTO app : danhSachApp) {
            if (KiemTraDuLieu.removeAccent(app.getTenApp()).toLowerCase().contains(name)) {
                listSearch.add(app);
            }
        }
        return listSearch;
    }

    public ArrayList<AppDTO> searchByPhiHoaHong(String phiHoaHong) {
        ArrayList<AppDTO> listSearch = new ArrayList<AppDTO>();
        for (AppDTO app : danhSachApp) {
            if (Integer.toString(app.getPhiHoaHong()).contains(phiHoaHong)) {
                listSearch.add(app);
            }
        }

        return listSearch;
    }
}
