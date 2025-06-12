package com.spring.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.domain.entity.Users;


public interface UsersRepository extends JpaRepository<Users, String> {

    
    int countByIdAndPw(String id, String pw);

    List<Users> findByIdAndPw(String id, String pw);
}
