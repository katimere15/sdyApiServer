package com.spring.domain.login.service;

public interface LoginService {
    // This interface will define methods related to login functionality
    // For example, it can have methods for user authentication, session management, etc.

    boolean authenticateUser(String username, String password);

    void logoutUser(String username);

    boolean isUserLoggedIn(String username);
}
