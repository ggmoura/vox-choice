package br.com.treinar.estudo.teste.jdbc.dao;

import java.util.List;

import br.com.treinar.estudo.teste.jdbc.exception.RegistroNaoEncontradoException;
import br.com.treinar.estudo.teste.jdbc.modelo.Pessoa;

public class PessoaDAO implements IGenericDAO<Pessoa> {

	public void adicionar(Pessoa pessoa) {
		
	}
	
	public Pessoa recuperarPorID(Long id) throws RegistroNaoEncontradoException, Exception {
		return null;
		
	}
	
	public List<Pessoa> getLista() {
		return null;
	}
	
	public void alterar(Pessoa contato) {
		
	}
	
	public void excluir(Long id) {
		
	}
	
}
