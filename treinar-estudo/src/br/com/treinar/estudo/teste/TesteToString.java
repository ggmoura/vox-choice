package br.com.treinar.estudo.teste;

import br.com.treinar.estudo.modelo.Carro;
import br.com.treinar.estudo.modelo.Placa;

public class TesteToString {

	public static void main(String[] args) {
		Placa placaC = new Placa();
		placaC.setLetra("HDD");
		placaC.setNumero(9004);
		
		Carro c = new Carro();
		c.placa = placaC;
		
		System.out.println(c);
		
	}
	
}
