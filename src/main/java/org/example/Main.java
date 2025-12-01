package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/northwind";
        String user = "root";
        String password = "Ttt123123123@";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);

            String query = "SELECT productID, productName, unitPrice, unitsInStock FROM products";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("productID");
                String name = rs.getString("productName");
                double price = rs.getDouble("unitPrice");
                int stock = rs.getInt("unitsInStock");

                System.out.println(id + " | " + name + " | $" + price + " | Stock: " + stock);
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
