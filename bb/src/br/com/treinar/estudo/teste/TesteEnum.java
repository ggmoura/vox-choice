package br.com.treinar.estudo.teste;

import br.com.treinar.estudo.modelo.Carro;
import br.com.treinar.estudo.modelo.Placa;
import br.com.treinar.estudo.modelo.TipoCarro;

public class TesteEnum {

	public static void main(String[] args) {
		
		Placa placa = new Placa();
		placa.setLetra("HDD");
		placa.setNumero(9004);
		
		Carro c = new Carro();
		c.nome = "crossfox";
		c.placa = placa;
		c.tipoCarro = TipoCarro.CROSS;
	}
	
}
