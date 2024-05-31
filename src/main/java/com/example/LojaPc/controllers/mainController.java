package com.example.LojaPc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class mainController  {

    @GetMapping("/")
    public String Index() {
        return new String("index");
    }
    
}