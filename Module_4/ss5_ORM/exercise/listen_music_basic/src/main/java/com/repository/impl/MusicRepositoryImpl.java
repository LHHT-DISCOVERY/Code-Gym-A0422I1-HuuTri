package com.repository.impl;

import com.bean.Music;
import com.repository.IMusicRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class MusicRepositoryImpl implements IMusicRepository {

    @PersistenceContext
    EntityManager entityManage;

    @Override
    public List<Music> findAll() {
        return entityManage.createQuery("select m from Music m").getResultList();
    }

    @Override
    public void create(Music music) {
        entityManage.persist(music);
    }

    @Override
    public void update(Music music) {
        entityManage.merge(music);
    }

    @Override
    public Music listen(int id) {
        return  entityManage.find(Music.class , id);
    }

    @Override
    public void delete(int id) {
        Music music = listen(id);
        entityManage.remove(music);
    }
}
