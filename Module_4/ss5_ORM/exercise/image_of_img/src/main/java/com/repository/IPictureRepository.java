package com.repository;
import com.bean.Picture;

import java.util.List;

public interface IPictureRepository {
    Picture findById(int id);
    void create(Picture picture);
    void update(Picture picture);
    void deleteById(int id);
    List<Picture> findAll();
}
