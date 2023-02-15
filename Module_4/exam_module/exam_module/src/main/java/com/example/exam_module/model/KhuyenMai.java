package com.example.exam_module.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class KhuyenMai {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Không được để trống")
    private String tieuDe;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "không được để trống")
    private Date thoiGianBatDau;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "không được để trống")
    private Date thoiKetThuc;
    @NotNull(message = "không được để trống")
    @Min(10000)
    private Double mucGiamGia;
    @NotBlank(message = "Không được để trống")
    private String chiTiet;

    public KhuyenMai() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public Date getThoiGianBatDau() {
        return thoiGianBatDau;
    }

    public void setThoiGianBatDau(Date thoiGianBatDau) {
        this.thoiGianBatDau = thoiGianBatDau;
    }

    public Date getThoiKetThuc() {
        return thoiKetThuc;
    }

    public void setThoiKetThuc(Date thoiKetThuc) {
        this.thoiKetThuc = thoiKetThuc;
    }

    public Double getMucGiamGia() {
        return mucGiamGia;
    }

    public void setMucGiamGia(Double mucGiamGia) {
        this.mucGiamGia = mucGiamGia;
    }

    public String getChiTiet() {
        return chiTiet;
    }

    public void setChiTiet(String chiTiet) {
        this.chiTiet = chiTiet;
    }
}
