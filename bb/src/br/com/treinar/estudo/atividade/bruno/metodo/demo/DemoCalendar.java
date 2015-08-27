package br.com.treinar.estudo.atividade.bruno.metodo.demo;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DemoCalendar {
	
	public static void main(String[] args) {
		// ****Calendar****
		Calendar nacimento = Calendar.getInstance();
		nacimento.set(1996, 2, 14);
		System.out.println(nacimento.getTime());
		// ****Calendar****
		Scanner leitor = new Scanner(System.in);
		int dia,mes,ano;
		System.out.println("Informe o dia de nacimento");
		dia = leitor.nextInt();
		System.out.println("Informe o mes de nacimento");
		mes = leitor.nextInt();
		System.out.println("Informe o ano de nacimento");
		ano = leitor.nextInt();
		data(dia, mes, ano);
		leitor.close();
	}

	public static void data(int dia, int mes, int ano) {		
		//**GregorianCalendar
		String meses[] = {
				"Janeiro", "Fevereiro", "Março", "April",
				"Maio", "Junho", "Julho", "Agosto",
				"Setembro", "Outubro", "Novenbro", "Dezembro"};
		
		Calendar nacimento2 = new GregorianCalendar(ano,mes-1,dia);
		System.out.println(nacimento2.get(Calendar.DAY_OF_MONTH)+" "+meses[Calendar.MONTH]+" "+nacimento2.get(Calendar.YEAR));
		//**GregorianCalendar
		
	}

}
