package br.com.treinar.bb.modelo.banco;

public interface ITarifavel extends IProduto {

	Integer DIA_TARIFACAO = 5;
	
	void tarifar();
	
}
