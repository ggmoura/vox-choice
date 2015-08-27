package br.com.treinar.estudo.atividade.roger;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
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

public class AtividadeMap {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		Map<Character, List<String>> nomesMap = new HashMap<Character, List<String>>();
		//declarou-se um map com chave de character, e uma lista de strings 
		String nome = null;
		Character primeiraLetra = null;
		List<String> listaNomesPorLetra = null;
		//declaração de variáveis e declaração da list
		do {//abertura do loop do while ate que a palavra sair seja digitada
			System.out.print("Informe o nome ou sair: ");
			nome = sc.nextLine();
			if (!nome.equals("sair")) {//se nome for diferente de sair 
				primeiraLetra = nome.toUpperCase().charAt(0);//toUpperCase convert todo o conteudo para maiusculo e charAt pega apenas a primeira letra 
				if (!nomesMap.containsKey(primeiraLetra)) {//testa se dentro do map já existe a chave digitada 
					nomesMap.put(primeiraLetra, new ArrayList<String>());//insere dentro do map  chave/letra criada
				}
				listaNomesPorLetra = nomesMap.get(primeiraLetra);//pega a letra digitada e localiza dentro do map
				listaNomesPorLetra.add(nome);//nesta chave encontrada do map inseri na lista o nome digitado
			}
		} while (!nome.equals("sair"));
		
		OutputStream os = new FileOutputStream("saida.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);//cria um arquivo de saida de dados
		
		//bw.write(nomesMap.toString());//escreve  todos os nome digitados de uma vez, no arquivo baseado no metodotoString

		Set<Entry<Character, List<String>>> entrySet = nomesMap.entrySet();//comando entry busca os dados da map atraves da chave valor
		
		
		for (Entry<Character, List<String>> entry : entrySet) {
			Collections.sort(entry.getValue());//ordenar list criada
			for (String n : entry.getValue()) {//roda cada elemento dentro da list
				bw.write(n);//grava linha a linha dentro do write
				bw.newLine();
			}
		}
		
		bw.close();
		sc.close();
	}
	
}
