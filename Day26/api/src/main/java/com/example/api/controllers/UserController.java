package com.example.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.example.api.models.User;
import com.example.api.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService uS;
    @GetMapping
    public List<User> getAll() {
        return uS.getAll();
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')OR hasRole('ROLE_COMMON')")
    @PostMapping("/save")
    public ResponseEntity save(@RequestBody User user){
        uS.save(user);
        return ResponseEntity.ok().body("Success.");
    }

    @GetMapping("/{email}")
    public User getByEmail(@PathVariable("email") String email){
        return  uS.getByEmail(email);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") long id){
            uS.delete(id);
        return ResponseEntity.ok().body("Success.");
    }
}