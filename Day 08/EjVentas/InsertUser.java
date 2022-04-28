package conexionBD;
import java.sql.*;

public class InsertUser {
    public boolean insertado = false;
    public InsertUser() throws SQLExeption{
       
        DataBase dbc = new DataBase();

        /*
        if(dbc.getConnection() != null){

            try{
            String query =  "INSERT INTO users (email_user, firstName, lastName) values(?,?,?)";
            PreparedStatement ps = dbc.getConnection().PreparedStatement(query);
            ps.setString(1, "email@gmail.com");
            ps.setString(2, "Juan");
            ps.setString(3, "Acosta");
            ps.executeUpdate();
            this.insertado = true;
            }
            catch (Exception e){
                System.out.println("Error al insertar. "+e.getMessage().toString());
            }
        }*/

        if(dbc.getConnection() != null){

            try{
            String query =  "UPDATE users SET firstName=?, lastName=?, where id=?,";
            PreparedStatement ps = dbc.getConnection().PreparedStatement(query);
            ps.setString(1, "ejemplo");
            ps.setString(2, "prueba");
            ps.setString(3, 4);
            ps.executeUpdate();
            this.insertado = true;
            }
            catch (Exception e){
                System.out.println("Error al updatear. "+e.getMessage().toString());
            }
        }
    }

    public boolean getInsertado(){
        return this.insertado;
    }
}
