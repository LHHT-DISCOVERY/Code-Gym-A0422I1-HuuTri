package com.service.impl;

import com.bean.Music;
import com.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiceImpl implements IMusicService {

    @Autowired
    IMusicService iMusicService ;

    @Override
    public List<Music> findAll() {
        return iMusicService.findAll();
    }

    @Override
    public void create(Music music) {
        iMusicService.create(music);
    }

    @Override
    public void update(Music music) {
        iMusicService.update(music);
    }

    @Override
    public Music listen(int id) {
        return iMusicService.listen(id);
    }

    @Override
    public void delete(int id) {
        iMusicService.delete(id);
    }
}
