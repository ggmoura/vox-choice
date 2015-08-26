package br.com.treinar.estudo.atividade.henrique.metodo;

public class TesteAnimalJavaBean {

	public static void main(String[] args) {
		
		AnimalJavaBean ajb = new AnimalJavaBean();
		
		ajb.setTamanho(50);
		Integer tamanho = ajb.getTamanho();
		System.out.println(tamanho);
		ajb.setHabitat("selva");
		System.out.println(ajb.getHabitat());
		ajb.setCor("azul");
		System.out.println(ajb.getCor());
		
		
		
	}
}
