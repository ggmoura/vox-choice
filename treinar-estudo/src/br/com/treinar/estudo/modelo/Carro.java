package br.com.treinar.estudo.modelo;

import br.com.treinar.estudo.modelo.principal.Pessoa;

public class Carro {

	public String nome;
	public Integer velocidadeMaxima;
	public Integer qtdMarcha;
	public Integer marchaAtual;
	public Pessoa proprietario;
	public Double valor;
	public static Integer taxaIPVA;
	public Placa placa;
	

	static {
		taxaIPVA = 4;
	}
	
	static {
		taxaIPVA = 5;		
	}
	
	public Carro() {
		System.out.println("criou novo carro");
	}
	
	public static void imprimirTaxaIPVA(Double valor) {
		//System.out.println(taxaIPVA / 100 * valor);
		System.out.println(taxaIPVA * 100 / valor);
	}

	

	public void acelerar() {
		// velocidadeAtual = velocidadeAtual + 1;
		// velocidadeAtual += 1;
		if (velocidadeAtual < velocidadeMaxima) {
			velocidadeAtual++;
			trocarMarcha();
		}
	}

	public Integer velocidadeAtual;
	
	public void trocarMarcha(Integer marcha) {
		if (marcha > 0 && marcha <= 6) {
			marchaAtual = marcha;
		}
	}

	public void trocarMarcha() {
		if (velocidadeAtual == 0) {
			marchaAtual = null;
		} else if (velocidadeAtual < 10) {
			marchaAtual = 1;
		} else if (velocidadeAtual < 20) {
			marchaAtual = 2;
		} else if (velocidadeAtual < 30) {
			marchaAtual = 3;
		} else if (velocidadeAtual < 40) {
			marchaAtual = 4;
		} else {
			marchaAtual = 5;
		}
	}

	public void desacelerar() {
		// velocidadeAtual = velocidadeAtual + 1;
		// velocidadeAtual += 1;
		if (velocidadeAtual > 0) {
			velocidadeAtual--;
			trocarMarcha();
		}
	}

	public Integer recuperarMarchaAtual() {
		// definir marcha
		return marchaAtual;
	}

	public Pessoa recuperarProprietario() {
		// regra
		return proprietario;
	}

	public Pessoa criarProprietario() {
		Pessoa p = new Mulher();
		p.setNome("criada");
		p.setCpf(645654346l);
		return p;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((placa == null) ? 0 : placa.hashCode());
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
		Carro other = (Carro) obj;
		if (placa == null) {
			if (other.placa != null)
				return false;
		} else if (!placa.equals(other.placa))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Carro [\n\tnome=" + nome + ",\n\tvelocidadeMaxima=" + velocidadeMaxima
				+ ",\n\tqtdMarcha=" + qtdMarcha + ",\n\tmarchaAtual=" + marchaAtual
				+ ",\n\tproprietario=" + proprietario + ",\n\tvalor=" + valor
				+ ",\n\tplaca=" + placa + ",\n\tvelocidadeAtual=" + velocidadeAtual
				+ "\n]";
	}

	

}