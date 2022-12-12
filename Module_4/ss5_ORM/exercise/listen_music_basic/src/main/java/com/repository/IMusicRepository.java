package com.repository;

import com.bean.Music;

import java.util.List;

public interface IMusicRepository {

    List<Music> findAll();

    void create(Music music);

    void update(Music music);

    Music listen(int id );

    void delete(int id);

}
