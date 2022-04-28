package database;

import java.sql.*;
import javax.swing.JOptionPane;

import models.Vendor;

public class DbVendorControl {
    private Conection conection;

    private Connection con;

    public DbVendorControl(){
        conection = new Conection();
    }

    public void insertVendor(Vendor vendor) {

        PreparedStatement ps;
        PreparedStatement ps2;
        String sql;

        try{

            Connection con = conection.getConnection();

            sql = "insert into Vendor( firstname, lastname, dni, Address, birth ,salary) values (?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);

            ps.setString(1, vendor.getFirstName());
            ps.setString(2, vendor.getLastName());
            ps.setString(3, vendor.getDni());
            ps.setString(4, vendor.getAddress());
            ps.setDate(5, (Date) vendor.getBirthSQL());

            ps.setDouble(6, vendor.getSalary());
            ps.executeUpdate();

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
    }

    public void selectVendors() {
        Connection con = conection.getConnection();

        try {

            String sql = "select idVendor,  firstName, lastName, dni from Vendor c inner join personInfo p on c.idInfo = p.idInfo";
            PreparedStatement stmtt =  con.prepareStatement(sql);
            ResultSet rs = stmtt.executeQuery(sql);

            System.out.println("VENDORS: ");
            while (rs.next()) {
                System.out.println("Id: " + rs.getInt("idVendor")+ ", Name: " + rs.getString("firstName") + " " + rs.getString("lastName") +", DNI: "+rs.getString("dni") );
            }
            rs.close();
            stmtt.close();

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
