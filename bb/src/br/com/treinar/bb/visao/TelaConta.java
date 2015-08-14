package br.com.treinar.bb.visao;

import java.util.Scanner;

import br.com.treinar.bb.controle.ContaControle;
import br.com.treinar.bb.modelo.Pessoa;
import br.com.treinar.bb.modelo.banco.Conta;

public class TelaConta {

	public Scanner leitor;
	public ContaControle controle;
	
	public TelaConta() {
		leitor = new Scanner(System.in);
		controle = new ContaControle();
	}
	
	public void iniciarSistema() {
		
		Integer opcao = null;
		do {
			
			System.out.println(recuperarMenu());
			opcao = leitor.nextInt();
			
			switch (opcao) {
			case 1:
				criarConta();
				//System.out.println(conta.cliente.nome);
				break;
			case 2:
				depositar();
				break;
			case 3:
				sacar();
				break;
			case 4:
				exibirSaldo();
				break;

			default:
				break;
			}
			
		} while (opcao != 0);
		
	}

	private void exibirSaldo() {
		Double saldo = controle.recuperarSaldo();
		System.out.println("O saldo da conta é: " + saldo);
	}

	private void sacar() {
		System.out.print("Digite o valor a ser sacado: ");
		Double valor = leitor.nextDouble();
		Boolean sacou = controle.efetuarSaque(valor);
		
		//Opção de if ternário
		//System.out.println(sacou ? "Saque efetuado com sucesso!" : "Saque não efetuado!");
		
		if (sacou) {
			System.out.println("Saque efetuado com sucesso!");
		} else {
			System.out.println("Saque não efetuado!");			
		}
	}

	private void depositar() {
		System.out.print("Digite o valor a ser depositado: ");
		Double valor = leitor.nextDouble();
		controle.efetuarDeposito(valor);
		System.out.println("Deposito efetuado com sucesso!");
	}

	private void criarConta() {
		Conta conta = new Conta();
		System.out.print("Informe o nome do Cliente: ");
		leitor.nextLine();
		conta.cliente = new Pessoa();
		conta.cliente.nome = leitor.nextLine();
		System.out.print("Informe o CPF do Cliente: ");
		conta.cliente.cpf = leitor.nextLong();
		System.out.print("Informe o Sexo do Cliente: ");
		leitor.nextLine();
		conta.cliente.sexo = leitor.nextLine();
		controle.gravarConta(conta);
	}

	public String recuperarMenu() {
		String menu = "1 - Criar Conta\n"
					+ "2 - Depositar\n"
					+ "3 - Sacar\n"
					+ "4 - Exibir Saldo\n"
					+ "0 - Sair";
		return menu;
	}
	
}
