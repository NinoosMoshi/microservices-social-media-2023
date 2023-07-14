package com.ninos.controller;

import java.util.Map;
import java.util.Objects;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ninos.dto.AuthDTO;
import com.ninos.dto.UserAuthDTO;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login/user")
    public ResponseEntity<AuthDTO> loginUser(@RequestBody Map<String, Objects> params){
        return null;
    }

    @PostMapping("/login/organization")
    public ResponseEntity<AuthDTO> loginOrganization(@RequestBody Map<String, Objects> params){
        return null;
    }





    @PostMapping("/token")
    public ResponseEntity<Map<String, Objects>> validateToken(@RequestBody String token){
        return null;
    }



}
