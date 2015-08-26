package br.com.treinar.bb.modelo.banco;

public class SaldoInsuficienteException extends Exception {

	private static final long serialVersionUID = 1L;

	private Double saldoAtual;

	public Double getSaldoAtual() {
		return saldoAtual;
	}

	public void setSaldoAtual(Double saldoAtual) {
		this.saldoAtual = saldoAtual;
	}

}
