package br.com.treinar.estudo.atividade.bruno.metodo.heranca;


public class Cadastro {
	public static void main(String[] args) {
		Esportivo ep = new Esportivo();
		ep.modelo = "Estilo";
		ep.cor = "Preto";
		ep.rodas = "Aero 20";
		ep.combustivelMotor = 3;
		ep.tetoSolar = false;

		Compacto cm = new Compacto();
		cm.modelo = "Novo Uno";
		cm.cor = "Verde limao";
		cm.rodas = "Aero 18";
		cm.combustivelMotor = 1;

		SedaMedio sm = new SedaMedio();
		sm.modelo = "Linea";
		sm.cor = "Branco";
		sm.rodas = "Aero 22";
		sm.combustivelMotor = 1;
		sm.tetoSolar = true;

		Carro c = new Carro();
		c.modelo = "Novo Uno";
		c.cor = "Verde limao";
		c.rodas = "Aero 18";
		c.combustivelMotor = 1;

	}
}
