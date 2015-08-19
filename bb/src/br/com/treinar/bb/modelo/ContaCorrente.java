package br.com.treinar.bb.modelo;

import br.com.treinar.bb.modelo.banco.Conta;
import br.com.treinar.bb.modelo.banco.ITarifavel;

public class ContaCorrente extends Conta implements ITarifavel {

	private Double limiteCredito;
	private Double limiteCreditoAUtilizar;
	private Double taxaManutencao;

	@Override
	public Boolean sacar(Double valor) {
		valor += 1;
		Boolean sacou = Boolean.FALSE;
		if (getSaldo() + limiteCreditoAUtilizar >= valor) {
			if (getSaldo() >= valor) {
				setSaldo(getSaldo() - valor);				
			} else {
				valor = valor - getSaldo();
				setSaldo(0d);
				limiteCreditoAUtilizar -= valor;
			}
			sacou = Boolean.TRUE;
		}
		return sacou;
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
		sacar(taxaManutencao);
	}

}
