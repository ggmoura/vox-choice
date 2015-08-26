package br.com.treinar.estudo.atividade.gleidson;

import java.util.Scanner;

import br.com.treinar.estudo.modelo.DiaSemana;

public class AtividadeEnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o numero do dia da semana entre 0 e 6: ");
		Integer opcao = sc.nextInt();
		
		System.out.println("Ordinal: " + DiaSemana.values()[opcao]);
		System.out.println("Ordem Dia: " + DiaSemana.recuperarDiaSemanaPorOrdem(opcao));
		System.out.println("Ordem Dia: " + DiaSemana.recuperarDiaSemanaPorDescricao("Domingo"));
		
		sc.close();
		//0 Domingo Folga
	}
	
}
