package br.com.treinar.bb.modelo;

import br.com.treinar.bb.modelo.banco.Conta;
import br.com.treinar.bb.modelo.banco.ICaptalizavel;
import br.com.treinar.bb.modelo.banco.SaldoInsuficienteException;

public class ContaPoupanca extends Conta implements ICaptalizavel {

	private static Double taxaRendimento;
	
	@Override
	public void sacar(Double valor) throws SaldoInsuficienteException {
		if (getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
		} else {
			SaldoInsuficienteException sie = new SaldoInsuficienteException();
			sie.setSaldoAtual(recuperarSaldo());
			throw sie;
			//TODO - comunicar gerente que a conta nao possui 
			//saldo para pagar as tarifas provavelmente devera ser cancelada
		}
		
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
