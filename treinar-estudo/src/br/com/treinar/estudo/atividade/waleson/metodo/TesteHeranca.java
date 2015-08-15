package br.com.treinar.estudo.atividade.waleson.metodo;

public class TesteHeranca {
	public static void main(String[] args) {

		Cao c = new Cao();
		c.nome = "Vira Lata";
		c.idade = 10;

		Gato g = new Gato();
		g.nome = "Diabo";
		g.idade = 5;
		
		Animal animal = new Gato();
		((Gato)animal).comeRato = 1;
		
		System.out.println(((Gato)animal).comeRato);

	}

}
