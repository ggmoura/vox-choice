package br.com.treinar.bb.modelo.banco;

import br.com.treinar.bb.modelo.Pessoa;

//Modelo de conta 
public abstract class Conta implements IProduto {

	// atributos
	private Long numeroConta;
	private Pessoa cliente;
	private Double saldo;

	public Conta() {
		saldo = 0d;
	}

	// metodos
	public void depositar(Double valor) {
		saldo += valor;
	}

	public abstract Boolean sacar(Double valor);

	public Double recuperarSaldo() {
		return saldo;
	}

	public Long getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Long numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Pessoa getCliente() {
		return cliente;
	}

	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}

	protected Double getSaldo() {
		return saldo;
	}

	protected void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public Long getCodigo() {
		return numeroConta;
	}
}
