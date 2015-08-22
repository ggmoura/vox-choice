package br.com.treinar.bb.util;

import java.util.List;

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
public class BancoDadosCollecion implements IBancoDados<List<Conta>> {

	private static BancoDadosCollecion instance;
	
	private Conta[] contas;
	private Integer index;
	
	private BancoDadosCollecion() {
		contas = new Conta[5];
		index = 0;
	}

	public void adicionarConta(Conta conta/*parametro do metodop*/) {
		if (index < contas.length) {
			contas[index++] = conta;			
		}
	}
	
	public Conta recuperarConta(Long numeroConta) {
		Conta conta = null;
		return conta;
	}
	
	static {
		instance = new BancoDadosCollecion();
	}
	
	
	public static BancoDadosCollecion getInstance() {
		return instance;
	}

	public List<Conta> recuperarContas() {
		
		return null;
	}

	@Override
	public void cancelarConta(Conta c) {
		
	}
	
}
