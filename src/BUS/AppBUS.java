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
        danhSachApp = getDanhSachApp();
    }

    public ArrayList<AppDTO> getDanhSachApp() {
        return appDAO.getDanhSachApp();
    }

    public String getTenAppByMaApp(int maApp) {
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

}
