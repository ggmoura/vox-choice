package br.com.treinar.bb.modelo;

import br.com.treinar.bb.modelo.banco.Conta;
import br.com.treinar.bb.modelo.banco.SaldoInsuficienteException;


/**
 * Conta salario herda de conta para 
 * @author AS
 *
 */
public class ContaSalario extends Conta {

	public Double valorSalario;
	
	@Override
	public void sacar(Double valor) throws SaldoInsuficienteException {
		if (getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
		} else {
			SaldoInsuficienteException s = new SaldoInsuficienteException();
			s.setSaldoAtual(recuperarSaldo());
			throw s;
		}
	}

}
