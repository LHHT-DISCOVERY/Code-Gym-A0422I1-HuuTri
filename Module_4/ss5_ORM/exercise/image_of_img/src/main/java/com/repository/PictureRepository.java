package com.repository;

import com.bean.Picture;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class PictureRepository implements IPictureRepository {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Picture findById(int id) {
        return entityManager.find(Picture.class, id);
    }
    @Override
    public void create(Picture picture) {
        entityManager.persist(picture);
    }

    @Override
    public void update(Picture picture) {
        entityManager.merge(picture);
    }

    @Override
    public void deleteById(int id) {
        Picture p = findById(id);
        entityManager.remove(p);
    }

    @Override
    public List<Picture> findAll() {
        return entityManager.createQuery("select p from Picture p").getResultList();
    }

}
