package br.com.treinar.estudo.teste;

import java.util.Scanner;

import br.com.treinar.estudo.modelo.Homem;
import br.com.treinar.estudo.modelo.Mulher;
import br.com.treinar.estudo.modelo.Pessoa;

public class TestePolimorfismo {

	public static void main(String[] args) {
		//Pessoa p = null;
		Homem h = null;
		Mulher m = null;
		Integer opcao = null;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("digite\n1 - Homem\n2 - Mulher\n0 - Sair");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				h = new Homem();
				executarAcaoP(h);
				break;
			case 2:
				m = new Mulher();
				executarAcaoP(m);
				break;

			default:
				break;
			}
			
			
		} while (opcao != 0);
		sc.close();
	}

	public static void executarAcaoP(Pessoa p) {
		p.caminhar();
	}
	
}
