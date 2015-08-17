package br.com.treinar.bb.modelo;

import br.com.treinar.bb.modelo.banco.Conta;

public class ContaInvestimento extends Conta {

	public Double taxaRendimento;
	public Integer mesesParaResgate;
	
	@Override
	public Boolean sacar(Double valor) {
		valor += 2;
		Boolean sacou = Boolean.FALSE;
		if (getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
			sacou = Boolean.TRUE;
		}
		return sacou;
	}

	
	
}
