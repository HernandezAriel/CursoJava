package com.example.day22.controllers;

import java.util.List;

import com.example.day22.controllers.repositories.GameRepository;
import com.example.day22.controllers.services.GameService;
import com.example.day22.models.Game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/games")
public class GameController {
    
    @Autowired
    GameService gameService;
    
    @GetMapping()
    public String getAll(Model model){   
        model.addAttribute("games", gameService.getAll());
        return "GameIndex";
    }

    @GetMapping("/create")
    public String showFormGame(Model model){
        Game game = new Game();
        model.addAttribute("game", game);
        return "GameCreate";
    }

    @PostMapping("/create")

    
}
