package BUS;

import java.util.List;
import DTO.NhanVienDTO;
import DAO.NhanVienDAO;
import java.util.ArrayList;

public class NhanVienBus {

    public static List<NhanVienDTO> dsnv;
    public static NhanVienDTO nhanVienDangNhap;

    public void getList() {
        NhanVienDAO data = new NhanVienDAO();
        if (dsnv == null) {
            dsnv = new ArrayList();
            dsnv = data.getList();
        }
    }

    public void addNV(NhanVienDTO nv) {
        NhanVienDAO nhanVienDAO = new NhanVienDAO();
        nhanVienDAO.addnv(nv);
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

    public ArrayList<NhanVienDTO> timNhanVienTheoTen(String tenNhanVien) {
        ArrayList<NhanVienDTO> danhSachNhanVienTimDuoc = new ArrayList<>();
        for (NhanVienDTO nhanVien : dsnv) {
            if (nhanVien.getTenNV().contains(tenNhanVien)) {
                danhSachNhanVienTimDuoc.add(nhanVien);
            }
        }
        return danhSachNhanVienTimDuoc;
    }

}
