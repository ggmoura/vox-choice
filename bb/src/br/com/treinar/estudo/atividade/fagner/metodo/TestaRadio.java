package br.com.treinar.estudo.atividade.fagner.metodo;

public class TestaRadio {
	
	public static void main(String[] args) {
		
		Radio r = new Radio();
		
		r.cor = "Preto";
		r.modelo = "Samsung";
		r.hLigar = 8;
		r.hDesligar = 17;
		r.estado = false;
		
		r.ligar(8);
		System.out.println(r.estado);

	}

}
