package br.com.treinar.bb.modelo.banco;

import br.com.treinar.bb.modelo.Pessoa;

//Modelo de conta 
public abstract class Conta {

	//atributos
	public Long numeroConta;
	public Pessoa cliente;
	public Double saldo;
	
	//metodos
	public void depositar(Double valor) {
		saldo += valor;
	}
	
	public abstract Boolean sacar(Double valor);
	
	public Double recuperarSaldo() {
		return saldo;
	}
	
}
