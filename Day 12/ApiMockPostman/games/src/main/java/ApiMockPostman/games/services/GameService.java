package ApiMockPostman.games.services;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import ApiMockPostman.games.models.Game;

@Service
public class GameService {
    
    ArrayList<Game> games = new ArrayList<>();
        
    public void putGame(Game game) {
        games.add(game);
    }

    public ArrayList<Game> getGames(){
        return games;
    }

    public ArrayList<Game> getGamesByType(String type){
        ArrayList<Game> playerFilter = new ArrayList<Game>();

        for(Game e: games){
            if(e.getType().equals(type)){
                playerFilter.add(e);
            }
        }

        return playerFilter;
    }
    
}