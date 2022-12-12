package com.controller;


import com.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class MusicController {
    @Autowired
    IMusicService iMusicService ;
    @GetMapping
    public String show(){
        iMusicService.findAll();
        return "list";
    }
}
