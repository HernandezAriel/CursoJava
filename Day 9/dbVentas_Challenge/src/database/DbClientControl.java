package database;

import java.sql.*;
import javax.swing.JOptionPane;
import models.Client;

public class DbClientControl {

    private Conection conection;
    private Connection con;

    public DbClientControl(){
        conection = new Conection();
    }

    public void insertClient(Client client) {

        PreparedStatement ps;
        String sql;

        try{
            Connection con = conection.getConnection();
            sql = "insert into Client( firstName, lastName, dni, Address, birth ) values (?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, client.getFirstName());
            ps.setString(2, client.getLastName());
            ps.setString(3, client.getDni());
            ps.setString(4, client.getAddress());
            ps.setDate(5, (Date) client.getBirthSQL());

            ps.executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
    }

    public void selectClients() {

        Connection con = conection.getConnection();
        try {

            String sql = "select idClient,  firstName, lastName, dni from Clients c inner join personInfo p on c.idInfo = p.idInfo";
            PreparedStatement stmtt =  con.prepareStatement(sql);
            ResultSet rs = stmtt.executeQuery(sql);
            System.out.println("CLIENTS: : ");
            while (rs.next()) {

                System.out.println("Id: " + rs.getInt("idClient")+ ", Name: " + rs.getString("firstName") + " " + rs.getString("lastName") +", DNI: "+rs.getString("dni") );
            }
            rs.close();
            stmtt.close();

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}