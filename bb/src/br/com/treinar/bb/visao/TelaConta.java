package br.com.treinar.bb.visao;

import java.util.Scanner;

import br.com.treinar.bb.controle.ContaControle;
import br.com.treinar.bb.modelo.ContaCorrente;
import br.com.treinar.bb.modelo.ContaInvestimento;
import br.com.treinar.bb.modelo.ContaPoupanca;
import br.com.treinar.bb.modelo.ContaSalario;
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
				cadastrarConta();
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

	private void cadastrarConta() {
		System.out.println("Digite\n1 - Corrente\n"
				         + "2 - Poupança\n3 - Salário\n4 - Investimento");
		Conta conta = null;
		Integer opcao = leitor.nextInt();
		switch (opcao) {
		case 1:
			//cria uma referencia de conta corrente e pasasa para 
			//o metodo criarConta()
			criarConta(new ContaCorrente());
			break;
		case 2:
			criarConta(new ContaPoupanca());
			break;
		case 3:
			//poderia criar a conta e passar o objeto mas para isso
			//tenho que fazer o casting
			conta = new ContaSalario();
			criarConta((ContaSalario)conta);
			
			break;
		case 4:
			conta = new ContaInvestimento();
			criarConta((ContaInvestimento)conta);
			
			break;

		default:
			break;
		}
		controle.gravarConta(conta);
	}
	
	private void criarConta(ContaInvestimento conta) {
		criarContaPadrao(conta);
		System.out.print("Informe o valor da taxa de rendimento: ");
		conta.taxaRendimento = leitor.nextDouble();
		System.out.print("Informe a quantidade de meses para resgade: ");
		conta.mesesParaResgate = leitor.nextInt();
	}

	private void criarConta(ContaSalario conta) {
		criarContaPadrao(conta);
		System.out.print("Informe o valor do salário: ");
		conta.valorSalario = leitor.nextDouble();				
	}

	private void criarConta(ContaPoupanca conta) {
		criarContaPadrao(conta);
		System.out.print("Informe o valor da taxa de rendimento: ");
		conta.taxaRendimento = leitor.nextDouble();		
	}

	private void criarConta(ContaCorrente conta) {
		criarContaPadrao(conta);
		System.out.print("Informe o valor da taxa de manutenção: ");
		conta.taxaManutencao = leitor.nextDouble();
		System.out.print("Informe o valor do limite de crédito: ");
		conta.limiteCredito = leitor.nextDouble();
	}

	private void criarContaPadrao(Conta conta) {
		System.out.print("Informe o nome do Cliente: ");
		leitor.nextLine();
		conta.cliente = new Pessoa();
		conta.cliente.nome = leitor.nextLine();
		System.out.print("Informe o CPF do Cliente: ");
		conta.cliente.cpf = leitor.nextLong();
		System.out.print("Informe o Sexo do Cliente: ");
		leitor.nextLine();
		conta.cliente.sexo = leitor.nextLine();
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
