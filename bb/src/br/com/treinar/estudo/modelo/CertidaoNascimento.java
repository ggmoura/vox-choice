package br.com.treinar.estudo.modelo;

public class CertidaoNascimento {
	
	public String nomePessoa;
	public Integer numeroCertidao;

	public CertidaoNascimento() {
		super();
	}
	
	public CertidaoNascimento(String nomePessoa) {
		//275 linhas de codigo
		this.nomePessoa = nomePessoa;
	}

	public CertidaoNascimento(String nomePessoa, Integer numeroCertidao) {
		this(nomePessoa);
		this.numeroCertidao = numeroCertidao;
	}
	
	
	
	
}
