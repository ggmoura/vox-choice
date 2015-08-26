package br.com.treinar.estudo.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.treinar.estudo.modelo.Mulher;
import br.com.treinar.estudo.modelo.principal.Pessoa;

public class TesteOrdenaColecao {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 23, 3, 98);
		Collections.sort(numeros);
		System.out.println(numeros);
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		Pessoa p1 = new Mulher();
		p1.setNome("Amanda");
		p1.setIdade(7);
		p1.setCpf(231l);
		
		Pessoa p2 = new Mulher();
		p2.setNome("Carolina");
		p2.setIdade(8);
		p2.setCpf(123l);
		
		Pessoa p3 = new Mulher();
		p3.setNome("Beatriz");
		p3.setIdade(3);
		p3.setCpf(331l);
		
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		System.out.print("Antes de Ordenar: " + pessoas);
		Collections.sort(pessoas);
		System.out.print("\n\nDepois de Ordenar: " + pessoas);
		
		CriterioComparacaoIdadePessoa criterio = new CriterioComparacaoIdadePessoa();
		
		Collections.sort(pessoas, criterio);
		
		System.out.print("\n\nDepois de Ordenar por idade: " + pessoas);
		
		Collections.sort(pessoas, new Comparator<Pessoa>() {
			@Override
			public int compare(Pessoa o1, Pessoa o2) {
				return o1.getCpf().compareTo(o2.getCpf());
			}
		});
		
		System.out.print("\n\nDepois de Ordenar cpf idade: " + pessoas);
		
	}
}
