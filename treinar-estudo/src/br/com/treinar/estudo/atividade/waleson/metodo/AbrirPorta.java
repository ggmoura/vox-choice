package br.com.treinar.estudo.atividade.waleson.metodo;

public class AbrirPorta {

	public static void main(String[] args) {

		Porta p = new Porta();

		p.portaAberta = true;

		System.out.println(p.portaAberta);
		
		p.fecharPorta();

		System.out.println(p.portaAberta);

	}

}
