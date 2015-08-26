package br.com.treinar.estudo.atividade.lucas.teste;

import java.util.Scanner;

import br.com.treinar.estudo.atividade.lucas.metodo.Animal;
import br.com.treinar.estudo.atividade.lucas.metodo.Cachorro;
import br.com.treinar.estudo.atividade.lucas.metodo.Gato;

public class TesteHeranca {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Cachorro c = new Cachorro();
		c.nome = "TOTÓ";
		c.raca = "PITBULL";
		c.qtdPatas = 4;

		Gato g = new Gato();
		g.nome = "GARFIELD";
		g.raca = "PERSA";
		g.qtdPatas = 4;

		Integer opcao;
		Animal a = null;

		System.out.println("1 - Cao\n" + "			2 - Gato");

		opcao = leia.nextInt();

		if (opcao == 1) {
			a = new Cachorro();
			((Cachorro) a).latir();
		} else {
			a = new Gato();
			((Gato) a).miar();
		}
		leia.close();
	}

}
