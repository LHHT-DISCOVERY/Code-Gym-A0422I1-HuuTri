package com.example.restful_api_blog.repository;

import com.example.restful_api_blog.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBlogRepository extends JpaRepository<Blog, Integer> {

//    tìm tất cả các các Blog dựa trên IdBlog trong bảng category
    @Query(nativeQuery = true , value = "select * from blog where id_Blog = :idBlog")
    List<Blog>  listBlogByIdCategory(@Param("idBlog") int idBlog);

}
