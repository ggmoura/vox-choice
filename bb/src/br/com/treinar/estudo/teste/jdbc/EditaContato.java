package br.com.treinar.estudo.teste.jdbc;

import java.util.List;

import br.com.treinar.estudo.teste.jdbc.dao.ContatoDAO;
import br.com.treinar.estudo.teste.jdbc.dao.IGenericDAO;
import br.com.treinar.estudo.teste.jdbc.modelo.Contato;

public class EditaContato {

	public static void main(String[] args) {
		
		IGenericDAO<Contato> dao = new ContatoDAO();
		
		List<Contato> contatos = dao.getLista();
		for (Contato contato : contatos) {
			contato.setNome(contato.getNome() + " - " + System.currentTimeMillis());
			dao.alterar(contato);
		}
	}
	
}
