package br.com.treinar.bb.modelo;

import br.com.treinar.bb.modelo.banco.Conta;

public class ContaCorrente extends Conta {

	public Double limiteCredito;
	public Double taxaManutencao;
	
	@Override
	public Boolean sacar(Double valor) {
		valor += 1;
		Boolean sacou = Boolean.FALSE;
		if (getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
			sacou = Boolean.TRUE;
		}
		return sacou;
	}
	
	@Override
	public Double recuperarSaldo() {
		return super.recuperarSaldo() + limiteCredito;
	}

}
