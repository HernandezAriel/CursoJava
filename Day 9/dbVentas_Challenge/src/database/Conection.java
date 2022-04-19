package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conection {

    private String bdName = "day9";
    private String user = "root";
    private String pass = "123";

    private String url = "jdbc:mysql://localhost:3306/"
            +bdName +"?userUnicode=true&use"+"JDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&"
            +"serverTimezon=UTC";
    Connection conn = null;

    public Conection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pass);
            if(conn != null){
                System.out.println("Conexion Exitosa!");
            }
        }
        catch (ClassNotFoundException e) {
            System.out.println("Error al conectar");
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public Connection getConnection(){
        return conn;
    }
}
