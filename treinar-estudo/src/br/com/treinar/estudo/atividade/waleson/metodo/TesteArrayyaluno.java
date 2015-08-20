package br.com.treinar.estudo.atividade.waleson.metodo;

import java.util.Scanner;

public class TesteArrayyaluno {



	public static void main(String[] args) {

		//variavel para recuperar informações do teclado
		Scanner leitor=new Scanner(System.in);
		
		//informacao para o usuario saber o que tem que ser feito
		System.out.print("Informe quantidade de ele na array: ");
		
		//recupera efetivamente o valor inteiro digitado pelo usuario
		Integer quantidade=leitor.nextInt();
		
		leitor.close(); //para fechar o uso do teclado, solicitado pelo Scanner 
		
		//cria um array com a quantidade de posições informada pelo usuario
		Integer[] numeros=new Integer[quantidade];
		
		//percorre o array populando com valores de zero até o valor informado pelo usuario
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i;
		}

		//imprime os numeros para saber que está dando tudo certo
		for (Integer numero : numeros) {
			System.out.print(numero + " ");
		}
		System.out.println("\n\nInvertidos\n");
		for (int i = numeros.length - 1; i >= 0; i--) {
			System.out.print(numeros[i] + " ");
		}
		
	
	}

}
