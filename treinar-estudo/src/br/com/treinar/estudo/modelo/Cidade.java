package br.com.treinar.estudo.modelo;

import java.util.List;

import br.com.treinar.estudo.modelo.principal.Pessoa;

public class Cidade {

//	private Estado estado;
	private String nome;
	private List<Pessoa> moradores;

//	public Estado getEstado() {
//		return estado;
//	}
//
//	public void setEstado(Estado estado) {
//		this.estado = estado;
//	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Pessoa> getMoradores() {
		return moradores;
	}

	public void setMoradores(List<Pessoa> moradores) {
		this.moradores = moradores;
	}

}
