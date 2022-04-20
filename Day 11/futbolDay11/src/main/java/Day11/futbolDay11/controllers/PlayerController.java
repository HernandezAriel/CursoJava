package Day11.futbolDay11.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Day11.futbolDay11.services.PlayerService;
import Day11.futbolDay11.models.Player;

@RestController
@RequestMapping("/player")

public class PlayerController {

    PlayerService pService = new PlayerService();

    @GetMapping()
    public ArrayList<Player> getPlayers(){
        return pService.getPlayers();
    }

    @GetMapping("/pos")
    public ArrayList<Player> getPlayersByPos(@RequestParam("pos") String pos)
    {
        return pService.getPlayersByPos(pos);
    }

    @DeleteMapping("/delete/{id}")
        public void delete(@PathVariable("id") int id)
    {
        pService.deleteById(id);
    }
    @PostMapping
        public void putAlfajor(@RequestBody Player player)
    {
        pService.putPlayer(player);
    }

}
