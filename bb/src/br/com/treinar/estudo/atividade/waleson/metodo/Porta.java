package br.com.treinar.estudo.atividade.waleson.metodo;

public class Porta {

	public Integer altura;
	public Integer largura;
	public Integer peso;
	public Integer abrirPraFora;
	public Integer autoOpen;
	public Integer autoClose;
	public Boolean portaAberta;

	public void abrirPorta() {
		if (!portaAberta) {
			portaAberta = true;
		}
	}
	
	public void fecharPorta() {
		if (portaAberta) {
			portaAberta = false;
		}
	}

}
