package model;

public class SPNhapKhau extends SanPham {
    private Double giaNhapKhau;
    private String tinhNhapKhau;
    private Double thueNhapKhau;

    public SPNhapKhau(String maSP) {
        super(maSP);
    }

    public SPNhapKhau(String idSP, String tenSp, String maSP, double giaSP, int soLuongSP, String nhaSX, Double giaNhapKhau, String tinhNhapKhau, Double thueNhapKhau) {
        super(idSP, tenSp, maSP, giaSP, soLuongSP, nhaSX);
        this.giaNhapKhau = giaNhapKhau;
        this.tinhNhapKhau = tinhNhapKhau;
        this.thueNhapKhau = thueNhapKhau;
    }

    public Double getGiaNhapKhau() {
        return giaNhapKhau;
    }

    public void setGiaNhapKhau(Double giaNhapKhau) {
        this.giaNhapKhau = giaNhapKhau;
    }

    public String getTinhNhapKhau() {
        return tinhNhapKhau;
    }

    public void setTinhNhapKhau(String tinhNhapKhau) {
        this.tinhNhapKhau = tinhNhapKhau;
    }

    public Double getThueNhapKhau() {
        return thueNhapKhau;
    }

    public void setThueNhapKhau(Double thueNhapKhau) {
        this.thueNhapKhau = thueNhapKhau;
    }


    @Override
    public String toString() {
        return "SPNhapKhau{" +
                "giaNhapKhau=" + giaNhapKhau +
                ", tinhNhapKhau='" + tinhNhapKhau + '\'' +
                ", thueNhapKhau=" + thueNhapKhau +
                '}';
    }
}
