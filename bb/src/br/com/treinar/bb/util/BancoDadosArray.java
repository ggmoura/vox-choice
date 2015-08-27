package br.com.treinar.bb.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.treinar.bb.modelo.banco.Conta;
import br.com.treinar.bb.modelo.banco.SituacaoConta;

/**
 * Padrao de projeto singleton
 * 
 * esta classe so pode ser instanciada internamente
 * eh possivel recuperar a instancia dela a partir do metodo 
 * getInstance
 * 
 * @author ADM
 *
 */
public class BancoDadosArray implements IBancoDados<Conta[]> {

	private static BancoDadosArray instance;
	
	private Conta[] contas;
	private Integer index;
	
	private BancoDadosArray() {
		carregarObjetos();
	}

	public void adicionarConta(Conta conta/*parametro do metodop*/) {
		if (index < contas.length) {
			contas[index++] = conta;			
		}
	}
	
	public Conta recuperarConta(Long numeroConta) {
		Conta conta = null;
		for (Conta contaTemp : contas) {
			if (contaTemp != null && 
					contaTemp.getNumeroConta().equals(numeroConta)) {
				conta = contaTemp;
				break;
			}
		}
		return conta;
	}
	
	static {
		instance = new BancoDadosArray();
	}
	
	
	public static BancoDadosArray getInstance() {
		return instance;
	}

	public Conta[] recuperarContas() {
		Integer qtd = 0;
		for (Conta conta : contas) {
			if (conta != null && conta.getSituacao().equals(SituacaoConta.ATIVA)) {
				qtd++;
			}
		}
		Conta[] contasAtivas = new Conta[qtd];
		for (int j = 0; j < contas.length; j++) {
			if (contas[j] != null && contas[j].getSituacao().equals(SituacaoConta.ATIVA)) {
				contasAtivas[j] = contas[j];
			}			
		}
		return contasAtivas;
	}

	public void cancelarConta(Conta c) {
		c.setSituacao(SituacaoConta.CANCELADA);
	}
	
	public void gravarDados() {
        try {
            //Gera o arquivo para armazenar o objeto
            FileOutputStream arquivoGrav = new FileOutputStream("contas.dat");
            //Classe responsavel por inserir os objetos
            ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
            //Grava o objeto cliente no arquivo
            objGravar.writeObject(contas);
            objGravar.flush();
            objGravar.close();
            arquivoGrav.flush();
            arquivoGrav.close();
            System.out.println("Contas gravadas com sucesso!");

        } catch (Exception e) {
        	System.out.println(e);
        }
	}
	
	private void carregarObjetos() {
		try {
			File f = new File("contas.dat");
			if (f.exists()) {
				FileInputStream arquivoLeitura = new FileInputStream("contas.dat");
				ObjectInputStream objLeitura = new ObjectInputStream(arquivoLeitura);
				contas = (Conta[]) objLeitura.readObject();				
				objLeitura.close();
	            arquivoLeitura.close();
	            
	            for (int i = 0; i < contas.length; i++) {
					if (contas[i] == null) {
						index = i;
						break;
					}
				}
	            
			} else {
				contas = new Conta[50];
				index = 0;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
