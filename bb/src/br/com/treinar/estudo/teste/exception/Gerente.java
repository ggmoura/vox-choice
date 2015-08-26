package br.com.treinar.estudo.teste.exception;

public class Gerente {

	public void pagarContaGerente() {
		
		Secretaria s = new Secretaria();

		s.mandarSecretariaPagarConta();
		
		
		System.out.println("gerente manda pagar conta");
	}
	
}
