package br.com.treinar.estudo.modelo.principal;

/*
 * Java Bean: toda classe java que possui o 
 * construtor defaul e metodo de acesso para 
 * todos os atributos
 * @author ADM
 *
 */
public abstract class Pessoa implements Comparable<Pessoa> {

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", idade=" + idade	+ "]";
	}

	@Override
	public int compareTo(Pessoa o) {
		
		return this.nome.compareTo(o.nome);
	}

	
}
