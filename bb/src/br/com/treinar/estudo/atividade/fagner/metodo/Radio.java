package br.com.treinar.estudo.atividade.fagner.metodo;

public class Radio {
	
	public String modelo;
	public String cor;
	public Integer hLigar;
	public Integer hDesligar;
	public Boolean estado;
	
	public void ligar(Integer horaAtual) {
		if (hLigar == horaAtual) {
			estado = true;
		}
	}
	
	public void desligar(Integer horaAtual) {
		if (hDesligar == horaAtual) {
			estado = false;
		}
	}

}
