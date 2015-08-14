package br.com.treinar.estudo.visao;

import br.com.treinar.estudo.modelo.Carro;
import br.com.treinar.estudo.modelo.Pessoa;

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
		
		c.proprietario = new Pessoa();
		
		c.proprietario.nome = "Gleidson";
		c.proprietario.cpf = 55546265302l;
		
		Pessoa dono = c.recuperarProprietario();
		Pessoa dono2 = c.criarProprietario();
		System.out.println(dono.nome);
		System.out.println(dono.cpf);
		System.out.println(dono2.nome);
		System.out.println(dono2.cpf);
		
	}
	
}
