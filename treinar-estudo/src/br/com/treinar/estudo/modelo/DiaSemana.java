package br.com.treinar.estudo.modelo;

public enum DiaSemana {

	DOMINGO("Domingo", 1, Boolean.TRUE),
	SEGUNDA_FEIRA("Segunda Feira", 2, Boolean.FALSE),
	TERCA_FEIRA("Terça Feira", 3, Boolean.FALSE),
	QUARTA_FEIRA("Quarta Feira", 4, Boolean.FALSE),
	QUINTA_FEIRA("Quinta Feira", 5, Boolean.FALSE),
	SEXTA_FEIRA("Sexta Feira", 6, Boolean.FALSE),
	SABADO("Sabado", 7, Boolean.TRUE);
	
	private DiaSemana(String descricao, Integer ordemDia, Boolean ehFolga) {
		this.descricao = descricao;
		this.ordemDia = ordemDia;
		this.ehFolga = ehFolga;
	}
	
	private String descricao;
	
	private Integer ordemDia;
	
	private Boolean ehFolga;
	
	public String getDescricao() {
		return descricao;
	}

	public Integer getOrdemDia() {
		return ordemDia;
	}

	public Boolean getEhFolga() {
		return ehFolga;
	}
	
	@Override
	public String toString() {
		return ordemDia + " " + descricao + " " + (ehFolga ? "Folga" : "Vai ralar filho");
	}
	
	
}
