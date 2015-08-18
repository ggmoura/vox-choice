package br.com.treinar.estudo.atividade.bruno.metodo.encapsulado;

public class Teste {
	public static void main(String[] args) {
		Funcao f = new Funcao();
		f.setNome("Bruno");
		f.setNomeMae("Vanessa");
		System.out.println(f.getNome());
		System.out.println(f.getNomeMae());
	}

}
