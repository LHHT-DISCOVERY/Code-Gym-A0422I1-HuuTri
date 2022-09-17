package model;

public class SPXuatKhau extends  SanPham{
    private double giaXuatKhau;
    private String quocGiaNhapSP;

    public SPXuatKhau(String idSP, String tenSp, String maSP, double giaSP, int soLuongSP, String nhaSX, double giaXuatKhau, String quocGiaNhapSP) {
        super(idSP, tenSp, maSP, giaSP, soLuongSP, nhaSX);
        this.giaXuatKhau = giaXuatKhau;
        this.quocGiaNhapSP = quocGiaNhapSP;
    }
    public SPXuatKhau(String maSP) {
        super(maSP);
    }

    public double getGiaXuatKhau() {
        return giaXuatKhau;
    }

    public void setGiaXuatKhau(double giaXuatKhau) {
        this.giaXuatKhau = giaXuatKhau;
    }

    public String getQuocGiaNhapSP() {
        return quocGiaNhapSP;
    }

    public void setQuocGiaNhapSP(String quocGiaNhapSP) {
        this.quocGiaNhapSP = quocGiaNhapSP;
    }

    @Override
    public String toString() {
        return "SPXuatKhau{" +
                "giaXuatKhau=" + giaXuatKhau +
                ", quocGiaNhapSP='" + quocGiaNhapSP + '\'' +
                '}';
    }
}
