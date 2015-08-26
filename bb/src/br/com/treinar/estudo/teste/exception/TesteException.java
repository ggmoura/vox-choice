package br.com.treinar.estudo.teste.exception;

public class TesteException {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		
		g.pagarContaGerente();
		System.out.println("Conta Paga");
		
		System.out.println("finalizou!");
	}
	
}
