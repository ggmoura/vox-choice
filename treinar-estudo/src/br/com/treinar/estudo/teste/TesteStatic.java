package br.com.treinar.estudo.teste;

import br.com.treinar.estudo.modelo.Carro;

/**
 * o valor de um atributo static vale para todos os objetos da
 * classe, portanto ele é da classe e não de uma 
 * instancia especifica, devemos manipula-lo sempre
 * a partir da classe e nao de uma instancia
 * @author ADM
 *
 */
public class TesteStatic {

	public static void main(String[] args) {

		Carro c = new Carro();
		
		System.out.println(Carro.taxaIPVA);
		
		c.nome = "Palio";
		System.out.println(Carro.taxaIPVA);

		//
		//c.taxaIPVA = 5;
		
		Carro c2 = new Carro();
		c2.nome = "Uno";

		System.out.println(Carro.taxaIPVA);
		
		Carro.imprimirTaxaIPVA(1000d);
		
		
	}
	
}
