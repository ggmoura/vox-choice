package br.com.treinar.estudo.atividade.bruno.metodo.demo;

import java.util.*;
import java.util.Map.Entry;


public class HashMapDemo {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String nome = null;
		Map<Character, List<String>> mapPessoa = new HashMap<>(); // HashMap<Chave,Oq vou  guarda>
		List<String> nomes = null;  
		// charAt()
		do {
			System.out.print("Informe o nome da pessoa: ");
			nome = leitor.nextLine();
			if (nome.equals("sair")) {
				break;
			}
			// nome.charAt(0);
			if (!mapPessoa.containsKey(nome.charAt(0))) { //.containskey (contem a key)
				mapPessoa.put(nome.charAt(0), new ArrayList<String>());
			}
			nomes = mapPessoa.get(nome.charAt(0));
			nomes.add(nome);
		} while (!nome.equals("sair"));
		leitor.close();
		
		Set<Entry<Character, List<String>>> listas = mapPessoa.entrySet();
		for (Entry<Character, List<String>> chaves : listas) {
			Collections.sort(chaves.getValue());
		}
		
		int[] numeros = {1, 6, 8, 9};
		
		for (int i : numeros) {
			System.out.println(i);
		}
		
		
		System.out.println(mapPessoa);
	}

}
