package br.com.treinar.estudo.atividade.roger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;



public class Exerciciomap {

	static Scanner a = new Scanner(System.in);

	public static void main(String[] args) {
		Map<Character, List<String>> map = new HashMap<>();//cria um map contendo um list dentro
		String nome = "a";
		List<String> nomes = null;// nomeando a lista que será criada
		Character primeiraLetra = null;//criando uma variavel para receber a primeira letra 
		while (!nome.equals("sair")) {
			System.out.print("digite o nome ou sair: ");
			nome = a.nextLine();

			primeiraLetra = nome.toUpperCase().charAt(0);//o comando Uppercase transforma a string em maiúscula sem alterar a variavel , comando para pegar a primeira letra
		if (!map.containsKey(primeiraLetra)) {//testa se existe a letra dentro do map como chave
				map.put(primeiraLetra, new ArrayList<String>());//cria uma arraylist par a letra nova
			}
					
		    nomes = map.get(primeiraLetra);//busca a primeira letra no arraylist nomes
			nomes.add(nome);//adiciona o nome no arraylist encontrado 
		}
		
		
		Set<Entry<Character, List<String>>> listas = map.entrySet();
		for (Entry<Character, List<String>> entry : listas) {
			Collections.sort(entry.getValue());
		}
		System.out.println(map);//imprime todo o map através seu tostring 
	}
//obs.: o algoritmo grava dentro da map uma list, assim pra cada nome ele procura se existe e list com a primeira letra do nome e inseri naquela list o nome, ou seja cira grupos de acordo com a primeira letra 
	
	
}
