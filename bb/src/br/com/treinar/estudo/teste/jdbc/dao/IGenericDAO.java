package br.com.treinar.estudo.teste.jdbc.dao;

import java.util.List;

import br.com.treinar.estudo.teste.jdbc.exception.RegistroNaoEncontradoException;

public interface IGenericDAO<T> {

	public void adicionar(T objeto);

	public T recuperarPorID(Long id) throws RegistroNaoEncontradoException, Exception;

	public List<T> getLista();

	public void alterar(T contato);

	public void excluir(Long id);

}
