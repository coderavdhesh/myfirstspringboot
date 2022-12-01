package com.avdhesh.practice.myfirstspringboot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    
    @RequestMapping("/home")
    public String function(){
        return "This is the first introductory spring boot application to get familier with its architectural.";
    }
}
