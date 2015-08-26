package br.com.treinar.estudo.teste;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteExcecaoChecada {

	public static void main(String[] args) {

		try {
			metodoUm();
		} catch (ParseException e) {
			System.out.println("erro ao converter uma data");
		}

		System.out.println("teste");
	}

	private static void metodoUm() throws ParseException {
		String hojeStr = "25/08/2015";

		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		Date data = null;

		data = formatador.parse(hojeStr);
		System.out.println(data);
		
		hojeStr = "aa/08/2015";
		data = formatador.parse(hojeStr);
		
	}

}
