package com.example.demo.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Entity
public class QuestionContent {
    @Id
    @Column(name = "id", columnDefinition = ("varchar(20)"))
//    @Pattern(regexp = "^[A-Z]{3}\\-\\[0-9]{1}$",message = "Id phai dung dinh dang [XXX-{0-9}]")
    private String id;
    @ManyToOne
    @JoinColumn(name = "id_question")
    private QuestionType questionType;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private String loaiDichVu;
    @Min(value = 1,message = "Gia phai lon hon {gia.validate}")
    private Double dongia;
    @Min(value = 1,message = "Dien tich phai lon hon {deintich.validate}")
    private Double dienTich;


    public QuestionContent() {
    }

    public QuestionContent(String id, QuestionType questionType, Date date, String loaiDichVu, Double dongia, Double dienTich) {
        this.id = id;
        this.questionType = questionType;
        this.date = date;
        this.loaiDichVu = loaiDichVu;
        this.dongia = dongia;
        this.dienTich = dienTich;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLoaiDichVu() {
        return loaiDichVu;
    }

    public void setLoaiDichVu(String loaiDichVu) {
        this.loaiDichVu = loaiDichVu;
    }

    public Double getDongia() {
        return dongia;
    }

    public void setDongia(Double dongia) {
        this.dongia = dongia;
    }

    public Double getDienTich() {
        return dienTich;
    }

    public void setDienTich(Double dienTich) {
        this.dienTich = dienTich;
    }
}
