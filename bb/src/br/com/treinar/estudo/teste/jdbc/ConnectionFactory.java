package br.com.treinar.estudo.teste.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public static Connection getConnection() {
        try {
            return DriverManager.getConnection(
          "jdbc:mysql://localhost/treinar", "root", "");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
	
}
