package br.com.treinar.estudo.teste;

import br.com.treinar.estudo.modelo.Carro;
import br.com.treinar.estudo.modelo.Placa;



public class TesteHashCode {

	
	public static void main(String[] args) {
		Placa placaC = new Placa();
		placaC.setLetra("HDD");
		placaC.setNumero(9004);
		
		Placa placaC2 = new Placa();
		placaC2.setLetra("HDD");
		placaC2.setNumero(9004);
		
		Carro c = new Carro();
		c.placa = placaC;
		
		Carro c2 = new Carro();
		c2.placa = placaC2;
		
		System.out.println(c.equals(c2));
		
		System.out.println(c.hashCode());
		System.out.println(c2.hashCode());
		
		
	}
	
	
	
}
