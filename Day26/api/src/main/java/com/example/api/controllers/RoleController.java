package com.example.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.api.models.Role;
import com.example.api.services.RoleService;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    private RoleService uS;
    @GetMapping
    public List<Role> getAll(){
        return uS.getAll();
    }

    @GetMapping("/isPremium/{id}")
    public boolean isPremium(@PathVariable("id") long id){
        return uS.isPremium(id);
    }

    @GetMapping("/{id}")
    public Role getById(@PathVariable("id") long id){
        return uS.getById(id);
    }

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody Role user){
        uS.save(user);
        return ResponseEntity.ok().body("Success.");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") long id){
        uS.delete(id);
        return ResponseEntity.ok().body("Success.");
    }
}