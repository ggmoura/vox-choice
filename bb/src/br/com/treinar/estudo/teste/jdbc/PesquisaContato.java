package br.com.treinar.estudo.teste.jdbc;

import java.util.List;

import br.com.treinar.estudo.teste.jdbc.dao.ContatoDAO;
import br.com.treinar.estudo.teste.jdbc.modelo.Contato;

public class PesquisaContato {

	public static void main(String[] args) {
		ContatoDAO dao = new ContatoDAO();
		List<Contato> contatos = dao.getLista();
		for (Contato contato : contatos) {
			System.out.println(contato);
		}
	}
	
}
