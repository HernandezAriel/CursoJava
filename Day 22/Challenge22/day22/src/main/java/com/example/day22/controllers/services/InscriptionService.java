package com.example.day22.controllers.services;

import java.util.ArrayList;

import com.example.day22.controllers.repositories.InscriptionRepository;
import com.example.day22.models.Inscription;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InscriptionService {
    
    @Autowired
    InscriptionRepository inscriptionRepository;

    public ArrayList<Inscription> getUsers(){
        return (ArrayList<Inscription>) inscriptionRepository.findAll();
    }

    public void saveUser(Inscription inscription){
        inscriptionRepository.save(inscription);
    }
}