package br.com.treinar.estudo.atividade.waleson.metodo;

import java.util.Scanner;

import br.com.treinar.estudo.modelo.DiaSemana;

public class AtividadeEnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DiaSemana[] dias = DiaSemana.values();
		
		System.out.print("Digite o numero do dia da semana entre 0 e 6: ");
		Integer opcao = sc.nextInt();
		
		System.out.println(dias[opcao]);
		
//		if (opcao == 0) {
//			System.out.println(DiaSemana.DOMINGO);
//		} else if (opcao == 1) {
//			System.out.println(DiaSemana.SEGUNDA_FEIRA);			
//		} else if (opcao == 2) {
//			System.out.println(DiaSemana.TERCA_FEIRA);
//		} else if (opcao == 3) {
//			System.out.println(DiaSemana.QUARTA_FEIRA);						
//		} else if (opcao == 4) {
//			System.out.println(DiaSemana.QUINTA_FEIRA);			
//		} else if (opcao == 5) {
//			System.out.println(DiaSemana.SEXTA_FEIRA);
//		} else if (opcao == 6) {
//			System.out.println(DiaSemana.SABADO);
//		}
//		
//		switch (opcao) {
//		case 0:
//			System.out.println(DiaSemana.DOMINGO);
//			break;
//		case 1:
//			System.out.println(DiaSemana.SEGUNDA_FEIRA);
//			break;
//		case 2:
//			System.out.println(DiaSemana.TERCA_FEIRA);
//			break;
//		case 3:
//			System.out.println(DiaSemana.QUARTA_FEIRA);
//			break;
//		case 4:
//			System.out.println(DiaSemana.QUINTA_FEIRA);
//			break;
//		case 5:
//			System.out.println(DiaSemana.SEXTA_FEIRA);
//			break;
//		case 6:
//			System.out.println(DiaSemana.SABADO);
//			break;
//
//		default:
//			break;
//		}
//		
  		sc.close();
		
	}
	
}
