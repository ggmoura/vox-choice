package br.com.treinar.estudo.teste;

public class Operador {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		int soma = num1 + num2;
		int subracao = num1 - num2;
		int multiplicacao = num1 * num2;
		float divisao = num1 / (float) num2;
		int modulo = 12 % 5;
		boolean negacao = true;
		boolean comparacao = (num1 + 10) == num2;
		boolean condicionalE = num1 == 10 && num2 == 20;
		boolean condicionalOU = num1 == 10 || num2 == 20;
		
		System.out.println("Soma: " + soma);
		System.out.println("Subração: " + subracao);
		System.out.println("Multiplicação: " + multiplicacao);
		System.out.println("Multiplicação: " + (num1 + num2) * num2);
		System.out.println("Divisão: " + divisao);
		System.out.println("Resto Divisão: " + modulo);
		System.out.println("Negação !: " + !negacao);
		System.out.println("Comparação ==: " + comparacao);
		System.out.println("Condicional &&: " + condicionalE);
		System.out.println("Condicional ||: " + condicionalOU);
		
		int incremento = 0;
		
		incremento = incremento + 1;
		
		System.out.println("incremento = incremento + 1: " + incremento);
		
		incremento++;
		
		System.out.println("[pos]incremento++: " + incremento);
		
		++incremento;
		
		System.out.println("[pré]++incremento: " + incremento);
		
		int pos = incremento++;
		System.out.println("[pré]++incremento: " + pos);
		
		int pre = ++incremento;
		System.out.println("[pos]++incremento: " + pre);
		
		
		System.out.println(pre++);
		System.out.println(++pre);
		
		
	}
	
}
