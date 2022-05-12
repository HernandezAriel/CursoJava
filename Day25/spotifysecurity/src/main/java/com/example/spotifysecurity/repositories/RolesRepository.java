package com.example.spotifysecurity.repositories;

import com.example.spotifysecurity.models.Role;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RolesRepository extends JpaRepository<Role, Long> {
    
    public Role getById(long id);
}
