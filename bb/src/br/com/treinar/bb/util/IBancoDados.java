package br.com.treinar.bb.util;

import br.com.treinar.bb.modelo.banco.Conta;

public interface IBancoDados<T> {

	void adicionarConta(Conta conta/*parametro do metodop*/);
	
	Conta recuperarConta(Long numeroConta);
	
	T recuperarContas();
	
	void cancelarConta(Conta c);
	
}
