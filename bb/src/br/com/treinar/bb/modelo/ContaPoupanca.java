package br.com.treinar.bb.modelo;

import br.com.treinar.bb.modelo.banco.Conta;

public class ContaPoupanca extends Conta {

	public Double taxaRendimento;
	
	@Override
	public Boolean sacar(Double valor) {
		Boolean sacou = Boolean.FALSE;
		if (saldo >= valor) {
			saldo -= valor;
			sacou = Boolean.TRUE;
		}
		return sacou;
	}

}
