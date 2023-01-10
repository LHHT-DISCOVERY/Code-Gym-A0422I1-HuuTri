package com.example.managerment_iphone.controller;

import com.example.managerment_iphone.model.Smartphone;
import com.example.managerment_iphone.service.ISmartphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@RestController
@RequestMapping("/smartphones")
public class SmartphoneController {
    @Autowired
    private ISmartphoneService smartphoneService;

    @PostMapping
    public ResponseEntity<Smartphone> createSmartphone(@RequestBody Smartphone smartphone) {
        return new ResponseEntity<>(smartphoneService.save(smartphone), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Iterable<Smartphone>> allPhones() {
        return new ResponseEntity<>(smartphoneService.findAll(), HttpStatus.OK);
    }

    @GetMapping("update/{id}")
//    Hết cách => chỉ biết sài ModelAndView =]]
    public ModelAndView editSmartphoneForm(@PathVariable("id") Long id)  {
        Optional<Smartphone> smartphone = smartphoneService.findById(id);
        ModelAndView modelAndView = new ModelAndView("phones/update");
        modelAndView.addObject("smartphone", smartphone.get());
        return modelAndView;
    }

    @PostMapping(value = "update/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Smartphone> editSmartphone(@PathVariable("id") Long id, @RequestBody Smartphone smartphone) {
//        Set lại ID hiện tại
        smartphone.setId(id);
        return new ResponseEntity<>(smartphoneService.save(smartphone) , HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Smartphone> deleteSmartphone(@PathVariable Long id) {
        Optional<Smartphone> smartphoneOptional = smartphoneService.findById(id);
        if (!smartphoneOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        smartphoneService.remove(id);
        return new ResponseEntity<>(smartphoneOptional.get(), HttpStatus.NO_CONTENT);
    }


    @GetMapping("/list")
    public ModelAndView getAllSmartphonePage() {
        ModelAndView modelAndView = new ModelAndView("/phones/list");
        modelAndView.addObject("smartphones", smartphoneService.findAll());
        return modelAndView;
    }


}
