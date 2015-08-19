package br.com.treinar.estudo.teste;

public class TesteArray {

	public static void main(String[] args) {
		
		//String[] ns = {"a", "b", "c"};

		String nome = "Maria Sophia";
		
		System.out.println("");
		
		
		String[] nomes = new String[5];
		
		nomes[0] = nome;
		nomes[1] = "Waleson";
		nomes[2] = "Fagner";
		nomes[3] = "Henrique";
		nomes[4] = "Bruno";
		
		//nomes = null;
		
		System.out.println(nomes.length);
		
		System.out.println(nomes[0]);
		
		//nomes[0] = null;
		
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
		
		System.out.println("imprime com metodo...");
		imprimir(nomes);
		imprimir(1 , "Gleidsno", "Ana Paula", "Davi", "", "Thais", "Luciana");

	}
	
	private static void imprimir(String[] nomes) {
		for (String nome : nomes) {
			System.out.println(nome);
		}
	}
	
	public static void imprimir(Integer numero, String... nomes) {
		System.out.println(numero);
		for (String string : nomes) {
			System.out.println(string);
		}
	}
	
}
