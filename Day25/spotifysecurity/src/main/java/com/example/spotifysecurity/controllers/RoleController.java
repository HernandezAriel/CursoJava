package com.example.spotifysecurity.controllers;

import java.util.List;

import com.example.spotifysecurity.models.Role;
import com.example.spotifysecurity.services.RoleService;

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
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    private RoleService uS;
    @GetMapping
    public List<Role> getAll(){
        return uS.getAll();
    }

    @GetMapping("/isAdmin/{id}")
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
