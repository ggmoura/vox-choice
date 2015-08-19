package br.com.treinar.estudo.teste;

import javax.swing.JOptionPane;

public class TesteMemoria {

	public static void main(String[] args) {
		
		
		String nome = "Gleidson";
		String nome2 = new String("Gleidson");
		
		JOptionPane.showMessageDialog(null, nome);
		
		System.out.println(nome == nome2);
		
		
//		String nome = "Gleidson";
//		for (int i = 0; i < 100000; i++) {
//			nome += nome + " " + i;
//		}
//		System.out.println("nao chegou aki!");
	}
	
}
