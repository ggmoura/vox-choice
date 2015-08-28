package br.com.treinar.estudo.atividade.fagner.metodo.conversor;

public class Energia {

	
	public static Float ConverterJoulesParaBtu(Float joules) {
		Float resultado = null;
		resultado = joules * 0.00094781712f;
		return resultado;
	}

	public static Float ConverterJoulesParaCalorias(Float joules) {
		Float resultado = null;
		resultado = joules * 0.00023884f;
		return resultado;
	}

	public static Float ConverterBtuParaJoules(Float btu) {
		Float resultado = null;
		resultado = btu * 1055.056f;
		return resultado;
	}

	public static Float ConverterBtuParaCalorias(Float btu) {
		Float resultado = null;
		resultado = btu * 0.2522f;
		return resultado;
	}

	public static Float ConverterCaloriasParaJoules(Float calorias) {
		Float resultado = null;
		resultado = calorias * 0.23884f;
		return resultado;
	}

	public static Float ConverterCaloriasParaBtu(Float calorias) {
		Float resultado = null;
		resultado = calorias * 0.003970144f;
		return resultado;
	}

	public static Float converterEnergia(Float energia, TipoEnergia entrada, TipoEnergia saida) {
		Float energiaSaida = null;

		switch (entrada) {
		case JOULES:
			switch (saida) {
			case BTU:
				energiaSaida = ConverterJoulesParaBtu(energia);
				break;
			case CALORIAS:
				energiaSaida = ConverterJoulesParaCalorias(energia);
				break;
			default:
				break;
						
			}
			break;
		case BTU:
			switch (saida) {
			case JOULES:
				energiaSaida = ConverterBtuParaJoules(energiaSaida);
				break;
			case CALORIAS:
				energiaSaida = ConverterBtuParaCalorias(energiaSaida);
				break;
			default:
				break;
			}

			break;
		case CALORIAS:
			switch (saida) {
			case JOULES:
				energiaSaida = ConverterCaloriasParaJoules(energiaSaida);			
				break;
			case BTU:
				energiaSaida = ConverterCaloriasParaBtu(energiaSaida);			
				break;

			default:
				break;
			}
		}
		return energiaSaida;
	}
}