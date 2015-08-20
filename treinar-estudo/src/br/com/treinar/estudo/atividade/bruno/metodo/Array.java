package br.com.treinar.estudo.atividade.bruno.metodo;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		System.out.println("Informe a quantidade de numeros: ");
		Scanner leitor = new Scanner(System.in);
		int[] num = new int[leitor.nextInt()];
		leitor.close(); // para de pega as teclas digitada 
		for (int i = num.length-1; i > 0; i--) {
			num[i] = i;
			System.out.println(num[i]+"  Pos "+i);
		}
		System.out.println("Invertido");
		for (int i = 0; i < num.length; i++) {
			num[i] = i;
			System.out.println(num[i]+"  Pos "+i);
		}

	}

}
