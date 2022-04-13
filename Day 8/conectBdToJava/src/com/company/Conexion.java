package com.company;
import java.sql.*;

public class Conexion {

    public void conexionDb(){

        String urlServer = "jdbc:mysql://localhost:3306/academy1";
        String userDb = "root";
        String passBd = "7634283266_Cynad";
        Connection conectar = null;

        try{
        conectar = DriverManager.getConnection(urlServer, userDb, passBd);
            System.out.println("Conexion Exitosa");

            String query = "SELECT * FROM users";
            Statement st = conectar.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()) {
                int id = rs.getInt(idEstudiante); //En los parametros va el nombre de la columna.
                String name = rs.getString("firstName");
                System.out.println("id: " + id + "Name: " + name);
            }
        }
        catch (SQLException e){
            System.out.println("Error en conexion.");
        }
    }

}
