package br.com.treinar.estudo.atividade.fagner.metodo.conversor;

public class Temperatura {

	private Float celsius;
	private Float kelvin;
	private Float fahrenheit;

	public Float getCelsius() {
		return celsius;
	}

	public void setCelsius(Float celsius) {
		this.celsius = celsius;
	}

	public Float getKelvin() {
		return kelvin;
	}

	public void setKelvin(Float kelvin) {
		this.kelvin = kelvin;
	}

	public Float getFahrenheit() {
		return fahrenheit;
	}

	public void setFahrenheit(Float fahrenheit) {
		this.fahrenheit = fahrenheit;
	}

	public Float converterCelsiusParaFahrenheit() {
		Float resultado = null;
			resultado = (float) (celsius * 1.8 + 32);
	
		return resultado;
	}
	public Float converterCelsiusParakelvin() {
		Float resultado = null;
		resultado = (float) (celsius + 273.15);
		
		return resultado;
	
	}
	
	
	
	public Float converterKelvinParaFahrenheit() {
		Float resultado = null;
		resultado = (float) ((this.kelvin - 273.15) * 1.8 + 32);
		
		return resultado;
	}
	
	public Float converterkelvinParaCelsius() {
		Float resultado = null;
		resultado = (float) (kelvin - 273.15);
		
		return resultado;
		
	}
		
	
	
	
	public Float converterFahrenheitParaCelsius() {
		Float resultado = null;
		resultado = (float) ((fahrenheit - 32) / 1.8) ;
		
		return resultado;
	}
	public Float converterFahrenheitParakelvin() {
		Float resultado = null;
		resultado = (float) ((fahrenheit - 32) / 1.8 + 273.15) ;
		
		return resultado;
	}
	
//	public Double converterTemperatura(Double temperatura, TipoTemperatura entrada, TipoTemperatura saida) {
//		
//		switch (entrada) {
//		case CELSIUS:
//			
//			switch (saida) {
//			case FAHRENHEIT:
//				Double resultado = null;
//				resultado = celsius * 1.8 + 32;
//				
//				return resultado;
//				
//			case KELVIN:
//				Double resultado2 = null;
//				resultado2 = celsius * 1.8 + 32;
//				
//				return resultado2;
//			default:
//				break;
//			
//			}
//			
//			break;
//		case KELVIN:
//			
//			break;
//		case FAHRENHEIT:
//			
//			break;
//
//		default:
//			break;
//		}
//		
//		return celsius;
		
	}
	

