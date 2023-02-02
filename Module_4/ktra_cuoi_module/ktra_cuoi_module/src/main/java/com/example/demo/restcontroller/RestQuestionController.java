package com.example.demo.restcontroller;

import com.example.demo.model.QuestionContent;
import com.example.demo.service.IQuestionService;
import com.example.demo.service.IQuestionTypeService;
import com.example.demo.validate.QuestionValidate;
import org.aspectj.weaver.patterns.TypePatternQuestions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RestQuestionController {
    @Autowired
    private IQuestionService iQuestionService;
    @Autowired
    private IQuestionTypeService iQuestionTypeService;

    @GetMapping("/list")
    public ResponseEntity<List<QuestionContent>> getListQuestion(){
        return  new ResponseEntity<>(iQuestionService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<QuestionContent> getQuestionById(@PathVariable("id") String id) {
        QuestionContent questionContent = iQuestionService.findById(id);
        if(questionContent ==null){
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(questionContent,HttpStatus.OK);
    }
    @GetMapping("/search")
    public ResponseEntity<List<QuestionContent>>list(Model model, @RequestParam(value = "name",defaultValue = "") String name){
        List<QuestionContent> questionContents = "".equals(name) ? iQuestionService.findAll() : iQuestionService.searchByRest(name);
        return new ResponseEntity<>(questionContents,HttpStatus.OK);
    }


}
