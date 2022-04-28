package database;

import models.Bill;

import java.sql.*;

import javax.swing.JOptionPane;

import com.mysql.cj.jdbc.CallableStatement;


public class DbBillsControl {

    private Conection conection;
    private Connection con;

    public DbBillsControl() {
        conection = new Conection();
    }

    public void insertBill(Bill bill) {
        int lastId = -1;
        java.sql.CallableStatement ps;
        PreparedStatement ps2;

        String sql;

        Connection con = conection.getConnection();

        try {
            sql = "{CALL BillAdd(?,?,?)}";
            ps = con.prepareCall(sql);
            ps.setInt(1, bill.getClient());
            ps.setInt(2, bill.getVendor());
            ps.registerOutParameter(3, Types.INTEGER);
            ps.executeUpdate();

            int id = ps.getInt(3);
            for (int i = 0; i < bill.getProducts().length; i++) {
                sql = "insert into BillProd (idBill, idProd) values (?,?)";
                ps2 = con.prepareCall(sql);
                ps2.setInt(1, id);
                ps2.setInt(2, bill.getProduct(i));

                ps2.executeUpdate();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error!" + e.getMessage());
        }
    }

    public void selectBill() {
        Connection con = conection.getConnection();

        try {
            String sql = "select idBill, datesql, idClient, idVendor, idProd from BillProd bp inner join Bill b on bp.idBill = b.idBill";
            PreparedStatement stmtt = con.prepareStatement(sql);
            ResultSet rs = stmtt.executeQuery(sql);

            System.out.println("BILLS:  ");
            while (rs.next()) {
                System.out.println("Id: " + rs.getInt("idBill") + ", Date: " + rs.getDate("datesql") + ", Client id:  " + rs.getInt("idClient") + ", Vendor id: : " + rs.getString("idVendor") + ", Product id: " + rs.getInt("idProd"));
            }
            rs.close();
            stmtt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectBillVendor(int id)
    {

        Connection con = conection.getConnection();
        try
        {

            String sql = "select firstname, lastname, dni, salary, idBill from Vendor v inner join Bill b on b.idVendor = v.idVendor where v.idVendor = " + id;
            PreparedStatement stmtt =  con.prepareStatement(sql);
            ResultSet rs = stmtt.executeQuery(sql);


            while (rs.next()) {

                System.out.println("Id Bill: " + rs.getInt("idBill")+ ", Name: " + rs.getString("firstName") +" " + rs.getString("lastName") + ", DNI: " + rs.getString("dni") + ", Salary: " + rs.getDouble("salary") );
            }

            rs.close();
            stmtt.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectBillByDate(int year, int month, int day)
    {

        Connection con = conection.getConnection();
        try
        {

            String sql = "select * from Bill b where DATE(datesql) = " + " '" + year + "-" + month + "-" + day +"'";
            PreparedStatement stmtt =  con.prepareStatement(sql);
            ResultSet rs = stmtt.executeQuery(sql);

            while (rs.next()) {
                System.out.println("Id Bill: " + rs.getInt("idBill")+ ", Date: " + rs.getDate("datesql") +", idClient: " + rs.getInt("idClient") + ", idVendor: " + rs.getInt("idVendor"));
            }

            rs.close();
            stmtt.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
