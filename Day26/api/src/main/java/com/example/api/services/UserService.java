package com.example.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.example.api.models.User;
import com.example.api.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository uR;

    public void save(User user){
        uR.save(user);
    }

    public List<User> getAll(){
        return uR.findAll();
    }

    public User getByEmail(String email){
        return uR.getByEmail(email);
    }

    public User getById(long id){
        return uR.getById(id);
    }

    public void delete(long id){
        uR.deleteById(id);
    }
}