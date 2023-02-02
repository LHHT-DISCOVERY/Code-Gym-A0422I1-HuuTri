package com.example.demo.service;

import com.example.demo.model.QuestionContent;
import com.example.demo.service.impl.QuestionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IQuestionService {
    Page<QuestionContent> findByAll(Pageable pageable);
    void delete(String id);
    Page<QuestionContent>  search(String name,Pageable pageable);
    List<QuestionContent> searchByRest(String name);
    List<QuestionContent> detail(String name);
    boolean update(QuestionContent question, Integer id);
    void create(QuestionContent question);
    Integer count(String name);
    List<QuestionContent> findAll();
    QuestionContent findById(String id);

}
