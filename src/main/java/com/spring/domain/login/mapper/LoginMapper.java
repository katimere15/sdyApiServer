package com.spring.domain.login.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.spring.domain.login.dto.LoginDto;

@Mapper
public interface LoginMapper {

    String login(LoginDto loginDto);
}
