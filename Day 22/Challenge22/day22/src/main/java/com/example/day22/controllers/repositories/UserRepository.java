package com.example.day22.controllers.repositories;

import com.example.day22.models.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
