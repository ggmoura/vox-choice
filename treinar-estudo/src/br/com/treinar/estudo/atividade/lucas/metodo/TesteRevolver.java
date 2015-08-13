package br.com.treinar.estudo.atividade.lucas.metodo;

public class TesteRevolver {

	public static void main(String[] args) {

		Revolver r = new Revolver();
		r.nome = "Tres oitão";
		r.qtdBalasAtual = 0;
		r.qtdBalasTotal = 6;
		
		Boolean atirou = r.atirar();
		System.out.println(r.qtdBalasAtual);
		r.recarregar(4);
		r.atirar();
		System.out.println(r.qtdBalasAtual);

	}

}
