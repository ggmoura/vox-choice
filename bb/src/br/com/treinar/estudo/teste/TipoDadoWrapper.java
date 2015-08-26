package br.com.treinar.estudo.teste;

public class TipoDadoWrapper {

	static Integer i;
	public static void main(String[] args) {
		i = 10;
//		System.out.println(i);
		
		
		Integer dezA = 10;
		Integer dezB = 10;
		Integer milA = 1000;
		Integer milB = 1000;
		
		Integer dezNew = new Integer(10);
		
		System.out.println(dezA == dezB);
		System.out.println(dezA == dezNew);
		System.out.println(milA == milB);
		
	}
	
}
