package br.com.treinar.bb.modelo;

import br.com.treinar.bb.modelo.banco.Conta;
import br.com.treinar.bb.modelo.banco.ICaptalizavel;
import br.com.treinar.bb.modelo.banco.ITarifavel;
import br.com.treinar.bb.modelo.banco.SaldoInsuficienteException;

public class ContaInvestimento extends Conta implements ITarifavel, ICaptalizavel {

	private static final long serialVersionUID = 1L;
	
	private Double taxaRendimento;
	private Double taxaManutencao;
	private Integer mesesParaResgate;

	@Override
	public void sacar(Double valor) throws SaldoInsuficienteException {
		valor += 2;
		if (getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
		} else {
			SaldoInsuficienteException sie = new SaldoInsuficienteException();
			sie.setSaldoAtual(recuperarSaldo());
		}
	}

	@Override
	public void captalizar() {
		Double valor = getSaldo() * taxaRendimento / 100;
		depositar(valor > 0 ? valor : 0d);
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

	public Double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(Double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

	public Double getTaxaManutencao() {
		return taxaManutencao;
	}

	public void setTaxaManutencao(Double taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}

	public Integer getMesesParaResgate() {
		return mesesParaResgate;
	}

	public void setMesesParaResgate(Integer mesesParaResgate) {
		this.mesesParaResgate = mesesParaResgate;
	}

}
