package br.com.treinar.estudo.atividade.fagner.metodo.teste;

import java.util.Scanner;

import br.com.treinar.estudo.atividade.fagner.metodo.CarroPasseio;
import br.com.treinar.estudo.atividade.fagner.metodo.CarroSport;
import br.com.treinar.estudo.atividade.fagner.metodo.Carro;


public class TesteCarro {

	public static Scanner leitor;

	static Carro c = new Carro();

	public static void main(String[] args) {

		CarroSport s = new CarroSport();
		s.modelo = "Palio Sporting ";
		s.cor = "Amarelo";
		s.motor = 1.8f;
		s.tipoDePneu = "Liso.";
		s.turbo = true;
		
		
		
		CarroPasseio p = new CarroPasseio();
		p.modelo = "Palio fire";
		p.cor = "Prata";
		p.motor = 1.0f;
		p.arCondicionado = true;
		p.polRodas = 13;

		

		System.out.println("Escolha a opção de carro.\n\n1-Sport\n\n2-Passeio\n\n");
		
		leitor = new Scanner(System.in);
		Integer i = leitor.nextInt();
		
		

		switch (i) {
		case 1:
			c = new CarroSport();
			System.out.println("Voce comprou um Carro Sport modelo: " + s.modelo);
			System.out.println("Motor: " + s.motor);
			System.out.println("Cor: " + s.cor);
			System.out.println("Tipos de Pneu: " + s.tipoDePneu);
			System.out.println("Turbo: " + s.turbo);
			
			break;
		case 2:
			c = new CarroPasseio();
			System.out.println("Voce comprou um carro de Passeio modelo: " + p.modelo);
			System.out.println("Motor: " + p.motor);
			System.out.println("Cor: " + p.cor);
			System.out.println("Ar Condicionado: " + p.arCondicionado);
			System.out.println("Rodas: " + p.polRodas);

		default:
			break;
		}
	}
}