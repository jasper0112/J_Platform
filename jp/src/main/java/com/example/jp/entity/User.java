package com.example.jp.entity;
import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

@Entity
public class User {
    @Id
    @GeneratedValue
    private UUID id;
    private String username;
    private String email;
    private String password;
    private Role role;
}
