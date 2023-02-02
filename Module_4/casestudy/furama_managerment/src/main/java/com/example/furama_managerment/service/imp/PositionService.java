package com.example.furama_managerment.service.imp;

import com.example.furama_managerment.model.employee.Position;
import com.example.furama_managerment.repository.employee_repository.IPositionRepository;
import com.example.furama_managerment.service.employee_service.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService  implements IPositionService {
    @Autowired
    IPositionRepository iPositionRepository ;
    @Override
    public List<Position> findALl() {
        return iPositionRepository.findAll();
    }
}
