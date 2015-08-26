package br.com.treinar.estudo.atividade.roger;

import java.util.Calendar;

public class Datas {
	
	
	public static void main(String[] args) {
		
		
		Calendar nasc = Calendar.getInstance();
		nasc.set(1979, 06, 05);
		
		System.out.println("Dia: "+ nasc.get(Calendar.DAY_OF_MONTH));
		System.out.println("Mês: "+ nasc.get(Calendar.MONTH));
		System.out.println("Ano: "+nasc.get(Calendar.YEAR));
		System.out.println("Ano: "+nasc.get(Calendar.WEEK_OF_MONTH));
	}

}
