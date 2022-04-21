package day13.day13.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import day13.day13.models.User;
import day13.day13.repositories.UserRepository;

@RestController
@RequestMapping("/api/users")
public class UserController {
    
    @Autowired
    UserRepository userRepository;

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        try{
            List<User> users = new ArrayList<User>();
            userRepository.findAll().forEach(users::add);
            if(users.isEmpty()){
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(users, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{dni}")
    public ResponseEntity<List<User>> getUsersById(@PathVariable("dni")int dni) {
        try{
            List<User> users = new ArrayList<User>();
            userRepository.findByDni(dni).forEach(users::add);
            if(users.isEmpty()){
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(users, HttpStatus.OK);
        } catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping()
    public ResponseEntity<User> createUser(@RequestBody User users){
        try {
            User users1 = userRepository.save(new User(users.getFirstName(), users.getLastName(), users.getEmail(), users.getDni()));
            return new ResponseEntity<>(users1, HttpStatus.CREATED);
        } catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
