package br.com.treinar.bb.modelo.banco;

import br.com.treinar.bb.modelo.Pessoa;

//Modelo de conta 
public class Conta {

	//atributos
	public Long numeroConta;
	public Pessoa cliente;
	public Double saldo;
	
	//metodos
	public void depositar(Double valor) {
		saldo += valor;
	}
	
	public Boolean sacar(Double valor) {
		Boolean sacou = Boolean.FALSE;
		if (saldo >= valor) {
			saldo -= valor;
			sacou = Boolean.TRUE;
		} 
		return sacou;
	}
	
	public Double recuperarSaldo() {
		return saldo;
	}
	
}
