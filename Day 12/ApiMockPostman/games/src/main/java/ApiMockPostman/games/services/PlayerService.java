package ApiMockPostman.games.services;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import ApiMockPostman.games.models.Player;

@Service
public class PlayerService {
    
    ArrayList<Player> players = new ArrayList<>();

   
    public void putPlayer(Player player) {
        players.add(player);
    }

    public ArrayList<Player> getPlayers(){
        return players;
    }

    public ArrayList<Player> getPlayersByType(String type){
        ArrayList<Player> playersType = new ArrayList<Player>();

        for(Player e: players){
            if(e.getType().equals(type)){
                playersType.add(e);
            }
        }

        return playersType;
    }
}
