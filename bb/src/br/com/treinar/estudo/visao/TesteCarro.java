package br.com.treinar.estudo.visao;

import br.com.treinar.estudo.modelo.Carro;
import br.com.treinar.estudo.modelo.Mulher;
import br.com.treinar.estudo.modelo.principal.Pessoa;

public class TesteCarro {

	public static void main(String[] args) {
		Carro c = null;
		c = new Carro();
		c.velocidadeAtual = 0;
		c.velocidadeMaxima = 160;
		c.qtdMarcha = 6;
		
		c.acelerar();
		c.acelerar();
		c.acelerar();
		c.acelerar();
		System.out.println(c.velocidadeAtual);
		
		
		Integer marcha = c.recuperarMarchaAtual();
		
		System.out.println(marcha);
		
		c.proprietario = new Mulher();
		
		c.proprietario.setNome("Gleidson");
		c.proprietario.setCpf(55546265302l);
		
		Pessoa dono = c.recuperarProprietario();
		Pessoa dono2 = c.criarProprietario();
		System.out.println(dono.getNome());
		System.out.println(dono.getCpf());
		System.out.println(dono2.getNome());
		System.out.println(dono2.getCpf());
		
	}
	
}
