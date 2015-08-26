package br.com.treinar.estudo.teste;

public class ComandoSwitchCase {

	public static void main(String[] args) {
		
		String nome = "Maria Sophia";
		
		switch (nome) {
			case "Maria Sophia":
				System.out.println("Afilhada");
				//break;
			case "Ana Paula":
				System.out.println("Irmã");
				break;
			case "Victor Hugo":
				System.out.println("Sobrinho");
				//break;
	
			default:
				System.out.println("Não identificado");
				break;
		}
	}
	
}
