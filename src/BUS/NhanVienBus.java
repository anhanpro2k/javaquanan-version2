package BUS;

import java.util.List;
import DTO.NhanVienDTO;
import DAO.NhanVienDAO;
import java.util.ArrayList;

public class NhanVienBus {

    public static ArrayList<NhanVienDTO> dsnv;
    public NhanVienDAO nhanvienDAO = new NhanVienDAO();
    public static NhanVienDTO nhanVienDangNhap;

    public void getList() {
        if (dsnv == null) {
            dsnv = new ArrayList();
            dsnv = nhanvienDAO.getList();
        }
    }

    public void addNV(NhanVienDTO nv) {
        nhanvienDAO.addnv(nv);
        dsnv=null;
    }

    public NhanVienDTO getNhanVienByMaTaiKhoan(int maTaiKhoan) {
        for (NhanVienDTO nhanVien : dsnv) {
            if (nhanVien.getMaTK() == maTaiKhoan) {
                return nhanVien;
            }
        }
        return null;
    }

    public String getTenNhanVienByMaNhanVien(int maNhanVien) {
        for (NhanVienDTO nhanVien : dsnv) {
            if (nhanVien.getMaNV() == maNhanVien) {
                return nhanVien.getTenNV();
            }
        }
        return null;
    }
    
    public ArrayList<NhanVienDTO> timNhanVienTheoMaNV(String maNhanVien) {
        ArrayList<NhanVienDTO> danhSachNhanVienTimDuoc = new ArrayList<>();
        for (NhanVienDTO nhanVien : dsnv) {
            if (Integer.toString(nhanVien.getMaNV()).contains(maNhanVien)) {
                danhSachNhanVienTimDuoc.add(nhanVien);
            }
        }
        return danhSachNhanVienTimDuoc;
    }

    public ArrayList<NhanVienDTO> timNhanVienTheoSDT(String SDT){
        ArrayList<NhanVienDTO> danhSachNhanVienTimDuoc = new ArrayList<>();
        for (NhanVienDTO nhanVien : dsnv) {
            if (nhanVien.getDienThoai().contains(SDT)) {
                danhSachNhanVienTimDuoc.add(nhanVien);
            }
        }
        return danhSachNhanVienTimDuoc;
    }
    
    public ArrayList<NhanVienDTO> timNhanVienTheoTaiKhoan(String taikhoan){
        String tk = KiemTraDuLieu.removeAccent(taikhoan).toLowerCase();
        TaiKhoanBUS taiKhoanBUS = new TaiKhoanBUS();
        ArrayList<NhanVienDTO> danhSachNhanVienTimDuoc = new ArrayList<>();
        for (NhanVienDTO nhanVien : dsnv) {
            if (KiemTraDuLieu.removeAccent(taiKhoanBUS.getNameByID(nhanVien.getMaTK())).toLowerCase().contains(tk)) {
                danhSachNhanVienTimDuoc.add(nhanVien);
            }
        }
        return danhSachNhanVienTimDuoc;
    }
    
    public ArrayList<NhanVienDTO> timNhanVienTheoChucVu(String chucvu){
        String cv = KiemTraDuLieu.removeAccent(chucvu).toLowerCase();
        ChucVuBUS chucVuBUS = new ChucVuBUS();
        ArrayList<NhanVienDTO> danhSachNhanVienTimDuoc = new ArrayList<>();
        for (NhanVienDTO nhanVien : dsnv) {
            if (KiemTraDuLieu.removeAccent(chucVuBUS.getNameByID(nhanVien.getMaCV())).toLowerCase().contains(cv)) {
                danhSachNhanVienTimDuoc.add(nhanVien);
            }
        }
        return danhSachNhanVienTimDuoc;
    }
    
    public ArrayList<NhanVienDTO> timNhanVienTheoTen(String tenNhanVien) {
        String tenNV = KiemTraDuLieu.removeAccent(tenNhanVien).toLowerCase();
        ArrayList<NhanVienDTO> danhSachNhanVienTimDuoc = new ArrayList<>();
        for (NhanVienDTO nhanVien : dsnv) {
            if (KiemTraDuLieu.removeAccent(nhanVien.getTenNV()).toLowerCase().contains(tenNV)) {
                danhSachNhanVienTimDuoc.add(nhanVien);
            }
        }
        return danhSachNhanVienTimDuoc;
    }
    
    public void delNV(int MaNV){
        nhanvienDAO.delnv(MaNV);
        dsnv = null;
    }
    
    public void editNV(NhanVienDTO nv){
        nhanvienDAO.editnv(nv);
        dsnv = null;
    }

}
