package br.com.treinar.estudo.teste;

import java.util.Comparator;

import br.com.treinar.estudo.modelo.principal.Pessoa;

public class CriterioComparacaoIdadePessoa implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa o1, Pessoa o2) {
		return o1.getIdade().compareTo(o2.getIdade());
	}

}
