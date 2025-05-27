package com.spring.domain.login.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class LoginController {
    
    @PostMapping("/api/login")
    public String postMethodName(@RequestBody String entity) {
        
        
        return "테스트 중입니다.";
    }
    
}
