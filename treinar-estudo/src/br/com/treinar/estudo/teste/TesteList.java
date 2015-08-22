package br.com.treinar.estudo.teste;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesteList {

	public static void main(String[] args) {

		//Evita casting e garante que apenas o tipo definido no 
		//diamante <> pode ser inserido na coleção
		List<String> a1 = new ArrayList<>();
		a1.add("Zara");
		a1.add("Mahnaz");
		a1.add("Ayan");
		//Nao eh possivel pois a lista so recebe ojetos do tipo String
		// a1.add(TipoCarro.CROSS);
		System.out.println(" ArrayList Elements");
		System.out.print("\t" + a1);


		LinkedList<String> l1 = new LinkedList<>();
		l1.add("Zara");
		l1.add("Mahnaz");
		l1.add("Ayan");
		
		System.out.println(" LinkedList Elements");
		System.out.print("\t" + l1);
	}

}
