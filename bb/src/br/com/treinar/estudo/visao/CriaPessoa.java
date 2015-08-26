package br.com.treinar.estudo.visao;

import br.com.treinar.estudo.modelo.Mulher;
import br.com.treinar.estudo.modelo.principal.Pessoa;

public class CriaPessoa {

	public static void main(String[] args) {

		Pessoa p = null;
		p = new Mulher();
		p.setNome("Maria Sophia");
		p.setCpf(55546265302L);

		System.out.println(p.getNome());
		System.out.println(p.getCpf());

		p = new Mulher();

		p.setNome("Nathalia Cravo");
		p.setCpf(44446265302L);

		System.out.println(p.getNome());
		System.out.println(p.getCpf());

		Pessoa p2 = p;

		System.out.println(p2.getNome());
		p.setNome("Amanda Cravo Moura");
		System.out.println(p2.getNome());

		p2 = null;
		// p = null;
		Pessoa p3 = new Mulher();
		p3.setCpf(654654654646l);
		p3.setNome("João Carlos");

		System.out.println(p3.getNome());

	}

}
