package com.spring.api.login.service;

import com.spring.api.login.dto.LoginDto;

public interface LoginService {
    // This interface will define methods related to login functionality
    // For example, it can have methods for user authentication, session management, etc.

    String login(LoginDto loginDto);
}
