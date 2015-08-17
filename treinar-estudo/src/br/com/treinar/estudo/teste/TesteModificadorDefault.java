package br.com.treinar.estudo.teste;

import br.com.treinar.estudo.modelo.Mulher;
import br.com.treinar.estudo.modelo.principal.Pessoa;


public class TesteModificadorDefault {

	public static void main(String[] args) {
		Pessoa p = new Mulher();
		
		//o atributo nome foi definido como default 
		//(sem modificador de acesso)
		//portanto só pode ser acessado nas classes do 
		//mesmo pacote na propria classe
		//p.nome = "Amanda Cravo Moura";
		
		p.caminhar();
	}
	
}
