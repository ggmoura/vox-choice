package br.com.treinar.estudo.teste;

import br.com.treinar.estudo.modelo.DiaSemana;

public class TesteEnumDiaSemana {

	
	public static void main(String[] args) {
		//DiaSemana segunada = DiaSemana.SEGUNDA_FEIRA;
		
		//System.out.println(segunada);
		
		DiaSemana[] dias = DiaSemana.values();
		
		for (DiaSemana diaSemana : dias) {
			System.out.println(diaSemana.getDescricao());
		}
		
		DiaSemana terca = DiaSemana.valueOf("TERCA_FEIRA");
		
		System.out.println(terca);
		
		System.out.println(terca.ordinal());
		
		
	}
	
}
