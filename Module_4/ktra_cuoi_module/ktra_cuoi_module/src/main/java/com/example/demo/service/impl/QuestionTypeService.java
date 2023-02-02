package com.example.demo.service.impl;

import com.example.demo.model.QuestionType;
import com.example.demo.repository.IQuestionRepository;
import com.example.demo.repository.IQuestionTypeRepository;
import com.example.demo.service.IQuestionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionTypeService implements IQuestionTypeService {
    @Autowired
    private IQuestionTypeRepository iQuestionTypeRepository;
    @Override
    public List<QuestionType> findByAll() {
        return iQuestionTypeRepository.findAll();
    }
}
