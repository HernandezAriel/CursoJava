package com.example.day22.controllers.repositories;

import com.example.day22.models.Inscription;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InscriptionRepository extends JpaRepository<Inscription, Long>{
    
}
