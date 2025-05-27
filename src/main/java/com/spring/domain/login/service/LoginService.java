package com.spring.domain.login.service;

import org.springframework.stereotype.Service;

import com.spring.domain.login.dto.LoginDto;

@Service
public interface LoginService {
    // This interface will define methods related to login functionality
    // For example, it can have methods for user authentication, session management, etc.

    String login(LoginDto loginDto);
}
