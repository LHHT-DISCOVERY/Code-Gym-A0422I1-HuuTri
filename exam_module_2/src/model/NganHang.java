package model;

import java.util.Date;
import java.util.Objects;

public abstract class NganHang {
    private String maSoTietKiem;
    private String maKhachHang;
    private String ngayMoSo;
    private String thoiGianBatDauGui;
    private double soTienGui;
    private float laiSuat;

    public NganHang() {
    }

    public NganHang(String maSoTietKiem) {
        this.maSoTietKiem = maSoTietKiem;
    }

    public NganHang(String maSoTietKiem, String maKhachHang, String ngayMoSo, String thoiGianBatDauGui, double soTienGui, float laiSuat) {
        this.maSoTietKiem = maSoTietKiem;
        this.maKhachHang = maKhachHang;
        this.ngayMoSo = ngayMoSo;
        this.thoiGianBatDauGui = thoiGianBatDauGui;
        this.soTienGui = soTienGui;
        this.laiSuat = laiSuat;
    }

    public String getMaSoTietKiem() {
        return maSoTietKiem;
    }

    public void setMaSoTietKiem(String maSoTietKiem) {
        this.maSoTietKiem = maSoTietKiem;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getNgayMoSo() {
        return ngayMoSo;
    }

    public void setNgayMoSo(String ngayMoSo) {
        this.ngayMoSo = ngayMoSo;
    }

    public String getThoiGianBatDauGui() {
        return thoiGianBatDauGui;
    }

    public void setThoiGianBatDauGui(String thoiGianBatDauGui) {
        this.thoiGianBatDauGui = thoiGianBatDauGui;
    }


    public double getSoTienGui() {
        return soTienGui;
    }

    public void setSoTienGui(double soTienGui) {
        this.soTienGui = soTienGui;
    }

    public float getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(float laiSuat) {
        this.laiSuat = laiSuat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NganHang)) return false;
        NganHang nganHang = (NganHang) o;
        return  getMaSoTietKiem().equals(nganHang.getMaSoTietKiem());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMaSoTietKiem(), getMaKhachHang(), getNgayMoSo(), getThoiGianBatDauGui(), getSoTienGui(), getLaiSuat());
    }

    @Override
    public String toString() {
        return "NganHang{" +
                "maSoTietKiem='" + maSoTietKiem + '\'' +
                ", maKhachHang='" + maKhachHang + '\'' +
                ", ngayMoSo=" + ngayMoSo +
                ", thoiGianBatDauGui='" + thoiGianBatDauGui + '\''+
                ", soTienGui=" + soTienGui +
                ", laiSuat=" + laiSuat +
                '}';
    }
}
