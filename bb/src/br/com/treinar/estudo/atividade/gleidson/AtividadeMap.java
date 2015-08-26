package br.com.treinar.estudo.atividade.gleidson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AtividadeMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Character, List<String>> nomes = new HashMap<Character, List<String>>();
		String nome = null;
		Character primeiraLetra = null;
		List<String> listaNomesPorLetra = null;
		do {
			System.out.print("Informe o nome ou sair: ");
			nome = sc.nextLine();
			if (!nome.equals("sair")) {
				primeiraLetra = nome.toUpperCase().charAt(0);
				if (!nomes.containsKey(primeiraLetra)) {
					nomes.put(primeiraLetra, new ArrayList<String>());
				}
				listaNomesPorLetra = nomes.get(primeiraLetra);
				listaNomesPorLetra.add(nome);
			}
			System.out.println(nomes);
			
		} while (!nome.equals("sair"));
		sc.close();
	}
	
}
