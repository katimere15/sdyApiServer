package com.spring.domain.login.controller;

import org.springframework.web.bind.annotation.RestController;

import com.spring.domain.login.dto.LoginDto;
import com.spring.domain.login.service.LoginService;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequiredArgsConstructor
public class LoginController {
    
    // 필드 선언
    private final LoginService loginService;

    @PostMapping("/api/login")
    public String postMethodName(@RequestBody LoginDto loginDto) {
        
        String result = loginService.login(loginDto);
        return result;
    }
    
}
