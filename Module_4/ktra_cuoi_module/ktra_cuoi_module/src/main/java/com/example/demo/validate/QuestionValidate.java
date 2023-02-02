package com.example.demo.validate;

import com.example.demo.model.QuestionContent;
import com.example.demo.service.IQuestionService;
import com.example.demo.service.impl.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
// class này dùng để validate dữ liệu cho đối tượng QuestionContent
//sử dụng annotation có sẵn(đang dùng trong class QuestionContent)
// custom annotation
// custom validate(đang dùng và xử lsi tại ControllerQuestion/createStudent)
@Component
public class QuestionValidate implements Validator {
    @Autowired
    private IQuestionService questionService ;
    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        if (!(target instanceof QuestionContent)) {
            return;
        }
        QuestionContent content = (QuestionContent) target;
        Date date = new Date();
        if(content.getDate().before(date)){
            errors.rejectValue("date","date.validate",null,"ngay mua khong duoc lon hon ngay hien tai");
        }

//        List<QuestionContent> questionContents = new ArrayList<>();
//        questionContents.add(questionService.findById(content.getId()));
        if(questionService.findById(content.getId())!=null){
            errors.rejectValue("id","id.validate",null,"ID khong duoc trung nhau");
        }
    }
}
