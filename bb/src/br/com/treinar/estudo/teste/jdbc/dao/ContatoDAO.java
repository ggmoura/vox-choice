package br.com.treinar.estudo.teste.jdbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.treinar.estudo.teste.jdbc.ConnectionFactory;
import br.com.treinar.estudo.teste.jdbc.exception.RegistroNaoEncontradoException;
import br.com.treinar.estudo.teste.jdbc.modelo.Contato;

public class ContatoDAO implements IGenericDAO<Contato> {

	// a conexão com o banco de dados
	private Connection connection;

	public ContatoDAO() {
		this.connection = ConnectionFactory.getConnection();
	}

	public void adicionar(Contato contato) {
		String sql = "insert into contato "
				+ "(nome, email, endereco, dataNascimento) values (?, ?, ?, ?)";

		try {
			// prepared statement para inserção
			connection.setAutoCommit(Boolean.FALSE);
			PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

			// seta os valores
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNascimento().getTime()));

			// executa
			stmt.execute();
			ResultSet result = stmt.getGeneratedKeys();
			if(result.next()){
			   contato.setId(result.getLong(1));
			}
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Contato recuperarPorID(Long id) throws RegistroNaoEncontradoException, Exception {
		
		Contato contato = null;
		PreparedStatement stmt = this.connection.prepareStatement("select * from contato where id = ?");
		stmt.setLong(1, id);
		
		ResultSet rs = stmt.executeQuery();
		if (rs.next()) {
			// criando o objeto Contato
			contato = new Contato();
			contato.setId(rs.getLong("id"));
			contato.setNome(rs.getString("nome"));
			contato.setEmail(rs.getString("email"));
			contato.setEndereco(rs.getString("endereco"));

			// montando a data através do Calendar
			Calendar data = Calendar.getInstance();
			data.setTime(rs.getDate("dataNascimento"));
			contato.setDataNascimento(data.getTime());
		} else {
			throw new RegistroNaoEncontradoException();
		}
		return contato;

		
	}
	
	
	public List<Contato> getLista() {
		try {
			List<Contato> contatos = new ArrayList<Contato>();
			PreparedStatement stmt = this.connection
					.prepareStatement("select * from contato");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				// criando o objeto Contato
				Contato contato = new Contato();
				contato.setId(rs.getLong("id"));
				contato.setNome(rs.getString("nome"));
				contato.setEmail(rs.getString("email"));
				contato.setEndereco(rs.getString("endereco"));

				// montando a data através do Calendar
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));
				contato.setDataNascimento(data.getTime());

				// adicionando o objeto à lista
				contatos.add(contato);
			}
			rs.close();
			stmt.close();
			return contatos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void alterar(Contato contato) {
		String sql = "update contato set nome=?, email=?, endereco=?,"
				+ "dataNascimento=? where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNascimento().getTime()));
			stmt.setLong(5, contato.getId());
			stmt.execute();
			ResultSet result = stmt.getGeneratedKeys();
			if(result.next()){
			   result.getLong(1);
			}
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void excluir(Long id) {
		//stub
	}
	

}
