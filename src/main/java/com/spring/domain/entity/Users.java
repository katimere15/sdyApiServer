package com.spring.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Users {
    
    @Id
    private String id;
    private String pw;
    private String name;
    private String phone;

}
