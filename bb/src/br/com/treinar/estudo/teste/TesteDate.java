package br.com.treinar.estudo.teste;

import java.util.Calendar;
import java.util.Date;

public class TesteDate {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		Date inicio = new Date();
		
		System.out.println(inicio.getTime());
		
		Thread.sleep(1000 * 2);
		
		Date termino = new Date();
		
		System.out.println(termino.getTime());
		
		System.out.println((termino.getTime() - inicio.getTime()) / 1000);
		
		System.out.println(inicio.before(termino));
		System.out.println(inicio.after(termino));
		System.out.println(inicio.compareTo(termino));
		
		Date meuAniversario = new Date(80, 11, 3);
	
		System.out.println(meuAniversario);
		
		Calendar c = Calendar.getInstance();
		//c.add(Calendar.DAY_OF_MONTH, 7);
		System.out.println(c.getTime());
		System.out.println("Dia do Mês: " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("Dia do Mês: " + c.get(Calendar.DAY_OF_YEAR));

		c.set(Calendar.DAY_OF_MONTH, 3);
		c.set(Calendar.MONTH, 11);
		c.set(Calendar.YEAR, 1980);
		
		System.out.println(c.getTime());
		
	}
	
}
