package com.avdhesh.practice.myfirstspringboot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    
    @RequestMapping("/home")
    public String function(){
        return "kjshda askdjabhs asda afwr wert etyr yyd.";
    }
}
