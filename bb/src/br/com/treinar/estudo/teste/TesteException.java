package br.com.treinar.estudo.teste;

import java.util.Scanner;

public class TesteException {

	public static void main(String[] args) {
		Integer[] idades = {15, 17, 19, 26};
		String nome = "Sophia";
		Scanner sc = new Scanner(System.in);
		Integer numero = null;
		Integer contador = 0;
		do {
			try {
				System.out.print(contador + " Digite um numero: ");
				numero = sc.nextInt();
				System.out.println(numero);
			} catch (Exception e) {
				System.out.println("Numero invalido");
			} finally {
				contador++;				
			}
		} while (contador <= 10);
		
		try {
			if (nome.equals("Sophia")) {
				nome = null;
			}
			System.out.println(idades[1]);
			System.out.println(idades[2]);
			System.out.println(idades[3]);
			System.out.println(nome.toUpperCase());
			System.out.println(idades[4]);
		} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
			System.out.println("Você tentou acessar um indice não existente!");
		} catch (Exception e) {
			System.err.println("Deu zica: segue pilha de erro\n");
			e.printStackTrace();
		}
		sc.close();
	}
	
}
