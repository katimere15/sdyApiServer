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
    public String loginBtnMethod(@RequestBody LoginDto loginDto) {


        return loginService.login(loginDto);
    }

    
    @PostMapping("/test2")
    public String idCheckBtnMethod(@RequestBody LoginDto loginDto) {


        return loginService.idCheck(loginDto);
    }
    
    
}
