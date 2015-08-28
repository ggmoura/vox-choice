package br.com.treinar.estudo.teste.jdbc;

import br.com.treinar.estudo.teste.jdbc.dao.ContatoDAO;
import br.com.treinar.estudo.teste.jdbc.exception.RegistroNaoEncontradoException;
import br.com.treinar.estudo.teste.jdbc.modelo.Contato;

public class TesteRecuperaPorID {

	public static void main(String[] args) throws Exception {
		
		ContatoDAO d = new ContatoDAO();
		
		Contato c;
		try {
			c = d.recuperarPorID(8l);
			System.out.println(c.getNome());			
		} catch (RegistroNaoEncontradoException e) {
			System.out.println("Registro não ");
		}
		
		
		
	}
	
}
