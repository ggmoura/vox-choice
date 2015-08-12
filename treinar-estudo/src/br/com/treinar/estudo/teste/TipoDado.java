package br.com.treinar.estudo.teste;

public class TipoDado {

	static byte sexo;
	
	public static void main(String[] args) {

		System.out.println(sexo);

		short s = 32000;
		System.out.println(s);

		int inteiro = 15444;
		System.out.println(inteiro);
		int inteiroComSeparador = 1_5_4_4_4;
		System.out.println(inteiroComSeparador);

		long inteiroGrande = 92233720415646546L;
		System.out.println(inteiroGrande);
		long inteiroGrande2 = 922L;
		System.out.println(inteiroGrande2);

		float pi = (float) 3.14;
		System.out.println(pi);

		double d = 4565464.65465;
		System.out.println(d);

		boolean ehProfessor = true;
		System.out.println(ehProfessor);

		char letra = '\t';
		System.out.println(letra);

		String nome = "\"Gleidson\"";
		System.out.println(nome);

	}

}
