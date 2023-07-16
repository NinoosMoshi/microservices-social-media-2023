package com.ninos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/home")
    public String home(){
        return "this is home page";
    }


    @GetMapping("/about")
    public String about(){
        return "this is about page";
    }


}
