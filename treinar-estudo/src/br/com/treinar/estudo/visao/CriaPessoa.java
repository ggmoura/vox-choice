package br.com.treinar.estudo.visao;

import br.com.treinar.estudo.modelo.Mulher;
import br.com.treinar.estudo.modelo.Pessoa;

public class CriaPessoa {

	public static void main(String[] args) {
		
		Pessoa p = null;
		p = new Mulher();
		p.nome = "Maria Sophia";
		p.cpf = 55546265302L;
		
		System.out.println(p.nome);
		System.out.println(p.cpf);
		
		p = new Mulher();
		
		p.nome = "Nathalia Cravo";
		p.cpf = 44446265302L;
		
		System.out.println(p.nome);
		System.out.println(p.cpf);

		
		Pessoa p2 = p;
		
		System.out.println(p2.nome);
		p.nome = "Amanda Cravo Moura";
		System.out.println(p2.nome);
		
		p2 = null;
		//p = null;
		Pessoa p3 = new Mulher();
		p3.cpf = 654654654646l;
		p3.nome = "João Carlos";
			
		System.out.println(p3.nome);

	}
	
}
