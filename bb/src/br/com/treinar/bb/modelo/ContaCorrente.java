package br.com.treinar.bb.modelo;

import br.com.treinar.bb.modelo.banco.Conta;
import br.com.treinar.bb.modelo.banco.ITarifavel;
import br.com.treinar.bb.modelo.banco.SaldoInsuficienteException;

public class ContaCorrente extends Conta implements ITarifavel {

	private static final long serialVersionUID = 1L;
	
	private Double limiteCredito;
	private Double limiteCreditoAUtilizar;
	private Double taxaManutencao;

	@Override
	public void sacar(Double valor) throws SaldoInsuficienteException {
		valor += 1;
		if (getSaldo() + limiteCreditoAUtilizar >= valor) {
			if (getSaldo() >= valor) {
				setSaldo(getSaldo() - valor);				
			} else {
				valor = valor - getSaldo();
				setSaldo(0d);
				limiteCreditoAUtilizar -= valor;
			}
		} else {
			SaldoInsuficienteException sie = new SaldoInsuficienteException();
			sie.setSaldoAtual(recuperarSaldo());
			throw sie;
		}
	}
	
	@Override
	public void depositar(Double valor) {
		if (limiteCreditoAUtilizar < limiteCredito) {
			if ((limiteCredito - limiteCreditoAUtilizar) >= valor) {
				limiteCreditoAUtilizar += valor;
				valor = 0d;
			} else {
				valor -= limiteCredito - limiteCreditoAUtilizar;
				limiteCreditoAUtilizar = limiteCredito;
			}
			
		}
		super.depositar(valor);
	}

	@Override
	public Double recuperarSaldo() {
		return super.recuperarSaldo() + limiteCreditoAUtilizar;
	}

	public Double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(Double limiteCredito) {
		this.limiteCredito = limiteCredito;
		this.limiteCreditoAUtilizar = new Double(limiteCredito);
	}

	public Double getLimiteCreditoAUtilizar() {
		return limiteCreditoAUtilizar;
	}

	public void setLimiteCreditoAUtilizar(Double limiteCreditoAUtilizar) {
		this.limiteCreditoAUtilizar = limiteCreditoAUtilizar;
	}

	public Double getTaxaManutencao() {
		return taxaManutencao;
	}

	public void setTaxaManutencao(Double taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}

	@Override
	public void tarifar() {
		try {
			sacar(taxaManutencao);
		} catch (SaldoInsuficienteException e) {
			//TODO - comunicar gerente que a conta nao possui 
			//saldo para pagar as tarifas provavelmente devera ser cancelada
		}
	}
}
