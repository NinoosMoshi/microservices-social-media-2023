package com.ninos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {


    @GetMapping("/home")
    public String home(){
        return "this is home page";
    }


    @GetMapping("/test")
    public String test(){
        return "this is test page";
    }

}
