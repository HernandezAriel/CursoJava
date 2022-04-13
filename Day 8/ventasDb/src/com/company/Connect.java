package com.company;
import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

public class Connect {

    String urlServer = "jdbc:mysql://localhost:3306/ventasDb";
    String userDb = "root";
    String passBd = "7634283266_Cynad";
    Connection conectar = null;

    public void conexionDb(){

        try{
            conectar = DriverManager.getConnection(urlServer, userDb, passBd);
            System.out.println("Conexion Exitosa");
            }
        catch (SQLException e){
            System.out.println("Error en conexion.");
        }
    }

    public Connection getConnection()
    {
        return conectar;
    }

    public void selectClient() throws SQLException {

        String query = "SELECT * FROM client";
        Statement st = conectar.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next()) {
            int id = rs.getInt("idClient"); //En los parametros va el nombre de la columna.
            String name = rs.getString("firstName");
            String name2 = rs.getString("lastName");
            int dni = rs.getInt("dni");
            String adress = rs.getString("adress");
            System.out.println("id: " + id + "\nName: " + name+ "\nlastName: "+ name2+"\nDni: "+dni+"\nAdress: "+adress);

        }
    }

    public void insertClient(Client c) throws SQLException {
        String query = "INSERT into client(idClient, firstName, lastName, dni, adress) values(?,?,?,?)";
        Statement st = conectar.prepareStatement(query);

        //pendiente
    }
}