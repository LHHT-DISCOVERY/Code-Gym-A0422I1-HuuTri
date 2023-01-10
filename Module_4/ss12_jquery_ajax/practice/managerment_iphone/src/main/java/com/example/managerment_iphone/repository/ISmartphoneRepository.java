package com.example.managerment_iphone.repository;

import com.example.managerment_iphone.model.Smartphone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISmartphoneRepository extends JpaRepository<Smartphone , Long> {
}
