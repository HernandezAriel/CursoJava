package com.example.day22.controllers.services;

import java.util.ArrayList;

import com.example.day22.controllers.repositories.UserRepository;
import com.example.day22.models.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    UserRepository userRepository;

    public ArrayList<User> getUsers(){
        return (ArrayList<User>) userRepository.findAll();
    }

    public void saveUser(User user){
        userRepository.save(user);
    }

    public ArrayList<User> findUsersById(long id) {
        return null;
    }
}
