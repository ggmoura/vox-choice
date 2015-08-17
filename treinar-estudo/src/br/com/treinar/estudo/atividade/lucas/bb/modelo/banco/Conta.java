package br.com.treinar.estudo.atividade.lucas.bb.modelo.banco;

import br.com.treinar.estudo.modelo.principal.Pessoa;

public class Conta {
	
	public Long numeroConta;
	public Pessoa cliente;
	public Double saldo;
	
	public void depositar(Double valor){
		saldo +=valor;
	}
	public Boolean sacar(Double valor){
		Boolean sacou = Boolean.FALSE;
		if (saldo >= valor) {
			saldo -= valor;
			sacou = Boolean.TRUE;
		}
		return sacou;
		
	}
}
