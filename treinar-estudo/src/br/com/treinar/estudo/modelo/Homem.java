package br.com.treinar.estudo.modelo;

import br.com.treinar.estudo.modelo.principal.Pessoa;

public class Homem extends Pessoa {

	public Integer tamanhoBarba;

	@Override
	public void caminhar() {
		System.out.println("caminha pisando duro");
	}
	
}
