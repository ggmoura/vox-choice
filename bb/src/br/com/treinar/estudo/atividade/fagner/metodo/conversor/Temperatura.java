package br.com.treinar.estudo.atividade.fagner.metodo.conversor;

public class Temperatura {

	public static Float converterCelsiusParaFahrenheit(Double celsius) {
		Float resultado = null;
		resultado = (float) (celsius * 1.8 + 32);

		return resultado;
	}

	public static Float converterCelsiusParakelvin(Double celsius) {
		Float resultado = null;
		resultado = (float) (celsius + 273.15);

		return resultado;

	}

	public static Float converterKelvinParaFahrenheit(Double kelvin) {
		Float resultado = null;
		resultado = (float) ((kelvin - 273.15) * 1.8 + 32);

		return resultado;
	}

	public static Float converterkelvinParaCelsius(Double kelvin) {
		Float resultado = null;
		resultado = (float) (kelvin - 273.15);

		return resultado;

	}

	public static Float converterFahrenheitParaCelsius(Double fahrenheit) {
		Float resultado = null;
		resultado = (float) ((fahrenheit - 32) / 1.8);

		return resultado;
	}

	public static Float converterFahrenheitParakelvin(Double fahrenheit) {
		Float resultado = null;
		resultado = (float) ((fahrenheit - 32) / 1.8 + 273.15);

		return resultado;
	}

	public static Float converterTemperatura(Double temperatura,
			TipoTemperatura entrada, TipoTemperatura saida) {
		Float temperaturaSaida = null;

		switch (entrada) {
		case CELSIUS:
			switch (saida) {
			case FAHRENHEIT:
				temperaturaSaida = converterCelsiusParaFahrenheit(temperatura);
			case KELVIN:
				temperaturaSaida = converterCelsiusParakelvin(temperatura);
			default:
				break;
			}

			break;
		case KELVIN:
			switch (saida) {
			case FAHRENHEIT:
				temperaturaSaida = converterKelvinParaFahrenheit(temperatura);
			case CELSIUS:
				temperaturaSaida = converterkelvinParaCelsius(temperatura);
			default:
				break;
			}

			break;
		case FAHRENHEIT:
			switch (saida) {
			case CELSIUS:
				temperaturaSaida = converterFahrenheitParaCelsius(temperatura);
			case KELVIN:
				temperaturaSaida = converterFahrenheitParakelvin(temperatura);
			default:
				break;
			}
			break;

		default:
			break;
		}

		return temperaturaSaida;
	}
}
