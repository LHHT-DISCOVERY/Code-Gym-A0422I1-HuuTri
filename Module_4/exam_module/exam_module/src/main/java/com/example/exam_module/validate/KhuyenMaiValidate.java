package com.example.exam_module.validate;

import com.example.exam_module.model.KhuyenMai;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Date;

@Component
public class KhuyenMaiValidate implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        KhuyenMai khuyenMai = (KhuyenMai) target;
        Date date = new Date();
        if (date.after(khuyenMai.getThoiGianBatDau())) {
            errors.rejectValue("thoiGianBatDau", "thoiGianBatDau", null, "Ngay khuyen mai khong duoc nho hon ngay hien tai");
        }

        if (date.before(khuyenMai.getThoiKetThuc())) {
            errors.rejectValue("thoiGianBatDau", "thoiGianBatDau", null, "Ngay kết thúc khuyen mai phải lớn hon ngay hien tai");
        }
    }
}
