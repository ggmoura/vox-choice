package br.com.treinar.estudo.atividade.bruno.metodo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Arquivos {
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		String nome = null;
		Map<Character, List<String>> mapPessoa = new HashMap<>(); // HashMap<Chave,Oq
																	// vou
																	// guarda>
		List<String> nomes = new ArrayList<>();

		adicionarNomesJaCadastrados(nomes);

		// charAt()
		do {
			System.out.print("Informe o nome da pessoa: ");
			nome = leitor.nextLine();
			if (!nome.equals("sair")) {
				nomes.add(nome);
			}
		} while (!nome.equals("sair"));
		leitor.close();

		for (String n : nomes) {
			organizar(n, mapPessoa);
		}

		Set<Entry<Character, List<String>>> listas = mapPessoa.entrySet();
		for (Entry<Character, List<String>> chaves : listas) {
			Collections.sort(chaves.getValue());
		}
		System.out.println(mapPessoa);

		salvar(mapPessoa);

	}

	private static void adicionarNomesJaCadastrados(List<String> nomes) throws IOException {
		InputStream is = new FileInputStream("nomes.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		String nome = br.readLine(); 

		while (nome != null) {
			nomes.add(nome);
			nome = br.readLine();
		}

		br.close();
	}

	private static void organizar(String nome, Map<Character, List<String>> mapPessoa) {
		List<String> nomes;
		if (!mapPessoa.containsKey(nome.charAt(0))) { // .containskey (contem a
														// key)
			mapPessoa.put(nome.charAt(0), new ArrayList<String>());
		}
		nomes = mapPessoa.get(nome.charAt(0));
		nomes.add(nome);
	}

	public static void salvar(Map<Character, List<String>> mapa) throws IOException {

		OutputStream arq = new FileOutputStream("nomes.txt", Boolean.FALSE);
		OutputStreamWriter arqw = new OutputStreamWriter(arq);
		BufferedWriter txt = new BufferedWriter(arqw);

		Set<Entry<Character, List<String>>> entrySet = mapa.entrySet();

		for (Entry<Character, List<String>> entry : entrySet) {
			for (String nome : entry.getValue()) {
				txt.write(nome);
				txt.newLine();
			}
		}

		txt.close();

	}

}
