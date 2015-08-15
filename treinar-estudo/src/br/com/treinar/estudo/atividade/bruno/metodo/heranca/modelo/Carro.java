package br.com.treinar.estudo.atividade.bruno.metodo.heranca.modelo;

public class Carro {

	public String cor;
	public String modelo;
	public String rodas;
	public int combustivelMotor; // 1 gasolina 2 alcool 3 Flex
	public int combustivel = 0;

	public void carac() {
		System.out.println("Modelo:" + modelo + "cor" + cor);
	}

}
