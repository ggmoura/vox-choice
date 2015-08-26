package br.com.treinar.estudo.atividade.henrique.metodo;

public class TestaLapis {
	
	public static void main(String[] args) {
		
		Lapis l = new Lapis();
		
		l.cor = "Amarelo";
		l.tamanho = 17;
		
		l.escrever("Bola");
		System.out.println(l.tamanho);
		
		l.diminuirTamanho(5);
		System.out.println(l.tamanho);
		
	}

}
