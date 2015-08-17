package br.com.treinar.estudo.modelo.principal;

/*
 * Java Bean: toda classe java que possui o 
 * construtor defaul e metodo de acesso para 
 * todos os atributos
 * @author ADM
 *
 */
public abstract class Pessoa {

	private String nome;
	private Long cpf;
	private Integer idade;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public abstract void caminhar();

}
