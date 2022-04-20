package Day11.futbolDay11.models;

public class Player {

    private static int id;
    private int pId;
    private String firstName;
    private String lastName;
    private String dni;
    private String pos;

    public Player(String firstName, String lastName, String dni, String pos) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dni = dni;
        this.pos = pos;
        id++;
        this.pId = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getId() {
        return pId;
    }

    public void setId(int id) {
       this.pId = id;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }    
}

