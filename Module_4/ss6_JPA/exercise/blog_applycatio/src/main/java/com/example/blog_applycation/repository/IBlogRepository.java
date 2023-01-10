package com.example.blog_applycation.repository;

import com.example.blog_applycation.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface IBlogRepository extends JpaRepository<Blog, Integer> {

//đây là viết ra câu lệnh sql thuần'= , còn nếu ko . dùng hql là bỏ nqtiveQuery
//    @Query(nativeQuery = true, "câu lệnh sql")
    List<Blog> findAllByCategory_IdBlog(int idBlog);


    @Modifying
    @Query(value = " update Blog blog set blog.name = :name  , blog.content = :content where blog.id = :id",nativeQuery = false)
    void update(@Param("id") int id, @Param("name") String name, @Param("content") String content);
//    String name đại diện cho tham số của hàm
//    @Param("name") truyền lên câu query

}
