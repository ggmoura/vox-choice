package br.com.treinar.estudo.teste;

public class ComandoIF {

	public static void main(String[] args) {

		boolean execute = false;

		int i = 10;

		//if com parenteses 
		if (i == 1) {
			System.out.println("Um");
		} else {
			if (i == 2) {
				System.out.println("Dois");
			} else {
				if (i == 3) {
					System.out.println("Tres");
				}
			}
		}

		//if omitindo parenteses
		if (i == 1) {
			System.out.println("Um");
		} else if (i == 2) {
			System.out.println("Dois");
		} else if (i == 3) {
			System.out.println("Tres");
		}

		if (execute && i == 10 || i == 5) {
			System.out.println("executou");
			System.out.println("executou tudo legal");
		} else {
			System.out.println("não executou");
		}

	}

}