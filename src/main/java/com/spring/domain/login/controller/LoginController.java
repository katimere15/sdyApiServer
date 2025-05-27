package com.spring.domain.login.controller;

import org.springframework.web.bind.annotation.RestController;

import com.spring.domain.login.dto.LoginDto;
import com.spring.domain.login.service.LoginService;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;



@RestController
public class LoginController {
    
    // 필드 선언
    private final LoginService loginService;
    
    // 생성자 주입 
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/api/login")
    public String postMethodName(LoginDto loginDto) {
        
        String result = loginService.login(loginDto);
        return result;
    }
    
}
