package br.com.treinar.estudo.teste;

import br.com.treinar.estudo.modelo.Homem;
import br.com.treinar.estudo.modelo.principal.Pessoa;

public class TesteEquals {

	public static void main(String[] args) {
		
		Integer i = 10;
		Integer j = 10;
		
		System.out.println(i == j);
		j = new Integer(10);

		int a = 2;
		
		int b = a;
		
		a = 5;
		
		System.out.println(a);
		System.out.println(b);
		
		
		String nome = "Roger";
		String nome2 = "Roger";
		String nome3 = new String("Roger");
		
		System.out.println(nome == nome2);
		System.out.println(nome.equals(nome3));
		
		Pessoa h1 = new Homem();
		h1.setNome("Gleidson");
		
		
		h1.equals(10);
		
		
		Pessoa h2 = new Homem(); 
		h2.setNome("Gleidson");

		System.out.println(h1 == h2);
		System.out.println(h1.equals(h2));
		
		Pessoa h3 = h2;
		
		h3.setNome("Maria Sophia");
		
		
		System.out.println(h2.getNome());
		
		System.out.println(h3 == h2);
		
		
	}
	
}
