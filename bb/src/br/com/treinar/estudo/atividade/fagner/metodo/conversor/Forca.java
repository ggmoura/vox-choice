package br.com.treinar.estudo.atividade.fagner.metodo.conversor;

public class Forca {

	public static Float converterNewtonParaQuilogramaForca(Float newton) {
		Float resultado = null;
		resultado = (float) (newton * 0.1020);
		return resultado;
	}

	public static Float converterNewtonParaLibraForca(Float newton) {
		Float resultado = null;
		resultado = (float) (newton * 0.2248);
		return resultado;
	}

	public static Float converterQuilogramaForcaParaNewton(Float quilogramaForca) {
		Float resultado = null;
		resultado = (float) (quilogramaForca * 9.80665);
		return resultado;
	}

	public static Float converterQuilogramaForcaParaLibraForca(Float quilogramaForca) {
		Float resultado = null;
		resultado = (float) (quilogramaForca * 2.2046);
		return resultado;
	}

	public static Float converterLibraForcaParaNewton(Float libraForca) {
		Float resultado = null;
		resultado = (float) (libraForca * 4.4482);
		return resultado;
	}

	public static Float converterLibraForcaParaQuilogramaForca(Float libraForca) {
		Float resultado = null;
		resultado = (float) (libraForca * 0.45359);
		return resultado;
	}

	public static Float converterForca(Float forca, TipoForca entrada, TipoForca saida) {
		Float forcaSaida = null;

		switch (entrada) {
		case NEWTON:
			switch (saida) {
			case QUILOGRAMA_fORÇA:
				forcaSaida = converterNewtonParaQuilogramaForca(forca);
				break;
			case LIBRA_fORÇA:
				forcaSaida = converterNewtonParaLibraForca(forca);
				break;

			default:
				break;
			}

			break;
		case QUILOGRAMA_fORÇA:
			switch (saida) {
			case NEWTON:
				forcaSaida = converterQuilogramaForcaParaNewton(forca);
				break;
			case LIBRA_fORÇA:
				forcaSaida = converterQuilogramaForcaParaLibraForca(forca);
				break;

			default:
				break;
			}

			break;

		case LIBRA_fORÇA:
			switch (saida) {
			case QUILOGRAMA_fORÇA:
				forcaSaida = converterLibraForcaParaQuilogramaForca(forca);
				break;
			case NEWTON:
				forcaSaida = converterLibraForcaParaNewton(forca);
				break;

			default:
				break;
			}

			break;

		}
		return forcaSaida;

	}
}
