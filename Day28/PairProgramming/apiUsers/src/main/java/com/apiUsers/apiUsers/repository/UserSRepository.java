package com.apiUsers.apiUsers.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;

import java.util.Optional;

public interface UserSRepository extends JpaRepository<User, Integer> {

    public Optional<User> findByUsername (String username);
}
