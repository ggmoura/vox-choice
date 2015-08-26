package br.com.treinar.estudo.atividade.henrique.metodo;

public class Lapis {
	
	public Integer tamanho; // tamanho do lapis em cm
	public String cor; // cor do lapis

	public void escrever(String texto) {
		System.out.println(texto);
		diminuirTamanho();
	}
	
	public void diminuirTamanho() {
		tamanho--;
	}
	public void diminuirTamanho(Integer numeroVoltas) {
		tamanho -= numeroVoltas;
	}
}

