package br.com.treinar.bb.modelo;

import br.com.treinar.bb.modelo.banco.Conta;
import br.com.treinar.bb.modelo.banco.ICaptalizavel;

public class ContaPoupanca extends Conta implements ICaptalizavel {

	private static Double taxaRendimento;
	
	@Override
	public Boolean sacar(Double valor) {
		Boolean sacou = Boolean.FALSE;
		if (getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
			sacou = Boolean.TRUE;
		}
		return sacou;
	}

	public static Double getTaxaRendimento() {
		return taxaRendimento;
	}

	public static void setTaxaRendimento(Double taxaRendimento) {
		ContaPoupanca.taxaRendimento = taxaRendimento;
	}

	@Override
	public void captalizar() {
		Double valor = getSaldo() * taxaRendimento / 100;
		depositar(valor > 0 ? valor : 0d);
	}

	
	
}
