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
        int validation = usersRepository.countByIdAndPw(loginDto.getId(), loginDto.getPw());
        
        if (validation == 1){
            return "로그인 성공";
        } else {
            return "로그인 실패 - 아이디가 존재하지 않거나 비밀번호가 틀렸습니다.";
        }
    }

    @Override
    public String idCheck(LoginDto loginDto) {
        Optional<Users> validation = usersRepository.findById(loginDto.getId());

        if (validation.isPresent()) {
            return "아이디가 존재합니다. 입력 id : " + validation.get().getId();
        } else {
            return "아이디가 존재하지 않습니다.";
        }
    }
}
