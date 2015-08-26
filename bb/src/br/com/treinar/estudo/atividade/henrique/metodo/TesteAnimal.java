package br.com.treinar.estudo.atividade.henrique.metodo;

public class TesteAnimal {
	
	public static void main(String[] args) {
		
		Peixe p = new Peixe();
		p.tamanho = 50;
		p.locomover();
		p.possuiBarbatanaTipoA = Boolean.FALSE;
		
		Ave a = new Ave();
		a.tamanho = 130;
		a.locomover();
		a.tamanhoBico = 45;
		
		Integer i = 2;
		
		Animal an = null;
		
		if (i % 2 == 0) {
			an = new Peixe();
			an.tamanho = 60;
			((Peixe)an).possuiBarbatanaTipoA = Boolean.TRUE;
		} else {
			an = new Ave();
			an.tamanho = 170;			
		}
		
		if (an instanceof Peixe) {
			System.out.println(((Peixe)an).possuiBarbatanaTipoA);			
		}

		
	
	}

}
