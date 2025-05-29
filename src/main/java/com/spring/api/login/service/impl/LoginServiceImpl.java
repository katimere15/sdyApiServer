package com.spring.api.login.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.api.login.dto.LoginDto;
import com.spring.api.login.service.LoginService;
import com.spring.domain.entity.Users;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {


    @Override
    public String login(LoginDto loginDto) {
        String result = "ho!";
        return result;
    }
}
