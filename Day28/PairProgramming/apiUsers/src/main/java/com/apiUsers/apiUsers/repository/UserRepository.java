package com.apiUsers.apiUsers.repository;

import com.apiUsers.apiUsers.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface  UserRepository  extends JpaRepository<User, Integer> {
    public boolean existsByUsername(String username);
    public boolean existsByEmail(String email);
    public Optional<User> findByUsername (String username);


}
