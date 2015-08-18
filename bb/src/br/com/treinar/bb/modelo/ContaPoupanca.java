package br.com.treinar.bb.modelo;

import br.com.treinar.bb.modelo.banco.Conta;

public class ContaPoupanca extends Conta {

	public Double taxaRendimento;
	
	@Override
	public Boolean sacar(Double valor) {
		Boolean sacou = Boolean.FALSE;
		if (getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
			sacou = Boolean.TRUE;
		}
		return sacou;
	}

}
