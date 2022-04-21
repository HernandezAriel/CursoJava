package ApiMockPostman.games.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ApiMockPostman.games.models.Player;
import ApiMockPostman.games.services.PlayerService;

@RestController
@RequestMapping("/player")

public class PlayerController {

    PlayerService pService = new PlayerService();

    @GetMapping()
    public ArrayList<Player> getPlayers(){
        return pService.getPlayers();
    }

    @GetMapping("/type")
    public ArrayList<Player> getPlayersByType(@RequestParam("type")String type){
        return pService.getPlayersByType(type);
    }

    @PostMapping
    public void putPlayer(@RequestBody Player player){
        pService.putPlayer(player);
    }
}
