package br.com.treinar.estudo.atividade.fagner.metodo.conversor;

public class Energia {

	private Float joules;
	private Float btu;
	private Float calorias;

	public Float getJoules() {
		return joules;
	}

	public void setJoules(Float joules) {
		this.joules = joules;
	}

	public Float getBtu() {
		return btu;
	}

	public void setBtu(Float btu) {
		this.btu = btu;
	}

	public Float getCalorias() {
		return calorias;
	}

	public void setCalorias(Float calorias) {
		this.calorias = calorias;
	}
	
	public Float ConverterJoulesParaBtu() {
		Float resultado = null;
		resultado = joules * 0.00094781712f;
		return resultado;
	}
	public Float ConverterJoulesParaCalorias() {
		Float resultado = null;
		resultado = joules *0.00023884f;
		return resultado;
	}
	public Float ConverterBtuParaJoules() {
		Float resultado = null;
		resultado = btu * 1055.056f;
		return resultado;
	}
	public Float ConverterBtuParaCalorias() {
		Float resultado = null;
		resultado = btu * 0.2522f;
		return resultado;
	}
	public Float ConverterCaloriasParaJoules() {
		Float resultado = null;
		resultado = calorias * 0.23884f;
		return resultado;
	}
	public Float ConverterCaloriasParaBtu() {
		Float resultado = null;
		resultado = calorias * 0.003970144f;
		return resultado;
	}
	

}
