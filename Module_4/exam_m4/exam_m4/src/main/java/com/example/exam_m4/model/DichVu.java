package com.example.exam_m4.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Entity
public class DichVu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int DVid ;
    @NotBlank(message = "ko dc de trong")
    @Pattern(regexp = "^(MGD-)(\\d{4})$", message = "Mã dich vụ  phải đúng định dạng: MGD-XXXX.")
    private String maGiaoDich;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "ko dc de trong" )
    private Date ngayGiaoDich;

    @NotNull(message = "Không được để trống")
    private Boolean loaiGiaoDich ;
    @NotNull(message = "không được để trống")
    @Min(500)
    private double donGia;

    @Min(20)
    private double dienTich;

    @ManyToOne
    @JoinColumn(name = "id")
    private KhachHang khachHang ;

    public DichVu() {
    }

    public int getDVid() {
        return DVid;
    }

    public void setDVid(int DVid) {
        this.DVid = DVid;
    }

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public Date getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(Date ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public Boolean getLoaiGiaoDich() {
        return loaiGiaoDich;
    }

    public void setLoaiGiaoDich(Boolean loaiGiaoDich) {
        this.loaiGiaoDich = loaiGiaoDich;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }
}
