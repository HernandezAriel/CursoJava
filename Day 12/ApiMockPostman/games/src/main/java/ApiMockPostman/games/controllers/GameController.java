package ApiMockPostman.games.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ApiMockPostman.games.models.Game;
import ApiMockPostman.games.services.GameService;

@RestController
@RequestMapping("/game")

public class GameController {

    GameService gService = new GameService();

    @GetMapping()
    public ArrayList<Game> getGames(){
        return gService.getGames();
    }

    @GetMapping("/type")
    public ArrayList<Game> getGamesByType(@RequestParam("type")String type){
        return gService.getGamesByType(type);
    }

    @PostMapping
    public void putGame(@RequestBody Game game){
        gService.putGame(game);
    }
}
