package com.example.demo.service.impl;

import com.example.demo.model.QuestionContent;
import com.example.demo.repository.IQuestionRepository;
import com.example.demo.service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService implements IQuestionService {
    @Autowired
   private IQuestionRepository iQuestionRepository;
    @Override
    public Page<QuestionContent> findByAll(Pageable pageable) {
        return iQuestionRepository.findAll(pageable);
    }

    @Override
    public void delete(String id) {
        iQuestionRepository.deleteById(id);

    }

    @Override
    public Page<QuestionContent> search(String name, Pageable pageable) {
        return iQuestionRepository.search(name,pageable);
    }

    @Override
    public List<QuestionContent> searchByRest(String name) {
        return iQuestionRepository.searchByRest(name);
    }

    @Override
    public List<QuestionContent> detail(String name) {
        List<QuestionContent> arr = new ArrayList<>();
       arr.add(iQuestionRepository.findById(name).orElse(null));
       return arr;
    }
//    @Override
//    public Page<QuestionContent> detail(String name, Pageable pageable) {
//        return iQuestionRepository.findById(name).orElse(null);
//    }
//    void muonsach(int id){
//        Optional<Book> book=  iBookReponsitory.findById(id);
//        if(book.isPresent()){
//            Book book1 = book.get();
//            book1.setNumber(book1.getNumber() - 1);
//            iBookReponsitory.save(book1);
//        }

    @Override
    public boolean update(QuestionContent question, Integer id) {
        return false;
    }

    @Override
    public void create(QuestionContent question) {
    iQuestionRepository.save(question);
    }

    @Override
    public Integer count(String name) {
      return iQuestionRepository.count(name);

    }

    @Override
    public List<QuestionContent> findAll() {
        return iQuestionRepository.findAll();
    }

    @Override
    public QuestionContent findById(String id) {
            return iQuestionRepository.findById(id).orElse(null);
    }

}
