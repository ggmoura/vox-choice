package br.com.treinar.estudo.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {

	private static Util instance;
	
	static {
		instance = new Util();
	}
	
	private Util() {
		super();
	}
	
	public static Util getInstance() {
		return instance;
	}
	
	/**
	 * Formata uma data no padrao dd/MM/yyyy onde dd = Dia, MM = Mês, yyyy = Ano
	 * @param data
	 * @return
	 */
	public String formatarData(Date data) {
		return new SimpleDateFormat("dd/MM/yyyy").format(data);
	}
	
	
}
