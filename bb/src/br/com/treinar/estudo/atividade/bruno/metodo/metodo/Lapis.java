package br.com.treinar.estudo.atividade.bruno.metodo.metodo;

public class Lapis {
	public String nome = "Fab";
	public String modelo = "35";
	public String cor = "Grafite";
	public int tamanho = 10;

	public void escrever(String texto) {
		System.out.println(texto);
		apontar(texto.length());
	}

	public void apontar(int qntApontar) {
		int temp = 0;
		temp = tamanho - qntApontar;
		if (temp > 0) {
			tamanho = tamanho - qntApontar;
		}
	}
}
