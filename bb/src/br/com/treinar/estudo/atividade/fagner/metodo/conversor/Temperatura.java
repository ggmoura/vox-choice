package br.com.treinar.estudo.atividade.fagner.metodo.conversor;

public class Temperatura {

	public static Float converterCelsiusParaFahrenheit(Float celsius) {
		Float resultado = null;
		resultado = (float) (celsius * 1.8 + 32);

		return resultado;
	}

	public static Float converterCelsiusParakelvin(Float celsius) {
		Float resultado = null;
		resultado = (float) (celsius + 273.15);

		return resultado;

	}

	public static Float converterKelvinParaFahrenheit(Float kelvin) {
		Float resultado = null;
		resultado = (float) ((kelvin - 273.15) * 1.8 + 32);

		return resultado;
	}

	public static Float converterkelvinParaCelsius(Float kelvin) {
		Float resultado = null;
		resultado = (float) (kelvin - 273.15);

		return resultado;

	}

	public static Float converterFahrenheitParaCelsius(Float fahrenheit) {
		Float resultado = null;
		resultado = (float) ((fahrenheit - 32) / 1.8);

		return resultado;
	}

	public static Float converterFahrenheitParakelvin(Float fahrenheit) {
		Float resultado = null;
		resultado = (float) ((fahrenheit - 32) / 1.8 + 273.15);

		return resultado;
	}

	public static Float converterTemperatura(Float temperatura, TipoTemperatura entrada, TipoTemperatura saida) {
		Float temperaturaSaida = null;

		switch (entrada) {
		case CELSIUS:
			switch (saida) {
			case FAHRENHEIT:
				temperaturaSaida = converterCelsiusParaFahrenheit(temperatura);
				break;
			case KELVIN:
				temperaturaSaida = converterCelsiusParakelvin(temperatura);
				break;
			default:
				break;
			}

			break;
		case KELVIN:
			switch (saida) {
			case FAHRENHEIT:
				temperaturaSaida = converterKelvinParaFahrenheit(temperatura);
				break;
			case CELSIUS:
				temperaturaSaida = converterkelvinParaCelsius(temperatura);
				break;
			default:
				break;
			}
			
		case FAHRENHEIT:
			switch (saida) {
			case CELSIUS:
				temperaturaSaida = converterFahrenheitParaCelsius(temperatura);
				break;
			case KELVIN:
				temperaturaSaida = converterFahrenheitParakelvin(temperatura);
				break;
				
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
