package br.com.treinar.estudo.atividade.fagner.metodo.conversor;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("informe o numero de elementos a serem impressos: ");
		
		
		Integer[] num = new Integer[sc.nextInt()];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = i;
		}
		
		for (int i = num.length - 1; i >= 0; i--) {
			
			System.out.print(num[i] + " ");
		}
		sc.close();
		
	}
	
}
