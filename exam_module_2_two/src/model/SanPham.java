package model;

import java.util.Objects;

public abstract class SanPham {
    private String idSP;
    private String tenSp;
    private String maSP;
    private double giaSP;
    private int soLuongSP;
    private String nhaSX;

    public SanPham(String maSP) {
        this.maSP = maSP;
    }

    public SanPham(String idSP, String tenSp, String maSP, double giaSP, int soLuongSP, String nhaSX) {
        this.idSP = idSP;
        this.tenSp = tenSp;
        this.maSP = maSP;
        this.giaSP = giaSP;
        this.soLuongSP = soLuongSP;
        this.nhaSX = nhaSX;
    }

    public String getIdSP() {
        return idSP;
    }

    public void setIdSP(String idSP) {
        this.idSP = idSP;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public double getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(double giaSP) {
        this.giaSP = giaSP;
    }

    public int getSoLuongSP() {
        return soLuongSP;
    }

    public void setSoLuongSP(int soLuongSP) {
        this.soLuongSP = soLuongSP;
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SanPham)) return false;
        SanPham sanPham = (SanPham) o;
        return getMaSP().equals(sanPham.getMaSP());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdSP(), getTenSp(), getMaSP(), getGiaSP(), getSoLuongSP(), getNhaSX());
    }
    public String data_inf(){
        return String.format("%s,%s,%s,%s,%s,%s",idSP ,tenSp ,maSP,giaSP ,soLuongSP ,nhaSX);
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "idSP='" + idSP + '\'' +
                ", tenSp='" + tenSp + '\'' +
                ", maSP='" + maSP + '\'' +
                ", giaSP=" + giaSP +
                ", soLuongSP=" + soLuongSP +
                ", nhaSX='" + nhaSX + '\'' +
                '}' ;
    }


}
