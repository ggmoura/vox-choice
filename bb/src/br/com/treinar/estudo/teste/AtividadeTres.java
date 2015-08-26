package br.com.treinar.estudo.teste;

public class AtividadeTres {

	public static void main(String[] args) {
		for (int i = 0; i < 30; i++) {
			//System.out.println(i % 2 == 0 ? i + " eh Par" : i + " eh Impar");
			System.out.print(i);
			if (i % 2 == 0) {
				System.out.println(" eh par");
			} else {
				System.out.println(" eh impar");
			}
		}
	}
	
}
