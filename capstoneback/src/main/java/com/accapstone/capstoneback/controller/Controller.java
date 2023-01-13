package com.accapstone.capstoneback.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class Controller {
    
    @GetMapping("/posts")
    public String home() {
        return "Welcome to The Fold";
    }
    
    @PostMapping("/posts")
    public SomeEnityData postMethodName(@RequestBody SomeEnityData entity) {
        //TODO: process POST request
        
        return entity;
    }
    

}
