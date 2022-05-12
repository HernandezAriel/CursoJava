package com.example.spotifysecurity.services;

import java.util.List;

import com.example.spotifysecurity.models.Role;
import com.example.spotifysecurity.repositories.RolesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    UserService userService;
    @Autowired
    private RolesRepository rolesRepository;

    public void save(Role user) {
        rolesRepository.save(user);
    }

    public boolean isPremium(long id) {
        if (rolesRepository.getById(userService.getById(id).getRole()).getDescription().equals("PREMIUM")) {
            return true;
        } else {
            return false;
        }
    }

    public List<Role> getAll() {
        return rolesRepository.findAll();
    }

    public Role getById(long id) {
        return rolesRepository.getById(id);
    }

    public void delete(long id) {
        rolesRepository.deleteById(id);
    }
}
