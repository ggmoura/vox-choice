package br.com.treinar.bb.controle;

import br.com.treinar.bb.modelo.ContaPoupanca;
import br.com.treinar.bb.modelo.banco.Conta;
import br.com.treinar.bb.modelo.banco.ICaptalizavel;
import br.com.treinar.bb.modelo.banco.ITarifavel;
import br.com.treinar.bb.util.BancoDados;

/**
 * Camada de controle, importante para evitar que 
 * a camada de visao converse diretamente com a camada
 * de modelo evitando assim que uma camada de visão seja
 * reescrita sempre que uma nova visão seja criada
 * @author ADM
 *
 */
public class ContaControle {

	public BancoDados bancoDados;
	
	public ContaControle() {
		bancoDados = BancoDados.getInstance();
	}
	
	public void gravarConta(Conta conta) {
		conta.depositar(0d);
		bancoDados.conta = conta;
		
	}

	public void efetuarDeposito(Double valor) {
		bancoDados.conta.depositar(valor);
	}

	/**
	 * Método para efetuar saques na conta, caso o saque seja efetuado
	 * o saldo da conta será reduzido do valor sacado
	 * 
	 * @param valor a ser sacado
	 * @return true caso o saque seja efetuado e false caso contrário
	 */
	public Boolean efetuarSaque(Double valor) {
		//Efetua o saque na conta
		return bancoDados.conta.sacar(valor);
	}

	public Double recuperarSaldo() {
		return bancoDados.conta.recuperarSaldo();
	}
	
	public void atualizarTaxaRendimento(Double valorTaxaRendimento) {
		ContaPoupanca.setTaxaRendimento(valorTaxaRendimento);
	}

	public Double recuperarTaxaRendimentoPoupanca() {
		return ContaPoupanca.getTaxaRendimento();
	}

	public void tarifar() {
		Conta c = bancoDados.conta;
		if (c instanceof ITarifavel) {
			((ITarifavel) c).tarifar();
		}
	}

	public void captalizar() {
		Conta c = bancoDados.conta;
		if (c instanceof ICaptalizavel) {
			((ICaptalizavel) c).captalizar();
		}
		
	}
	
}
