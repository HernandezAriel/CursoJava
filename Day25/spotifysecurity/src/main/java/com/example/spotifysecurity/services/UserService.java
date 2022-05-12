package com.example.spotifysecurity.services;

import java.util.List;

import com.example.spotifysecurity.models.User;
import com.example.spotifysecurity.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public void save (User user){
        userRepository.save(user);
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public User getByEmail(String email){
        return userRepository.getByEmail(email);
    }

    public User getById(long id){
        return userRepository.getById(id);
    }

    public void delete(long id){
        userRepository.deleteById(id);
    }
}
