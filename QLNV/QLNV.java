package QLNV;

import java.util.ArrayList;
import java.util.List;

import NhanVien.NhanVien;
 
public class QLNV {
    private List<NhanVien> danhSachNhanVien;
 
    public QLNV() {
        danhSachNhanVien = new ArrayList<>();
    }
    
    public void themNhanVien(NhanVien nv) {
        danhSachNhanVien.add(nv);
    }
 
    public void xoaNhanVien(NhanVien nv) {
        danhSachNhanVien.remove(nv);
    }
 
    public void capNhatNhanVien(NhanVien nv) {
        int index = danhSachNhanVien.indexOf(nv);
        if (index >= 0) {
            danhSachNhanVien.set(index, nv);
        }
    }
 
    public List<NhanVien> lietKeNhanVien(double heSoLuong) {
        List<NhanVien> danhSachNhanVienLietKe = new ArrayList<>();
        for (NhanVien nv : danhSachNhanVien) {
            if (nv.getHeSoLuong() > heSoLuong) {
                danhSachNhanVienLietKe.add(nv);
            }
        }
        return danhSachNhanVienLietKe;
    }
 
    // Các phương thức khác tùy ý
 
    public List<NhanVien> getDanhSachNhanVien() {
        return danhSachNhanVien;
    }
 
    public void setDanhSachNhanVien(List<NhanVien> danhSachNhanVien) {
        this.danhSachNhanVien = danhSachNhanVien;
    }
}
