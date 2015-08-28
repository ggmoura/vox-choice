package br.com.treinar.estudo.teste.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCInsere {

    public static void main(String[] args) throws SQLException {
    	Connection con = null;
    	try {
        // conectando
        con = ConnectionFactory.getConnection();

        // cria um preparedStatement
        String sql = "insert into contato (nome,email,endereco,dataNascimento)" +
                	 " values (?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);

        // preenche os valores
			stmt.setString(1, "Treinar");
        stmt.setString(2, "contato@caelum.com.br");
        stmt.setString(3, "R. Vergueiro 3185 cj57");
        stmt.setDate(4, new java.sql.Date(System.currentTimeMillis()));

        // executa
        stmt.execute();
        stmt.close();

        System.out.println("Gravado!");

    	} catch (SQLException e) {
    		e.printStackTrace();
    	} finally {
    		con.close();
    	}
    }
}