package br.com.treinar.bb.util;

import br.com.treinar.bb.modelo.banco.Conta;

/**
 * Padrao de projeto singleton
 * 
 * esta classe so pode ser instanciada internamente
 * eh possivel recuperar a instancia dela a partir do metodo 
 * getInstance
 * 
 * @author ADM
 *
 */
public class BancoDados {

	private static BancoDados instance;
	public Conta conta;
	
	static {
		instance = new BancoDados();
	}
	
	private BancoDados() {
		super();
	}
	
	public static BancoDados getInstance() {
		return instance;
	}
	
}
