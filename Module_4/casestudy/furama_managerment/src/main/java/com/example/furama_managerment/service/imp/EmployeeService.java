package com.example.furama_managerment.service.imp;

import com.example.furama_managerment.model.employee.Employee;
import com.example.furama_managerment.repository.employee_repository.IEmployeeRepository;
import com.example.furama_managerment.service.employee_service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    IEmployeeRepository iEmployeeRepository;

    @Override
    public Page<Employee> findAllPage(Pageable pageable) {
        return iEmployeeRepository.findAll(pageable);
    }

    @Override
    public void createOrUpdate(Employee employee) {
        iEmployeeRepository.save(employee);
    }


    @Override
    public void deleteById(int id) {
        iEmployeeRepository.deleteById(id);
    }

    @Override
    public Page<Employee> findEmployeeByName(String name ,Pageable pageable ) {
        return iEmployeeRepository.findEmployeeByEmployeeName(name, pageable );
    }


}
