package br.com.treinar.estudo.visao;

import br.com.treinar.estudo.modelo.Pessoa;

public class CriaPessoa {

	public static void main(String[] args) {
		
		Pessoa p = null;
		p = new Pessoa();
		p.nome = "Maria Sophia";
		p.sexo = 'F';
		p.cpf = 55546265302L;
		
		System.out.println(p.nome);
		System.out.println(p.cpf);
		System.out.println(p.sexo);
		
		p = new Pessoa();
		
		p.nome = "Nathalia Cravo";
		p.sexo = 'F';
		p.cpf = 44446265302L;
		
		System.out.println(p.nome);
		System.out.println(p.cpf);
		System.out.println(p.sexo);
		
		Pessoa p2 = p;
		
		System.out.println(p2.nome);
		p.nome = "Amanda Cravo Moura";
		System.out.println(p2.nome);
		
		p2 = null;
		//p = null;
		
		if (p.sexo == 'F') {
			Pessoa p3 = new Pessoa();
			p3.cpf = 654654654646l;
			p3.nome = "João Carlos";
			p3.sexo = 'M';
			
			System.out.println(p3.nome);
			
		}
		
		
		
		
	}
	
}
