package conexionBD;
import java.sql.*;

import conexionBd.insertUser;

public class Conexion {
    
    public static void main(String[] args) throws SQLException {
        InsertUser u1 = new InsertUser();
        if(u1.getInsertado()){
            System.out.println("Registro Insertado");
        }
        else {
            System.out.println("Registro NO Insertado");
        }

    }
}