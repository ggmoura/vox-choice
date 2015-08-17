package br.com.treinar.estudo.teste;

import br.com.treinar.estudo.modelo.principal.Pessoa;

public class TesteClasseAnonima {

	public static void main(String[] args) {
		Pessoa p = new Pessoa() {
			
			@Override
			public void caminhar() {
				System.out.println("Caminha Pulando");
			}
		};
		String nome = "Maria Sophia";
		p.setNome(nome);
		System.out.println("Nome: " + p.getNome());
		p.caminhar();
	}
	
	
	
	
}
