package br.com.treinar.estudo.teste.jdbc.modelo;

import java.util.Date;

import br.com.treinar.estudo.util.Util;

public class Contato {

	private Long id;
	private String nome;
	private String email;
	private String endereco;
	private Date dataNascimento;

	// métodos get e set para id, nome, email, endereço e dataNascimento

	public String getNome() {
		return this.nome;
	}

	public void setNome(String novo) {
		this.nome = novo;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String novo) {
		this.email = novo;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String novo) {
		this.endereco = novo;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long novo) {
		this.id = novo;
	}

	public Date getDataNascimento() {
		return this.dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Contato [id=" + id + ", nome=" + nome + ", email=" + email
				+ ", endereco=" + endereco + ", dataNascimento="
				+ Util.getInstance().formatarData(dataNascimento) + "]";
	}
	
}