package com.example.furama_managerment.service.imp;

import com.example.furama_managerment.model.employee.Division;
import com.example.furama_managerment.repository.employee_repository.IDivisionRepository;
import com.example.furama_managerment.service.employee_service.IDivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DivisionService implements IDivisionService {
    @Autowired
    IDivisionRepository iDivisionRepository ;

    @Override
    public List<Division> findAll() {
        return iDivisionRepository.findAll();
    }
}
