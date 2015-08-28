package br.com.treinar.estudo.atividade.fagner.metodo.conversor;

public class Pressao {

	public static Float converterPascalParaNewtonM2(Float pascal) {
		Float resultado = null;
		resultado = (float) pascal * 1;

		return resultado;

	}

	public static Float converterPascalParaquilogramaForcaM2(Float pascal) {
		Float resultado = null;
		resultado = (float) (pascal * 0.102);

		return resultado;

	}

	public static Float converterNewtonM2ParaPascal(Float newtonM2) {
		Float resultado = null;
		resultado = (float) (newtonM2 * 1);

		return resultado;

	}

	public static Float converterNewtonM2ParaquilogramaForcaM2(Float newtonM2) {
		Float resultado = null;
		resultado = (float) (newtonM2 * 0.102);

		return resultado;

	}

	public static Float converterquilogramaForcaM2ParaNewtonM2(Float quilogramaForcaM2) {
		Float resultado = null;
		resultado = (float) (quilogramaForcaM2 * 980.665);

		return resultado;

	}

	public static Float converterquilogramaForcaM2ParaPascal(Float quilogramaForcaM2) {
		Float resultado = null;
		resultado = (float) (quilogramaForcaM2 * 980.665);

		return resultado;

	}

	public static Float converterPessao(Float pressao, TiposPessao entrada, TiposPessao saida) {
		Float pressaoSaida = null;

		switch (entrada) {
		case PASCAL:
			switch (saida) {
			case NEWTON_M2:
				pressaoSaida = converterPascalParaNewtonM2(pressao);
				break;
			case QUILOGRAMA_FORCA_M2:
				pressaoSaida = converterPascalParaquilogramaForcaM2(pressao);
				break;

			default:
				break;
			}
			break;
		case NEWTON_M2:
			switch (saida) {
			case PASCAL:
				pressaoSaida = converterNewtonM2ParaPascal(pressao);
				break;
			case QUILOGRAMA_FORCA_M2:
				pressaoSaida = converterNewtonM2ParaquilogramaForcaM2(pressao);
				break;

			default:
				break;
			}
			break;
		case QUILOGRAMA_FORCA_M2:
			switch (saida) {
			case PASCAL:
				pressaoSaida = converterquilogramaForcaM2ParaPascal(pressao);
				break;
			case NEWTON_M2:
				pressaoSaida = converterquilogramaForcaM2ParaNewtonM2(pressao);
				break;

			default:
				break;
			}
			break;

		default:
			break;
		}

		return pressaoSaida;
	}

}
