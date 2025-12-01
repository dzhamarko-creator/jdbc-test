package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/northwind";
        String user = "root";
        String password = "Ttt123123123@";

        try {
            // driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected successfully!");

            conn.close();

        } catch (SQLException e) {
            System.out.println("SQL ERROR: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC DRIVER NOT FOUND: " + e.getMessage());
        }
    }
}
