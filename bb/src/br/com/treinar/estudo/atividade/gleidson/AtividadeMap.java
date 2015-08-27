package br.com.treinar.estudo.atividade.gleidson;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class AtividadeMap {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Map<Character, List<String>> nomesMap = new HashMap<Character, List<String>>();
		String nome = null;
		Character primeiraLetra = null;
		List<String> listaNomesPorLetra = null;
		do {
			System.out.print("Informe o nome ou sair: ");
			nome = sc.nextLine();
			if (!nome.equals("sair")) {
				primeiraLetra = nome.toUpperCase().charAt(0);
				if (!nomesMap.containsKey(primeiraLetra)) {
					nomesMap.put(primeiraLetra, new ArrayList<String>());
				}
				listaNomesPorLetra = nomesMap.get(primeiraLetra);
				listaNomesPorLetra.add(nome);
			}
			
		} while (!nome.equals("sair"));
		
		OutputStream os = new FileOutputStream("saida-" + new Date().getTime() + ".txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		Set<Entry<Character, List<String>>> entrySet = nomesMap.entrySet();
		
		for (Entry<Character, List<String>> entry : entrySet) {
			for (String n : entry.getValue()) {
				bw.write(n);
				bw.newLine();
			}
			bw.newLine();
		}
		
		bw.close();
		sc.close();
	}
	
}
