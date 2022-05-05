package com.example.day22.controllers.services;

import java.util.ArrayList;

import com.example.day22.controllers.repositories.SubjetctRepository;
import com.example.day22.models.Subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class SubjectService {
    
    @Autowired
    SubjetctRepository subjetctRepository;

    public ArrayList<Subject> getUsers(){
        return (ArrayList<Subject>) subjetctRepository.findAll();
    }

    public void saveUser(Subject subject){
        subjetctRepository.save(subject);
    }
}