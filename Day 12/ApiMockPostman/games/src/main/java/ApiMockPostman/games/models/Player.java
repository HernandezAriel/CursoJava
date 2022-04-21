package ApiMockPostman.games.models;

public class Player {
    
    private static int id;
    private int idPlayer;
    private String nickName;
    private String type;

    public Player(String nickName, String type){
        this.nickName = nickName;
        this.type = type;
        id++;
        this.idPlayer = id;
    }

    public int getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(int idPlayer) {
        this.idPlayer = idPlayer;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
