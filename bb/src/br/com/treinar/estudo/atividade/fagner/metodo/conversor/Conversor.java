package br.com.treinar.estudo.atividade.fagner.metodo.conversor;

import java.util.Scanner;

public class Conversor {

	public static Scanner Scanner;

	public Conversor() {
		Scanner = new Scanner(System.in);
	}

	public void iniciarSistema() {

		System.out.println("Conversor de Unidades.\n\n");
		System.out.println("Escolha a Unidade a ser convertida\n\n1-Temperatura \n2-Força \n3-Presão \n4-Energia");

		Integer i = Scanner.nextInt();

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
		System.out.println("Escolha a unidade de energia para entrada.");
		System.out.println("1-Joules \n2-BTU \n3-Calorias ");
		
		Energia e = new Energia();
		Integer i = Scanner.nextInt();
		
		switch (i) {
		case 1:
			System.out.println("Informe a unidade de saida.");
			System.out.println("1-BTU \n2-Calorias");
			Integer i2 = Scanner.nextInt();
			
			System.out.println("Informe o valor da energia de entrada.");
			Float valor = Scanner.nextFloat();
			
			switch (i2) {
			case 1:
				e.setJoules(valor);
				System.out.println("\nO valor da energia em BTU e :" + e.ConverterJoulesParaBtu());
				break;
				
			case 2:
				e.setJoules(valor);
				System.out.println("\nO valor da energia em Calorias e :" + e.ConverterJoulesParaCalorias());
				break;

			default:
				break;
			}
			return;
			
		case 2:
			System.out.println("Informe a unidade de saida.");
			System.out.println("1-Joules \n2-Calorias");
			Integer i3 = Scanner.nextInt();
			
			System.out.println("Informe o valor da energia de entrada.");
			Float valor1 = Scanner.nextFloat();
			
			switch (i3) {
			case 1:
				e.setBtu(valor1);
				System.out.println("\nO valor da energia em Joules e :" + e.ConverterBtuParaJoules());
				break;
				
			case 2:
				e.setBtu(valor1);
				System.out.println("\nO valor da energia em Calorias e :" + e.ConverterBtuParaCalorias());
				break;

			default:
				break;
			}
			return;
			
		case 3:
			System.out.println("Informe a unidade de saida.");
			System.out.println("1-Joules \n2-BTU");
			Integer i4 = Scanner.nextInt();
			
			System.out.println("Informe o valor da energia de entrada.");
			Float valor2 = Scanner.nextFloat();
			
			switch (i4) {
			case 1:
				e.setJoules(valor2);
				System.out.println("\nO valor da energia em Joules e :" + e.ConverterCaloriasParaJoules());
				break;
				
			case 2:
				e.setJoules(valor2);
				System.out.println("\nO valor da energia em BTU e :" + e.ConverterCaloriasParaBtu());
				break;

			default:
				break;
			}
			return;
			
		default:
			break;
		}
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

		Scanner = new Scanner(System.in);
		Temperatura t = new Temperatura();
		Integer i = Scanner.nextInt();

		System.out.println(recuperarMenu());

		switch (i) {
		case 1:
			System.out.println("Escolha a temperatura de saida. ");
			System.out.println("\n1-Kelvin \n2-Fahrenheit \n");

			Integer i2 = Scanner.nextInt();
			System.out.println("Digite o valor da temperatura de entrada.");
			Float valor = Scanner.nextFloat();

			switch (i2) {
			case 1:
				t.setCelsius(valor);
				System.out.println("\nTemperatura Kelvin: " + t.converterCelsiusParakelvin() + "°K");
				break;

			case 2:
				t.setCelsius(valor);
				System.out.println("\nTemperatura Fahrenheit: " + t.converterCelsiusParaFahrenheit() + "°F");
				break;

			default:
				break;

			}
			return;

		case 2:
			System.out.println("Escolha a temperatura de saida. ");
			System.out.println("\n1-celsius \n2-Fahrenheit \n");

			Integer i3 = Scanner.nextInt();
			System.out.println("Digite o valor da temperatura de entrada.");
			Float valor2 = Scanner.nextFloat();

			switch (i3) {
			case 1:
				t.setKelvin(valor2);
				System.out.println("\nTemperatura Fahrenheit: " + t.converterKelvinParaFahrenheit() + "°F");
				break;

			case 2:
				t.setKelvin(valor2);
				System.out.println("\nTemperatura Celsius: " + t.converterkelvinParaCelsius() + "°C");
				break;

			default:
				break;
			}

			return;

		case 3:
			System.out.println("Escolha a temperatura de saida. ");
			System.out.println("\n1-celsius \n2-kelvin \n");

			Integer i4 = Scanner.nextInt();
			System.out.println("Digite o valor da temperatura de entrada.");
			Float valor3 = Scanner.nextFloat();

			switch (i4) {
			case 1:
				t.setFahrenheit(valor3);
				System.out.println("\nTemperatura Celsius: " + t.converterFahrenheitParaCelsius() + "°C");
				break;

			case 2:
				t.setFahrenheit(valor3);
				System.out.println("\nTemperatura Kelvin: " + t.converterFahrenheitParakelvin() + "°K");
				break;

			default:
				break;

			}

			break;

		}

	}

	public static String recuperarMenu() {

		String menu = "Escolha a Unidade a ser convertida.\n" 
					+ "1-Temperatura \n" 
					+ "2-Força \n" 
					+ "3-Presão \n"
					+ "4-Energia \n" 
					+ "0-Sair";
		return menu;
	}

}
