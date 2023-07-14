package com.ninos.controller;

import java.util.Map;
import java.util.Objects;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ninos.dto.UserAuthDTO;

@RestController
@RequestMapping("/user")
public class UserController {


    @PostMapping("/create")
    public ResponseEntity<UserAuthDTO> create(@RequestBody Map<String, Objects> params){
        return null;
    }


}




