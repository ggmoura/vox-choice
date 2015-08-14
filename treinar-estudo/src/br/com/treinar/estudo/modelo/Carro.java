package br.com.treinar.estudo.modelo;

public class Carro {

	public String nome;
	public Integer velocidadeMaxima;
	public Integer velocidadeAtual;
	public Integer qtdMarcha;
	public Integer marchaAtual;
	public Pessoa proprietario;

	public void acelerar() {
		// velocidadeAtual = velocidadeAtual + 1;
		// velocidadeAtual += 1;
		if (velocidadeAtual < velocidadeMaxima) {
			velocidadeAtual++;
			trocarMarcha();
		}
	}

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
		Pessoa p = new Pessoa();
		p.nome = "criada";
		p.cpf = 645654346l;
		p.sexo = 'F';
		return p;
	}

}