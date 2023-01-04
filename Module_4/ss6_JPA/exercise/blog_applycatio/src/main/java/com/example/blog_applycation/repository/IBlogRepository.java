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

    //     đây là viết ra câu lệnh sql thuần'= , còn nếu ko . dùng hql là bỏ nqtiveQuery
//    @Query(nativeQuery = true, "câu lệnh sql")
    List<Blog> findAllByCategory_IdBlog(int idBlog);


    @Modifying
    @Query(nativeQuery = false, value = " update Blog blog set blog.name = :named  , blog.content = :contented where blog.id = :ided")
    void update(@Param("id") int ided, @Param("name") String named, @Param("content") String contented);
}
