package br.com.treinar.estudo.teste;

import br.com.treinar.estudo.modelo.Mulher;
import br.com.treinar.estudo.modelo.principal.Pessoa;


public class TesteModificadorPublic {

	public static void main(String[] args) {
		Pessoa p = new Mulher();
		
		//o atributo nome foi definido como public
		//portanto pode ser acessado em qualquer 
		//ponto do codigo
		
		//p.nome = "Amanda Cravo Moura";
		
		p.caminhar();
	}
	
}
