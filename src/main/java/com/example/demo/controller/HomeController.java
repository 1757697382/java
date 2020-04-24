package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController{

	@RequestMapping("/test")
    public String Index(){
        return "你好，这是java后端";
        
    }
    
}
