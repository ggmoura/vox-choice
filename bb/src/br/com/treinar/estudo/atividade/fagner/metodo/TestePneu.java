package br.com.treinar.estudo.atividade.fagner.metodo;

public class TestePneu {

	public static void main(String[] args) {
		
		Pneu p = new Pneu();
		
		p.setMarca("pirelli");
		p.setTipo("Liso");
		p.setPolegada(17);
		System.out.println(p.getMarca());
		System.out.println(p.getTipo());
		System.out.println(p.getPolegada());
	}
}