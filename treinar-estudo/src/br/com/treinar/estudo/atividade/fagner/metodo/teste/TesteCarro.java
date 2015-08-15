package br.com.treinar.estudo.atividade.fagner.metodo.teste;

import br.com.treinar.estudo.atividade.fagner.metodo.CarroPasseio;
import br.com.treinar.estudo.atividade.fagner.metodo.CarroSport;
import br.com.treinar.estudo.atividade.fagner.metodo.Carro;


public class TesteCarro {
	
	public static void main(String[] args) {
		
		CarroSport s = new CarroSport();
		s.modelo = "Gol S ";
		s.cor = "Amarelo";
		s.motor = 1.8f;
		s.tipoDePneu = "Liso.";
		s.turbo = true;
		
		
		
		CarroPasseio p = new CarroPasseio();
		p.modelo = "Palio";
		p.cor = "Prata";
		p.motor = 1.0f;
		p.arCondicionado = true;
		p.polRodas = 13;
		
		Carro c = new CarroSport();
		System.out.println(c);
		
		
		
		
		
		
		
		
	}

}
