package NhanVien;

import java.sql.Date;

public class NhanVien {
    private String maNhanVien;
    private String hoTen;
    private Date ngaySinh;
    private String diaChi;
    private String chucVu;
    private double heSoLuong;
 
    public NhanVien(String maNV, String hoTen, Date ngaySinh, String diaChi, String chucVu, double heSoLuong) {
        this.maNhanVien = maNV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.chucVu = chucVu;
        this.heSoLuong = heSoLuong;
    }
 
    // Getter và Setter cho tất cả các thuộc tính
 
    public String getMaNhanVien() {
        return maNhanVien;
    }
 
    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }
 
    public String getHoTen() {
        return hoTen;
    }
 
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
 
    public Date getNgaySinh() {
        return ngaySinh;
    }
 
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
 
    public String getDiaChi() {
        return diaChi;
    }
 
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
 
    public String getChucVu() {
        return chucVu;
    }
 
    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
 
    public double getHeSoLuong() {
        return heSoLuong;
    }
 
    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
}
