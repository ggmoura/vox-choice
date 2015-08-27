package br.com.treinar.estudo.atividade.waleson.metodo;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class GerarArquivo {
	
	public static void main(String[] args) throws Exception {

		Map<Character, List<String>> map = new HashMap<>();  // declaração do map, ele vem da colecion java 

		Scanner sc = new Scanner(System.in);

		String nome = null;
		Character primeiraLetra = null;
		List<String> nomesPorLetra = null;
		
		do {
			System.out.print("Digite o nome ou escreva sair: ");
			nome = sc.nextLine();
			if (!nome.equals("sair")) {
				
				primeiraLetra=nome.toUpperCase().charAt(0);  
				
				if (!map.containsKey(primeiraLetra)) {
					map.put(primeiraLetra, new ArrayList<String>());
				}
				nomesPorLetra = map.get(primeiraLetra);
				nomesPorLetra.add(nome);
			}
		} while (!nome.equals("sair"));
		
		
		OutputStream os = new FileOutputStream("saida-" + new Date ().getTime() + ".txt");
		OutputStreamWriter osw= new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);

		Set<Entry<Character, List<String>>> entryset = map.entrySet();
		List<String> lista = null;
		for (Entry<Character, List<String>> entry : entryset) {
			
			lista = entry.getValue();
			
			Collections.sort(lista);
			
			for (String nomeTemp : lista) {
				bw.write(nomeTemp);
				bw.newLine();
			}
			
		}
		bw.close();
		sc.close();  
		System.out.println(map);  

	}

	
	
	
	

}
