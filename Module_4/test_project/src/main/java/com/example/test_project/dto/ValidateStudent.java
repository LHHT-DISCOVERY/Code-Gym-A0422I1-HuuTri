package com.example.test_project.dto;

import com.example.test_project.model.Student;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class ValidateStudent implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

        Student student = (Student) target;

        if (student.getBirthday() == null) {
            errors.rejectValue("birthday", "message", "ko duoc nho hon 18 tuoi");
        }
    }
}
