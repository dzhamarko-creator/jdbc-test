package main.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            // Loads MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/northwind";
            String user = "root";
            String password = "Sss123123"; //

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected successfully!");

            connection.close();

        } catch (SQLException e) {
            System.out.println("SQL ERROR: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC DRIVER NOT FOUND: " + e.getMessage());
        }
    }
}