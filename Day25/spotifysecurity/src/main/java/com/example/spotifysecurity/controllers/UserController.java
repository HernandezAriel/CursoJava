package com.example.spotifysecurity.controllers;

import java.util.List;

import com.example.spotifysecurity.models.User;
import com.example.spotifysecurity.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAll() {
        return userService.getAll();
    }

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody User user) {
        userService.save(user);
        return ResponseEntity.ok().body("Success.");
    }

    @GetMapping("/{email}")
    public User getByEmail(@PathVariable("email") String email) {
        return userService.getByEmail(email);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") long id) {
        userService.delete(id);
        return ResponseEntity.ok().body("Success.");
    }
}
