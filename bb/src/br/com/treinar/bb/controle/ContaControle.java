package br.com.treinar.bb.controle;

import br.com.treinar.bb.modelo.ContaInexistenteException;
import br.com.treinar.bb.modelo.ContaPoupanca;
import br.com.treinar.bb.modelo.banco.Conta;
import br.com.treinar.bb.modelo.banco.ICaptalizavel;
import br.com.treinar.bb.modelo.banco.ITarifavel;
import br.com.treinar.bb.modelo.banco.SaldoInsuficienteException;
import br.com.treinar.bb.modelo.banco.SituacaoConta;
import br.com.treinar.bb.util.BancoDadosArray;


/**
 * Camada de controle, importante para evitar que a camada de visao converse
 * diretamente com a camada de modelo evitando assim que uma camada de visão
 * seja reescrita sempre que uma nova visão seja criada
 * 
 * @author ADM
 */
public class ContaControle {

	public BancoDadosArray bancoDados;

	public ContaControle() {
		bancoDados = BancoDadosArray.getInstance();
	}

	public void gravarConta(Conta conta) {
		conta.depositar(0d);
		conta.setSituacao(SituacaoConta.ATIVA);
		bancoDados.adicionarConta(conta);
	}

	public void efetuarDeposito(Double valor, Long numeroConta) {
		Conta c = bancoDados.recuperarConta(numeroConta);
		c.depositar(valor);
	}

	/**
	 * Método para efetuar saques na conta, caso o saque seja efetuado o saldo
	 * da conta será reduzido do valor sacado
	 * 
	 * @param valor
	 *            a ser sacado
	 * @return true caso o saque seja efetuado e false caso contrário
	 *
	 * @throws SaldoInsuficienteException
	 *             Ocorre quando o cliente efetua um saque e seu saldo é menor
	 *             do que o valor desejado
	 */
	public void efetuarSaque(Double valor, Long numeroConta)
			throws SaldoInsuficienteException {
		// Efetua o saque na conta
		Conta c = bancoDados.recuperarConta(numeroConta);
		if (c != null) {
			c.sacar(valor);
		} else {
			throw new ContaInexistenteException();
		}
	}

	public Double recuperarSaldo(Long numeroConta) {
		Conta c = bancoDados.recuperarConta(numeroConta);
		return c.recuperarSaldo();
	}

	public void atualizarTaxaRendimento(Double valorTaxaRendimento) {
		ContaPoupanca.setTaxaRendimento(valorTaxaRendimento);
	}

	public Double recuperarTaxaRendimentoPoupanca() {
		return ContaPoupanca.getTaxaRendimento();
	}

	public void tarifar() {

		Conta[] contas = recuperarContas();

		for (Conta conta : contas) {
			if (conta instanceof ITarifavel) {
				((ITarifavel) conta).tarifar();
			}
		}
	}

	public Conta[] recuperarContas() {
		Conta[] contas = bancoDados.recuperarContas();
		return contas;
	}

	public void captalizar() {

		Conta[] contas = recuperarContas();

		for (Conta conta : contas) {
			if (conta != null && conta instanceof ICaptalizavel) {
				captalizar((ICaptalizavel) conta);
			}
		}

	}

	private void captalizar(ICaptalizavel c) {
		c.captalizar();
	}

	public void cancelarConta(Long numeroConta) {
		Conta c = bancoDados.recuperarConta(numeroConta);
		bancoDados.cancelarConta(c);
	}
}
