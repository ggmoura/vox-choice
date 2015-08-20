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
	
	private Conta[] contas;
	private Integer index;
	
	private BancoDados() {
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
		for (Conta contaTemp : contas) {
			if (contaTemp != null && 
					contaTemp.getNumeroConta().equals(numeroConta)) {
				conta = contaTemp;
				break;
			}
		}
		return conta;
	}
	
	static {
		instance = new BancoDados();
	}
	
	
	public static BancoDados getInstance() {
		return instance;
	}

	public Conta[] recuperarContas() {
		return contas;
	}
	
}
