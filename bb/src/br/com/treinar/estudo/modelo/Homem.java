package br.com.treinar.estudo.modelo;

import br.com.treinar.estudo.modelo.principal.Pessoa;



/**
 * Quando a classe é definida como final, 
 * para que nao possa ser herdada
 * @author ADM
 *
 */
public final class Homem extends Pessoa {

	public Integer tamanhoBarba;

	@Override
	public void caminhar() {
		System.out.println("caminha pisando duro");
	}
	
}
