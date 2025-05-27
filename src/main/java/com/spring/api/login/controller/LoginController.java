package com.spring.api.login.controller;

import org.springframework.web.bind.annotation.RestController;

import com.spring.api.login.service.LoginService;
import com.spring.domain.entity.Users;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequiredArgsConstructor
public class LoginController {
    
    // 필드 선언
    private final LoginService loginService;

    @PostMapping("/api/login")
    public String postMethodName(@RequestBody Users loginDto) {
        
        String result = loginService.login(loginDto);
        return result;
    }
    
}
