package br.com.treinar.estudo.atividade.fagner.metodo;

import java.util.Calendar;

public class Aniversario {
	
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		
		c.set(Calendar.DAY_OF_MONTH, 22);
		c.set(Calendar.MONTH, 4);
		c.set(Calendar.YEAR, 1989);
		
		System.out.println("Dia " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("Mês " + c.get(Calendar.MONTH));
		System.out.println("Ano " + c.get(Calendar.YEAR));
		
		
		
		
	}

}
