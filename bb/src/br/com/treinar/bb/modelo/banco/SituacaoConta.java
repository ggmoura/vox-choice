package br.com.treinar.bb.modelo.banco;

public enum SituacaoConta {

	ATIVA("Ativa"), 
	INATIVA("Inativa"), 
	CANCELADA("Cancelada");

	private String descricao;

	private SituacaoConta(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {
		return descricao;
	}
	
}
