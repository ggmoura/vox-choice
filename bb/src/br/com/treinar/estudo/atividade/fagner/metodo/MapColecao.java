package br.com.treinar.estudo.atividade.fagner.metodo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;


public class MapColecao {
	
	public static void main(String[] args) {
		
		Map<Character, List<String>> colecao  = new HashMap<>() ;
		
		Scanner sc = new Scanner(System.in);
		
		String nome = null;
		Character primeiraLetra = null;
		
		do {
			System.out.print("Digite o nome ou escreva sair: ");
			nome = sc.nextLine();
			if (!nome.equals("sair")) {
				primeiraLetra = nome.toUpperCase().charAt(0);
// to uppercase retorna variavel em maiusculo toUpperCase().charAt(0);
				
				if (!colecao.containsKey(primeiraLetra)) {
					colecao.put(primeiraLetra, new ArrayList<String>());
				}
				colecao.get(primeiraLetra).add(nome);
				
				//System.out.println("voce digitou: " + nome);
			}
			
		} while (!nome.equals("sair"));
		
		Set<Entry<Character, List<String>>> listas = colecao.entrySet();
		
		for (Entry<Character, List<String>> entry : listas) {
			Collections.sort(entry.getValue());
		}
		
		System.out.println(colecao);
		sc.close();
		System.out.println("Fim");
		
	}

}
