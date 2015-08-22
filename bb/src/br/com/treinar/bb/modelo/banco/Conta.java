package br.com.treinar.bb.modelo.banco;

import br.com.treinar.bb.modelo.Pessoa;

//Modelo de conta 
public abstract class Conta implements IProduto {

	// atributos
	private Long numeroConta;
	private Pessoa cliente;
	private Double saldo;
	private SituacaoConta situacao;

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

	public SituacaoConta getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoConta situacao) {
		this.situacao = situacao;
	}

	@Override
	public Long getCodigo() {
		return numeroConta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((numeroConta == null) ? 0 : numeroConta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numeroConta == null) {
			if (other.numeroConta != null)
				return false;
		} else if (!numeroConta.equals(other.numeroConta))
			return false;
		return true;
	}

}
