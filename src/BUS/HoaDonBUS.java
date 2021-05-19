/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.HoaDonDAO;
import DTO.AppDTO;
import DTO.HoaDonDTO;
import DTO.NhanVienDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anhanpro2k
 */
public class HoaDonBUS {

    private HoaDonDAO hoaDonDAO;
    public static ArrayList<HoaDonDTO> danhSachHoaDon;

    public HoaDonBUS() {
        hoaDonDAO = new HoaDonDAO();
        danhSachHoaDon = getDanhSachHoaDon();
    }

    public ArrayList<HoaDonDTO> getDanhSachHoaDon() {
        return hoaDonDAO.getDanhSachHoaDon();
    }

    public void themHoaDon(HoaDonDTO hoaDon) {
        hoaDonDAO.themHoaDon(hoaDon);
        danhSachHoaDon.add((hoaDon));
    }

    public int lamTronTien(int tien) {
        return tien % 1000 < 500 ? tien - tien % 1000 : tien + (1000 - tien % 1000);
    }

    public void xoaHoaDon(HoaDonDTO hoaDon) {
        hoaDonDAO.xoaHoaDon(hoaDon);
        danhSachHoaDon.remove(hoaDon);
    }

    public ArrayList<HoaDonDTO> timHoaDonTheoMaHoaDon(String maHD) {
        maHD = maHD.trim();
        ArrayList<HoaDonDTO> danhSachHoaDonTheoMa = new ArrayList<>();
        for (HoaDonDTO hoaDon : danhSachHoaDon) {
            if ((hoaDon.getMaHD() + "").contains(maHD)) {
                danhSachHoaDonTheoMa.add(hoaDon);
            }
        }
        return danhSachHoaDonTheoMa;
    }

    public ArrayList<HoaDonDTO> timHoaDonTheoNhanVien(String maNV) {
        maNV = maNV.trim();
        ArrayList<HoaDonDTO> danhSachHoaDonTheoMaNhanVien = new ArrayList<>();
        for (HoaDonDTO hoaDon : danhSachHoaDon) {
            if ((hoaDon.getMaHD() + "").contains(maNV)) {
                danhSachHoaDonTheoMaNhanVien.add(hoaDon);
            }
        }
        return danhSachHoaDonTheoMaNhanVien;
    }

    public HoaDonDTO timHoaDonTheoMaApp(String maApp) {
        maApp = maApp.trim();
        for (HoaDonDTO hoaDon : danhSachHoaDon) {
            if ((hoaDon.getMaHD() + "").contains(maApp)) {
                return hoaDon;
            }
        }
        return null;
    }

    public ArrayList<HoaDonDTO> timHoaDonTheoDanhSachNhanVien(ArrayList<NhanVienDTO> danhSachNhanVien) {
        ArrayList<HoaDonDTO> danhSachHoaDonTimDuoc = new ArrayList<HoaDonDTO>();
        for (HoaDonDTO hoaDon : danhSachHoaDon) {
            for (NhanVienDTO nhanVien : danhSachNhanVien) {
                if (nhanVien.getMaNV() == hoaDon.getMaNV()) {
                    danhSachHoaDonTimDuoc.add(hoaDon);
                    break;
                }
            }
        }
        return danhSachHoaDonTimDuoc;

    }

    public ArrayList<HoaDonDTO> timHoaDonTheoDanhSachApp(ArrayList<AppDTO> danhSachApp) {
        ArrayList<HoaDonDTO> danhSachHoaDonTimDuoc = new ArrayList<HoaDonDTO>();
        for (HoaDonDTO hoaDon : danhSachHoaDon) {
            for (AppDTO app : danhSachApp) {
                if (app.getMaApp() == hoaDon.getMaApp()) {
                    danhSachHoaDonTimDuoc.add(hoaDon);
                    break;
                }
            }
        }
        return danhSachHoaDonTimDuoc;
    }

}
