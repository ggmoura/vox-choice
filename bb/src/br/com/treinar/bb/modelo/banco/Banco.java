package br.com.treinar.bb.modelo.banco;

/**
 * Quando um atributo for definido como final,
 * o valor deste devera ser inicializado
 * @author ADM
 *
 */
public class Banco {

	public static final Integer HORA_ABERTURA;
	public static final Integer HORA_FECHAMENTO;
	
	static {
		HORA_ABERTURA = 9;
		HORA_FECHAMENTO = 16;
	}
	
}
