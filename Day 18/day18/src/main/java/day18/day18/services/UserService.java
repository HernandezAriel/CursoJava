package day18.day18.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import day18.day18.models.User;
import day18.repositories.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public List<User>getAllUsers(){
        return (List<User>) userRepository.findAll();
    }

    public User getOneUser(int id){
        return userRepository.findById(id).get();
    }

    public boolean saveUser(User user){
        if(userRepository.exitsByUserName(user.getUserName()))return false;
        userRepository.save(user);
        return true;
    }
}
