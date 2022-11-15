package model;

import java.sql.Date;

public class HoKhau {

     private int maHoKhau;
     private String tenChuHo ;
     private int sl ;
     private Date ngayLap;
     private String diaChi;

    public HoKhau() {
    }

    public HoKhau(int maHoKhau, String tenChuHo, int sl, Date ngayLap, String diaChi) {
        this.maHoKhau = maHoKhau;
        this.tenChuHo = tenChuHo;
        this.sl = sl;
        this.ngayLap = ngayLap;
        this.diaChi = diaChi;
    }

    public int getMaHoKhau() {
        return maHoKhau;
    }

    public void setMaHoKhau(int maHoKhau) {
        this.maHoKhau = maHoKhau;
    }

    public String getTenChuHo() {
        return tenChuHo;
    }

    public void setTenChuHo(String tenChuHo) {
        this.tenChuHo = tenChuHo;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
