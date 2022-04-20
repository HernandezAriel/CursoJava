package Day11.futbolDay11.services;
import Day11.futbolDay11.models.Player;

import java.util.ArrayList;
import org.springframework.stereotype.Service;

@Service

public class PlayerService {
    
    private static ArrayList<Player> players = new ArrayList<>();

    public ArrayList<Player> getPlayers(){
        return players;
    }

    public void putPlayer(Player player){
        players.add(player);
    }

    public void deleteById(int id){
        for(int i = 0; i < players.size(); i++){
            if(id == players.get(i).getId()){
                players.remove(i);
                break;
            }
        }
    }

    public ArrayList<Player> getPlayersByPos(String pos){
        ArrayList<Player> playerFilter = new ArrayList<Player>();

        for(Player e: players){
            if(e.getPos().equals(pos)){
                playerFilter.add(e);
            }
        }

        return playerFilter;
    }

}
