package br.com.treinar.estudo.atividade.bruno.metodo.encapsulado;

public class Teste {
	public static void main(String[] args) {
		Funcao nome = null; // Estou limpando o ponteiro dele da memoria
		nome = new Funcao(); // Estou criando um novo ponteiro na memoria
		//serve para nao pegar um valor ja salvo

		nome.setNome("Bruno");

		nome.setNomeMae("Vanessa");

		System.out.println(nome.getNome());
		System.out.println(nome.getNomeMae());

	}
}
