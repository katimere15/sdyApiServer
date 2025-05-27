package com.spring.api.login.service;

import com.spring.domain.entity.Users;

public interface LoginService {
    // This interface will define methods related to login functionality
    // For example, it can have methods for user authentication, session management, etc.

    String login(Users loginDto);
}
