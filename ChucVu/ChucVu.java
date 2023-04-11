package ChucVu;

public class ChucVu {
    private String tenChucVu;
    private double heSoLuong;
 
    public ChucVu(String tenChucVu, double heSoLuong) {
        this.tenChucVu = tenChucVu;
        this.heSoLuong = heSoLuong;
    }
 
    // Getter và Setter cho tất cả các thuộc tính
 
    public String getTenChucVu() {
        return tenChucVu;
    }
 
    public void setTenChucVu(String tenChucVu) {
        this.tenChucVu = tenChucVu;
    }
 
    public double getHeSoLuong() {
        return heSoLuong;
    }
 
    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
}
