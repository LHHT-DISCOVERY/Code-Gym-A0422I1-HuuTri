package com.service;

import com.bean.Picture;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IPictureService {
    Picture findById(int id);
    void create(Picture picture);
    void update(Picture picture);
    void deleteById(int id);
    List<Picture> findAll();
}
