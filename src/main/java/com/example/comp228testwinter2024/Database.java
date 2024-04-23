package com.example.comp228testwinter2024;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Database {
    private static final String DB_URL = "jdbc:oracle:thin:@199.212.26.208:1521:SQLD";
    private static final String DB_USERNAME = "COMP228_W24_dl_14";
    private static final String DB_PASSWORD = "password";

    private static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";

    static {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load JDBC driver", e);
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
    }

    public static List<Vehicle> getVehiclesByBudget(double budget) {
        List<Vehicle> vehicles = new ArrayList<>();
        String query = "SELECT * FROM Vehicle WHERE price <= ?";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setDouble(1, budget);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String make = rs.getString("make");
                String model = rs.getString("model");
                int year = rs.getInt("year");
                double price = rs.getDouble("price");
                vehicles.add(new Vehicle(make, model, year, price));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle SQLException
            System.err.println("An error occurred while executing the SQL query: " + e.getMessage());
        }
        return vehicles;
    }
}

