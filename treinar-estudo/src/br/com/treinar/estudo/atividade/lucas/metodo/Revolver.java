package br.com.treinar.estudo.atividade.lucas.metodo;

public class Revolver {

	public String nome;
	public Integer qtdBalasTotal;
	public Integer qtdBalasAtual;

	public void recarregar(Integer balas) {
		if (qtdBalasAtual >= qtdBalasTotal) {
			System.out.println("Cartucho de balas já está cheio");
		} else {
			qtdBalasAtual=balas;
		}
	}
	
	public void atirar() {
		if (qtdBalasAtual <=0) {
			recarregar(1);
		}
		qtdBalasAtual--;
	
	}
}
