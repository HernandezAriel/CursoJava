package com.example.day22.controllers.repositories;

import com.example.day22.models.Subject;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjetctRepository extends JpaRepository<Subject,Long>{
    
}
