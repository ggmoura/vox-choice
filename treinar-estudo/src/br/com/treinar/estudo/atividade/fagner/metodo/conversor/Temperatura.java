package br.com.treinar.estudo.atividade.fagner.metodo.conversor;

public class Temperatura {

	private Double celsius;
	private Double kelvin;
	private Double fahrenheit;

	public Double getCelsius() {
		return celsius;
	}

	public void setCelsius(Double celsius) {
		this.celsius = celsius;
	}

	public Double getKelvin() {
		return kelvin;
	}

	public void setKelvin(Double kelvin) {
		this.kelvin = kelvin;
	}

	public Double getFahrenheit() {
		return fahrenheit;
	}

	public void setFahrenheit(Double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}

	public Double converterCelsiusParaFahrenheit() {
		Double resultado = null;
		if (celsius != null) {
			resultado = celsius * 1.8 + 32;
		}
		return resultado;
	}
	
	public Double converterTemperatura(Double temperatura, TipoTemperatura entrada, TipoTemperatura saida) {
		
		switch (entrada) {
		case CELSIUS:
			
			break;
		case KELVIN:
			
			break;
		case FAHRENHEIT:
			
			break;

		default:
			break;
		}
		
		return celsius;
		
	}
	
}
