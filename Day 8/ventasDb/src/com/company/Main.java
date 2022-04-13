package com.company;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connect c = new Connect();
        c.conexionDb();
        c.selectClient();

    }
}
