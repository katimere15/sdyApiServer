package com.spring.domain.login.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.domain.login.dto.LoginDto;
import com.spring.domain.login.mapper.LoginMapper;
import com.spring.domain.login.service.LoginService;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {

    private final LoginMapper loginMapper;

    @Override
    public String login(LoginDto loginDto) {
        String result = loginMapper.login(loginDto);
        return result;
    }
}
