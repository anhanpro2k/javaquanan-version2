package DTO;

public class NhanVienDTO{
    private int MaNV;
    private int MaCV;
    private String TenNV;
    private String DienThoai;
    private int MaTK;

    public NhanVienDTO(){
        MaNV=0;
        MaCV=0;
        TenNV="";
        DienThoai="";
        MaTK=0;
    }
    public NhanVienDTO(int MaNV,int MaCV,String TenNV,String DienThoai,int MaTK){
        this.MaNV=MaNV;
        this.MaCV=MaCV;
        this.TenNV=TenNV;
        this.DienThoai=DienThoai;
        this.MaTK=MaTK;
    }
    public void setMaNV(int maNV) {
        MaNV = maNV;
    }
    public void setMaCV(int maCV) {
        MaCV = maCV;
    }
    public void setDienThoai(String dienThoai) {
        DienThoai = dienThoai;
    }
    public void setTenNV(String tenNV) {
        TenNV = tenNV;
    }
    public void setMaTK(int maTK) {
        MaTK = maTK;
    }

    public int getMaNV() {
        return MaNV;
    }
    public int getMaCV() {
        return MaCV;
    }
    public String getTenNV() {
        return TenNV;
    }
    public String getDienThoai() {
        return DienThoai;
    }
    public int getMaTK() {
        return MaTK;
    }
}