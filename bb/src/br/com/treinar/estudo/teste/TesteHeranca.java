package br.com.treinar.estudo.teste;

import br.com.treinar.estudo.modelo.Homem;
import br.com.treinar.estudo.modelo.Mulher;
import br.com.treinar.estudo.modelo.principal.Pessoa;

public class TesteHeranca {

	public static void main(String[] args) {
		
		Homem h = new Homem();
		h.setNome("Gleidson");
		h.caminhar();
		h.tamanhoBarba = 100;
		
		Mulher m = new Mulher();
		h.setNome("Maria Sohia");
		m.caminhar();
		m.possuiSilicone = Boolean.TRUE;
		Integer i = 2;
		Pessoa p = null;
		
		if (i % 2 == 0) {
			p = new Homem();
			h.setNome("Gleidson");
			((Homem)p).tamanhoBarba = 100;
		} else {
			p = new Mulher();
			h.setNome("Nathalia Cravo Moura");			
		}
		
		//define se a variavel 
		if (p instanceof Homem) {
			System.out.println(((Homem)p).tamanhoBarba);			
		}

		
		
	}
	
}
