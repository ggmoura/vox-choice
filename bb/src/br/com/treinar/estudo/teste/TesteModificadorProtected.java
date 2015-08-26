package br.com.treinar.estudo.teste;

import br.com.treinar.estudo.modelo.Mulher;
import br.com.treinar.estudo.modelo.principal.Pessoa;

public class TesteModificadorProtected {

	public static void main(String[] args) {
		Pessoa p = new Mulher();

		// o atributo nome foi definido como protected
		// portanto só pode ser acessado nas classes do
		// mesmo pacote na propria classe e nas
		// classes que herdam da classe onde foi definido

		// p.nome = "Amanda Cravo Moura";

		p.caminhar();
	}

}
