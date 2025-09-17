package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;

import lombok.Data;

@Data
@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is mandatory")
    private String name;
    
    @Email
    @NotBlank(message = "Email is mandatory")
    private String email;

}
