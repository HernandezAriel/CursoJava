package com.example.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.example.api.models.Role;
import com.example.api.repositories.RoleRepository;

@Service
public class RoleService {

    @Autowired
    UserService uS;
    @Autowired
    private RoleRepository uR;

    public void save(Role user){
        uR.save(user);
    }

    public boolean isPremium(long id) {
        if (uR.getById( uS.getById(id).getRole() ).getDescription().equals("PREMIUM")){
            return  true;
        }else{
            return false;
        }
    }

    public List<Role> getAll(){
        return uR.findAll();
    }

    public Role getById(long id){
        return uR.getById(id);
    }

    public void delete(long id){
        uR.deleteById(id);
    }
}