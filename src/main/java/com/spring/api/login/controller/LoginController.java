package com.spring.api.login.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.api.login.dto.LoginDto;
import com.spring.api.login.service.LoginService;

import lombok.RequiredArgsConstructor;



@RestController
@RequiredArgsConstructor
public class LoginController {
    
    // 필드 선언
    private final LoginService loginService;

    @PostMapping("/test")
    public String postMethodName(@RequestBody LoginDto loginDto) {
        System.out.println("postMethodName called with: " + loginDto.getId() + ", " + loginDto.getPw());


        return loginService.login(loginDto);
    }
    
    
}
