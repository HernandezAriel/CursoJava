package ApiMockPostman.games.models;

public class Game {

    private static int id;
    private int gameId;
    private String name;
    private String type;

    public Game(String name, String type) {
        this.name = name;
        this.type = type;
        id++;
        this.gameId = id;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
