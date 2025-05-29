package com.spring.api.login.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.api.login.dto.LoginDto;
import com.spring.api.login.service.LoginService;
import com.spring.domain.entity.Users;
import com.spring.domain.repository.UsersRepository;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {

    private final UsersRepository usersRepository;

    @Override
    public String login(LoginDto loginDto) {
        String result = "";
        int validateion = usersRepository.countByIdAndPw(loginDto.getId(), loginDto.getPw());
        //     result = "로그인 성공";
        if (validateion == 1){
            result = "로그인 성공";
        } else {
            result = "로그인 실패 - 아이디가 존재하지 않거나 비밀번호가 틀렸습니다.";
        }

        return result;
    }
}
