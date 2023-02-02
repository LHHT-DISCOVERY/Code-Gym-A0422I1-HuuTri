package com.example.demo.repository;

import com.example.demo.model.QuestionContent;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface IQuestionRepository extends JpaRepository<QuestionContent,String> {
        @Query(value="select t.id,t.date,t.dien_tich,t.dongia,t.loai_dich_vu,t.id_question from question_content t join question_type q on t.id_question=q.id  where q.name like concat('%',:tenKhachHang,'%')",nativeQuery = true,
            countQuery = "select count(*) from (select t.id,t.date,t.dien_tich,t.dongia,t.loai_dich_vu,t.id_question from question_content t join question_type q on t.id_question=q.id  where q.name like concat('%',:tenKhachHang,'%') ) question_content")
    Page<QuestionContent> search(@Param("tenKhachHang")String tenKhachHang, Pageable pageable);
//    Page<QuestionContent> findAllByTieuDeContaining(  String tieuDe, Pageable pageable);
        @Query(value="select t.id,t.date,t.dien_tich,t.dongia,t.loai_dich_vu,t.id_question from question_content t join question_type q on t.id_question = q.id  where q.name like concat('%',:tenKhachHang,'%')",nativeQuery = true,
        countQuery = "select count(*) from (select t.id,t.date,t.dien_tich,t.dongia,t.loai_dich_vu,t.id_question from question_content t join question_type q on t.id_question = q.id where  q.name like concat('%',:tenKhachHang,'%') ) question_content")
        Page<QuestionContent> detail(@Param("tenKhachHang")String tenKhachHang, Pageable pageable);

        @Query(value ="select count(*) from question_content  q join question_type t on q.id_question = t.id " +
                "where t.name like concat('%',:tenKhachHang,'%')",nativeQuery=true)
    Integer count(@Param("tenKhachHang")String tenKhachHang);

    @Query(value="select t.id,t.date,t.dien_tich,t.dongia,t.loai_dich_vu,t.id_question from question_content t join question_type q on t.id_question=q.id  where q.name like concat('%',:tenKhachHang,'%')",nativeQuery = true)
    List<QuestionContent> searchByRest(@Param("tenKhachHang")String tenKhachHang);
}
