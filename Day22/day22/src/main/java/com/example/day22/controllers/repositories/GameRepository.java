package com.example.day22.controllers.repositories;

import com.example.day22.models.Game;

import org.springframework.data.repository.CrudRepository;

public interface GameRepository extends CrudRepository<Game, Long>{
     
}
