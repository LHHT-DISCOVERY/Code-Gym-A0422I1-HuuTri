package model;

public class SoTietKiemNganHan extends NganHang {
    private int kiHan;

    public SoTietKiemNganHan(int kiHan) {
        this.kiHan = kiHan;
    }

    public SoTietKiemNganHan(String maSoTietKiem) {
        super(maSoTietKiem);
    }

    public SoTietKiemNganHan(String maSoTietKiem, String maKhachHang, String ngayMoSo, String thoiGianBatDauGui, double soTienGui, float laiSuat, int kiHan) {
        super(maSoTietKiem, maKhachHang, ngayMoSo, thoiGianBatDauGui, soTienGui, laiSuat);
        this.kiHan = kiHan;
    }


    public int getKiHan() {
        return kiHan;
    }

    public void setKiHan(int kiHan) {
        this.kiHan = kiHan;
    }
}
