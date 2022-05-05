package com.example.day22.controllers;

import java.util.ArrayList;

import com.example.day22.controllers.services.UserService;
import com.example.day22.models.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    UserService userService;

    @GetMapping()
    public ArrayList<User> getGames(){
        return userService.getUsers();
    }

    @GetMapping("/{id}")
    public ArrayList<User> findUsersById(@RequestParam("id") long id){
        return userService.findUsersById(id);
    }

    @PostMapping("/create")
    public void saveUser(@RequestBody User user){
        userService.saveUser(user);
    }
}
