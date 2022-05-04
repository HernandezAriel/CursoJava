package com.example.day22.controllers.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.day22.controllers.repositories.GameRepository;
import com.example.day22.models.Game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    
    @Autowired
    GameRepository gameRepository;

    public Game save(Game game){
        return gameRepository.save(game);
    }

    public ArrayList<Game> getAll(){
        return (ArrayList<Game>) gameRepository.findAll();
    }

    public Optional<Game> getById(long id){
        return gameRepository.findById(id);
    }

    public void delete(long id){
        gameRepository.deleteById(id);
    }

    public Game update(Game game, long id){
        game.setId(id);
        return gameRepository.save(game);
    }

}
