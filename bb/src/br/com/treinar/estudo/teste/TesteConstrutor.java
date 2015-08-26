package br.com.treinar.estudo.teste;

import br.com.treinar.estudo.modelo.CertidaoNascimento;

public class TesteConstrutor {

	public static void main(String[] args) {
		
		CertidaoNascimento cdn = 
				new CertidaoNascimento("Nathalia Cravo Moura");
		
		CertidaoNascimento c2 = new CertidaoNascimento();
		System.out.println(c2);
		
		System.out.println(cdn.nomePessoa);
		
		
	}
	
}
