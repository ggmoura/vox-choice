package br.com.treinar.estudo.atividade.fagner.metodo.conversor;

import java.util.Scanner;
import br.com.treinar.estudo.atividade.fagner.metodo.conversor.Temperatura;
import br.com.treinar.estudo.atividade.fagner.metodo.conversor.Energia;
import br.com.treinar.estudo.atividade.fagner.metodo.conversor.Forca;
import br.com.treinar.estudo.atividade.fagner.metodo.conversor.Pressao;



public class TesteConversor {

	public static Scanner leitor;

	
	public TesteConversor() {
		leitor = new Scanner(System.in);
	}
	
	public void iniciarSistema() {
	
		System.out.println("Conversor de Unidades.\n\n\n");
		System.out.println("Escolha a Unidade a ser convertida\n\n1-Temperatura \n2-Força \n3-Presão \n4-Energia");

		Integer i = leitor.nextInt();
		
		switch (i) {

		case 1:
			temperatura();
			break;
		case 2:
			forca();
			break;
		case 3:
			pressao();
			break;
		case 4:
			energia();
			break;
		default:
			break;
			
		}
		
		

	}

	private void energia() {
		// TODO Auto-generated method stub
		
	}

	private void pressao() {
		// TODO Auto-generated method stub
		
	}

	private void forca() {
		// TODO Auto-generated method stub
		
	}

	private static void temperatura() {
		System.out.println("Escolha a temperatura de entrada.\n\n");
		System.out.println("1-Celsius \n2-Kelvin \n3-Fahrenheit \n");
		
		leitor = new Scanner(System.in);
		Integer i = leitor.nextInt();
		Temperatura t = new Temperatura();

		switch (i) {
		case 1:
			System.out.println("Digite o valor da temperatura de entrada.");
			Double valor = leitor.nextDouble();
			t.setCelsius(valor);
			
			System.out.println("Temperatura Fahrenheit: " + t.converterCelsiusParaFahrenheit());
			//System.out.println("Temperatura Kelvin: " + t.converterCelsiusParaKelvin());
			
			break;

		default:
			break;
		}
		
	}

}
