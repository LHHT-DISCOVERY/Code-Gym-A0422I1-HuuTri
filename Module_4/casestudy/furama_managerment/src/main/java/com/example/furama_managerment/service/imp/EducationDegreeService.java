package com.example.furama_managerment.service.imp;

import com.example.furama_managerment.model.employee.EducationDegree;
import com.example.furama_managerment.repository.employee_repository.IEducationDegreeRepository;
import com.example.furama_managerment.service.employee_service.IEducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationDegreeService implements IEducationDegreeService {
    @Autowired
    IEducationDegreeRepository iEducationDegreeRepository ;

    @Override
    public List<EducationDegree> findAll() {
        return iEducationDegreeRepository.findAll();
    }
}
