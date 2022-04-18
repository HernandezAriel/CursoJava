package database;
import com.company.*;

import javax.swing.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class dbControl {

    private Conection conection;
    private Connection con;

    public dbControl(){
        conection = new Conection();
    }

    public void insertClient(Client client){
        PreparedStatement ps;
        PreparedStatement ps2;
        String sql;

        try{ //Save personal info

            Connection con = conection.getConnection();
            sql = "insert into personInfo( idpersonInfo, firstname, lastname, dni, adress, birth) values (?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1, client.getId());
            ps.setString(2, client.getFirstName());
            ps.setString(3, client.getLastName());
            ps.setString(4, client.getDni());
            ps.setString(5, client.getAdress());
            ps.setDate(6, Date.valueOf(client.getBirth()));

            ps.executeUpdate();

            sql = "insert into Client(idClient, idpersonInfo) values (?,?)";
            ps2 = con.prepareStatement(sql);
            ps2.setInt(1, client.getIdClient());
            ps2.setInt(2, client.getId());

            ps2.executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
    }

    public void insertVendor(Vendor vendor){
        PreparedStatement ps;
        PreparedStatement ps2;
        String sql;

        try{
            Connection con = conection.getConnection();
            sql = "insert into personInfo( idpersonInfo, firstname, lastname, dni, adress, birth) values (?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1, vendor.getId());
            ps.setString(2, vendor.getFirstName());
            ps.setString(3, vendor.getLastName());
            ps.setString(4, vendor.getDni());
            ps.setString(5, vendor.getAdress());
            ps.setDate(6, Date.valueOf(vendor.getBirth()));

            ps.executeUpdate();

            sql = "insert into Vendor( idVendor, salary, idpersonInfo) values (?,?,?)";
            ps2 = con.prepareStatement(sql);
            ps2.setInt(1, vendor.getIdVendor());
            ps2.setDouble(2, vendor.getSalary());
            ps2.setInt(3, vendor.getId());

            ps2.executeUpdate();

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
    }


}
