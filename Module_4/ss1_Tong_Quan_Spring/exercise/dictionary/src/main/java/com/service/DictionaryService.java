package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.repository.IDictionaryRepository;


@Service
public class DictionaryService implements  IDictionaryService{

    @Autowired
    IDictionaryRepository iDictionaryRepository;
    @Override
    public String findVocabulary(String key) {
        return iDictionaryRepository.findVocabulary(key);
    }
}
