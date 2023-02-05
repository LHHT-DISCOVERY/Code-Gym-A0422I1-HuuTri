package com.example.furama_managerment.validate;

import com.example.furama_managerment.model.employee.Employee;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class EmployeeValidate implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        Employee employee = (Employee) target;
        if (employee.getEmployeePhone().length() != 10) {
            errors.rejectValue("employeePhone", "phonenumber", new String[]{"10"}, "Số điện thoại không đúng định dạng");
        } else if (!employee.getEmployeePhone().startsWith("0")) {
            errors.rejectValue("employeePhone", "phonenumberstart", "Số điện thoại không đúng định dạng");
        }
    }

}
