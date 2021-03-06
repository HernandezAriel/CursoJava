package com.apiUsers.apiUsers.controller;


import com.apiUsers.apiUsers.model.User;
import com.apiUsers.apiUsers.service.UserService;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

@PreAuthorize("authenticated")
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService us;
/*
    @PostMapping
    public void createUser(@RequestBody User user) {
        try {
            us.saveUser(user);
        }catch (Exception e){

        }

    }
*/
@PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        try {
            us.saveUser(user);
            return new ResponseEntity<>(HttpStatus.CREATED);
            // return ResponseEntity.status(200).body("User created");

        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }


    }


    @PreAuthorize("hasRole('ROLE_USER')")
    @GetMapping
    public List<User> getAll(){
        return us.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") int id) {
        return us.getOneUser(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") int id) {
        us.deleteUser(id);
    }
}
