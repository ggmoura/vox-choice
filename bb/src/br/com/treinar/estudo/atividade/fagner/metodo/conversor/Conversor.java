package br.com.treinar.estudo.atividade.fagner.metodo.conversor;

import java.util.Scanner;

public class Conversor {

	public static Scanner leitor;

	public Conversor() {
		leitor = new Scanner(System.in);
	}

	public void iniciarSistema() {

		System.out.println("Conversor de Unidades.\n\n");
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
		System.out.println("Escolha a unidade de energia para entrada.");
		System.out.println("1-Joules \n2-BTU \n3-Calorias ");
		
		Energia e = new Energia();
		Integer i = leitor.nextInt();
		
		switch (i) {
		case 1:
			System.out.println("Informe a unidade de saida.");
			System.out.println("1-BTU \n2-Calorias");
			Integer i2 = leitor.nextInt();
			
			System.out.println("Informe o valor da energia de entrada.");
			Float valor = leitor.nextFloat();
			
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
			Integer i3 = leitor.nextInt();
			
			System.out.println("Informe o valor da energia de entrada.");
			Float valor1 = leitor.nextFloat();
			
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
			Integer i4 = leitor.nextInt();
			
			System.out.println("Informe o valor da energia de entrada.");
			Float valor2 = leitor.nextFloat();
			
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

		Scanner leitor = new Scanner(System.in);
		
		TipoTemperatura[] tipos = TipoTemperatura.values();
		
		System.out.println("Temperaturas: ");
		for (TipoTemperatura tipoTemperatura : tipos) {
			System.out.println("\t" + (tipoTemperatura.ordinal() + 1) + " - " + tipoTemperatura);
		}
		
		System.out.print("\n\nDigite a temperatura de entrada: ");
		Integer entrada = leitor.nextInt();
		
		System.out.print("Digite o valor da temperatura de entrada: ");
		Double temperatura = leitor.nextDouble();

		System.out.print("Digite a temperatura de saida: ");
		Integer saida = leitor.nextInt();

		leitor.close();
		
		System.out.println(Temperatura.converterTemperatura(temperatura, tipos[entrada - 1], tipos[saida - 1]));

		
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
	
	public static void main(String[] args) {
		temperatura();
	}

}
