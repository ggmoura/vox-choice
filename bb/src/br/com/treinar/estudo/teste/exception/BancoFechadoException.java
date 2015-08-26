package br.com.treinar.estudo.teste.exception;

public class BancoFechadoException extends Exception {

	private static final long serialVersionUID = 1L;

	private String motivo;

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

}
