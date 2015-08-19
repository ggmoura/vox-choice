package br.com.treinar.bb.modelo;

import br.com.treinar.bb.modelo.banco.Conta;
import br.com.treinar.bb.modelo.banco.ICaptalizavel;
import br.com.treinar.bb.modelo.banco.ITarifavel;

public class ContaInvestimento extends Conta implements ITarifavel, ICaptalizavel {

	private Double taxaRendimento;
	private Double taxaManutencao;
	private Integer mesesParaResgate;

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

	@Override
	public void captalizar() {
		Double valor = getSaldo() * taxaRendimento / 100;
		depositar(valor > 0 ? valor : 0d);
	}

	@Override
	public void tarifar() {
		sacar(taxaManutencao);
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
