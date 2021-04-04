package BUS;

import java.util.List;
import DTO.NhanVien;
import DAO.NhanVienDAO;

public class NhanVienBus{
    public List<NhanVien> getList(){
        return NhanVienDAO.getList();
    }
}