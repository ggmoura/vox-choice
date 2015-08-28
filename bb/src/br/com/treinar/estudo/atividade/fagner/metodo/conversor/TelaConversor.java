package br.com.treinar.estudo.atividade.fagner.metodo.conversor;

import java.util.Scanner;

public class TelaConversor {

	public static Scanner leitor;

	public TelaConversor() {
		leitor = new Scanner(System.in);

	}

	public void iniciarSistema() {

		System.out.println("Conversor de Unidades.\n\n");

		TipoUnidade[] unidades = TipoUnidade.values();
		System.out.println("Escolha a Unidade a ser convertida:");
		for (TipoUnidade tipoUnidade : unidades) {
			System.out.println("\t" + (tipoUnidade.ordinal() + 1) + " - " + tipoUnidade);

		}

		Integer entrada = leitor.nextInt();
		Unidades.escolherUnidades(unidades[entrada - 1]);

	}

	public static void temperatura() {

		Scanner leitor = new Scanner(System.in);

		TipoTemperatura[] tipos = TipoTemperatura.values();

		System.out.println("Temperaturas: ");
		for (TipoTemperatura tipoTemperatura : tipos) {
			System.out.println("\t" + (tipoTemperatura.ordinal() + 1) + " - " + tipoTemperatura);
		}

		System.out.print("\n\nDigite a temperatura de entrada: ");
		Integer entrada = leitor.nextInt();

		System.out.print("Digite o valor da temperatura de entrada: ");
		Float temperatura = leitor.nextFloat();

		System.out.print("Digite a temperatura de saida: ");
		Integer saida = leitor.nextInt();

		leitor.close();

		System.out.println(Temperatura.converterTemperatura(temperatura, tipos[entrada - 1], tipos[saida - 1]));

	}

	public static void energia() {

		TipoEnergia[] tipos = TipoEnergia.values();
		System.out.println("Unidades de Energia");
		for (TipoEnergia tipoEnergia : tipos) {
			System.out.println("\t" + (tipoEnergia.ordinal() + 1) + " - " + tipoEnergia);
		}

		System.out.print("\n\nDigite a energia de entrada: ");
		Integer entrada = leitor.nextInt();

		System.out.print("Digite o valor da energia de entrada: ");
		Float energia = leitor.nextFloat();

		System.out.print("Digite a Unidade de energia para saida: ");
		Integer saida = leitor.nextInt();

		leitor.close();

		System.out.println(Energia.converterEnergia(energia, tipos[entrada - 1], tipos[saida - 1]));

	}

	public static void pressao() {

		TiposPessao[] tipos = TiposPessao.values();
		System.out.println("Unidades de Pressão");
		for (TiposPessao tiposPessao : tipos) {
			System.out.println("\t" + (tiposPessao.ordinal() + 1) + " - " + tiposPessao);

		}

		System.out.print("\n\nDigite a pressão de entrada: ");
		Integer entrada = leitor.nextInt();

		System.out.print("Digite o valor da pressão de entrada: ");
		Float pressao = leitor.nextFloat();

		System.out.print("Digite a Unidade de pressão para saida: ");
		Integer saida = leitor.nextInt();

		leitor.close();

		System.out.println(Pressao.converterPessao(pressao, tipos[entrada - 1], tipos[saida - 1]));

	}

	public static void forca() {

		TipoForca[] tipos = TipoForca.values();
		System.out.println("Unidades de força ");

		for (TipoForca tipoForca : tipos) {
			System.out.println("\t" + (tipoForca.ordinal() + 1) + " - " + tipoForca);

		}

		System.out.print("\n\nDigite a força de entrada: ");
		Integer entrada = leitor.nextInt();

		System.out.print("Digite o valor da força de entrada: ");
		Float forca = leitor.nextFloat();

		System.out.print("Digite a Unidade de força para saida: ");
		Integer saida = leitor.nextInt();

		leitor.close();

		System.out.println(Forca.converterForca(forca, tipos[entrada - 1], tipos[saida - 1]));

	}

}
