package br.com.treinar.estudo.teste;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import br.com.treinar.estudo.modelo.Homem;
import br.com.treinar.estudo.modelo.Mulher;
import br.com.treinar.estudo.modelo.principal.Pessoa;

public class TesteMap {

	public static void main(String[] args) {
		
		Map<Long, Pessoa> map = new HashMap<Long, Pessoa>();
		
		Pessoa p = new Homem();
		Pessoa m = new Mulher();
		
		p.setNome("Juan Pablo");
		p.setCpf(675875687l);
		p.setIdade(30);
		
		m.setCpf(876987698l);
		m.setNome("Ivaneide");
		m.setIdade(98);
		
		map.put(p.getCpf(), p);
		map.put(m.getCpf(), m);
		
		Pessoa recuperado = map.get(p.getCpf());
		
		
		System.out.println(recuperado.getNome());
		
		Set<Long> keys = map.keySet();
		
		for (Long key : keys) {
			System.out.println(key);
			System.out.println(map.get(key));
		}
		
		Collection<Pessoa> pessoas = map.values();
		
		System.out.println(pessoas);
		
		Set<Entry<Long, Pessoa>> entrySet = map.entrySet();
		for (Entry<Long, Pessoa> entry : entrySet) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}
	
}
