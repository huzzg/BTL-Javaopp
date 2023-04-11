package QLCV;

import java.util.HashMap;
import java.util.Map;

public class QLCV {
    private Map<String, Double> chucvu;

    public void Quanlychucvu() {
        this.chucvu = new HashMap<>();
    }

    //them mot chuc vu moi cho nguoi quan ly 
    public void themChucVuChucVu(String tenChucVu, double heSoLuong) {
        this.chucvu.put(tenChucVu, heSoLuong);
    }
    
    //cap nhat mot chuc vu
    public void capNhatChucVu(String tenChucVu, double heSoLuong) {
        if (this.chucvu.containsKey(tenChucVu)) {
            this.chucvu.put(tenChucVu, heSoLuong);
        }
    }

    //xoa mot chuc vu
    public void xoaChucVu(String tenChucVu) {
        this.chucvu.remove(tenChucVu);
    }
    //he so luong theo chuc vu
    public double getHeSoLuong(String tenChucVu) {
        return this.chucvu.get(tenChucVu);
    }
}