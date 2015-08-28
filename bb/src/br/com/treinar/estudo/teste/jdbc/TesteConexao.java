package br.com.treinar.estudo.teste.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

	public static void main(String[] args) {
		try {
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/treinar", "root", "");
            System.out.println("conectado " + c.getClass().getName());
		} catch (SQLException e) {
            throw new RuntimeException(e);
        }
	}
	
	
}
