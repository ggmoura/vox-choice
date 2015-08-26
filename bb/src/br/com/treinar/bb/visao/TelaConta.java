package br.com.treinar.bb.visao;

import java.util.Scanner;

import br.com.treinar.bb.controle.ContaControle;
import br.com.treinar.bb.modelo.ContaCorrente;
import br.com.treinar.bb.modelo.ContaInvestimento;
import br.com.treinar.bb.modelo.ContaPoupanca;
import br.com.treinar.bb.modelo.ContaSalario;
import br.com.treinar.bb.modelo.Pessoa;
import br.com.treinar.bb.modelo.Sexo;
import br.com.treinar.bb.modelo.banco.Conta;
import br.com.treinar.bb.modelo.banco.SaldoInsuficienteException;

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
			case 5:
				atualizarTaxaRendimento();
				break;
			case 6:
				pagarRendimentos();
				break;
			case 7:
				cobrarTarifas();
				break;
			case 8:
				cancelar();
				break;

			default:
				break;
			}
			
		} while (opcao != 0);
		
	}

	private void cancelar() {
		Long numeroConta = selecionarConta();
		controle.cancelarConta(numeroConta);
	}

	private void cobrarTarifas() {
		controle.tarifar();
	}

	private void pagarRendimentos() {
		controle.captalizar();
	}

	private void atualizarTaxaRendimento() {
		
		System.out.println("Taxa de Rendimento atual: " + controle.recuperarTaxaRendimentoPoupanca());
		System.out.print("Informe o valor da taxa de rendimento: ");
		Double valorTaxaRendimento = leitor.nextDouble();
		controle.atualizarTaxaRendimento(valorTaxaRendimento);
	}

	private void exibirSaldo() {
		
		Long numerConta = selecionarConta();
		Double saldo = controle.recuperarSaldo(numerConta);
		System.out.println("O saldo da conta é: " + saldo);
	}

	private void sacar() {
		System.out.print("Digite o valor a ser sacado: ");
		Double valor = leitor.nextDouble();
		Long numeroConta = selecionarConta();
		try {
			controle.efetuarSaque(valor, numeroConta);
			System.out.println("Saque efetuado com sucesso!");
		} catch (SaldoInsuficienteException e) {
			System.out.println("Saque não efetuado, o saldo atual é:" + e.getSaldoAtual());						
		}
	}

	private void depositar() {
		System.out.print("Digite o valor a ser depositado: ");
		Double valor = leitor.nextDouble();
		Long numeroConta = selecionarConta();
		controle.efetuarDeposito(valor, numeroConta);
		System.out.println("Deposito efetuado com sucesso!");
	}

	private void cadastrarConta() {
		System.out.println("Digite\n1 - Corrente\n"
				         + "2 - Poupança\n3 - Salário\n4 - Investimento");
		Conta conta = null;
		Integer opcao = leitor.nextInt();
		switch (opcao) {
		case 1:
			conta = new ContaCorrente();
			criarConta((ContaCorrente)conta);
			break;
		case 2:
			conta = new ContaPoupanca();
			criarConta((ContaPoupanca) conta);
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
		conta.setTaxaRendimento(leitor.nextDouble());
		System.out.print("Informe a quantidade de meses para resgade: ");
		conta.setMesesParaResgate(leitor.nextInt());
		System.out.print("Informe o valor da taxa de manutenção: ");
		conta.setTaxaManutencao(leitor.nextDouble());
	}

	private void criarConta(ContaSalario conta) {
		criarContaPadrao(conta);
		System.out.print("Informe o valor do salário: ");
		conta.valorSalario = leitor.nextDouble();				
	}

	private void criarConta(ContaPoupanca conta) {
		criarContaPadrao(conta);
		//mais algum atribudo pertinente a conta poupança
	}

	private void criarConta(ContaCorrente conta) {
		criarContaPadrao(conta);
		System.out.print("Informe o valor da taxa de manutenção: ");
		conta.setTaxaManutencao(leitor.nextDouble());
		System.out.print("Informe o valor do limite de crédito: ");
		conta.setLimiteCredito(leitor.nextDouble());
	}

	private void criarContaPadrao(Conta conta) {
		System.out.print("Informe o numero da conta: ");
		conta.setNumeroConta(leitor.nextLong());
		leitor.nextLine();
		System.out.print("Informe o nome do Cliente: ");
		//remover linha deixada pela leitura de um numero
		Pessoa cliente = new Pessoa();
		
		conta.setCliente(cliente);
		conta.getCliente().setNome(leitor.nextLine());
		System.out.print("Informe o CPF do Cliente: ");
		conta.getCliente().setCpf(leitor.nextLong());
		System.out.print("Informe:\n");
		System.out.println("\t" + Sexo.M + " para " + Sexo.M.getDescricao());
		System.out.println("\t" + Sexo.F + " para " + Sexo.F.getDescricao());
		System.out.print("-> ");
		//remover linha deixada pela leitura de um numero
		leitor.nextLine();
		String sexoStr = leitor.nextLine();
		conta.getCliente().setSexo(Sexo.valueOf(sexoStr));
	}

	public String recuperarMenu() {
		String menu = "1 - Criar Conta\n"
					+ "2 - Depositar\n"
					+ "3 - Sacar\n"
					+ "4 - Exibir Saldo\n"
					+ "5 - Cadastrar Taxa Rendimento\n"
					+ "6 - Pagar Rendimentos\n"
					+ "7 - Cobrar Tarifas\n"
					+ "8 - Cancelar Conta\n"
					+ "0 - Sair";
		return menu;
	}
	
	private Long selecionarConta() {
		System.out.println("Contas: ");
		Conta[] contas = controle.recuperarContas();
		for (Conta conta : contas) {
			System.out.println("\t" + conta.getNumeroConta() + " - " + conta.getCliente().getNome());
		}
		System.out.print("Selecione: ");
		return leitor.nextLong();
	}
	
	
}
