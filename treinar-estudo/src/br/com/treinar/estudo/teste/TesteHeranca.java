package br.com.treinar.estudo.teste;

import br.com.treinar.estudo.modelo.Homem;
import br.com.treinar.estudo.modelo.Mulher;
import br.com.treinar.estudo.modelo.Pessoa;

public class TesteHeranca {

	public static void main(String[] args) {
		
		Homem h = new Homem();
		h.nome = "Gleidson";
		h.caminhar();
		h.tamanhoBarba = 100;
		
		Mulher m = new Mulher();
		m.nome = "Maria Sohia";
		m.caminhar();
		m.possuiSilicone = Boolean.TRUE;
		Integer i = 2;
		Pessoa p = null;
		
		if (i % 2 == 0) {
			p = new Homem();
			p.nome = "Gleidson";
			((Homem)p).tamanhoBarba = 100;
		} else {
			p = new Mulher();
			p.nome = "Nathalia Cravo Moura";			
		}
		
		//define se a variavel 
		if (p instanceof Homem) {
			System.out.println(((Homem)p).tamanhoBarba);			
		}

		
		
	}
	
}
