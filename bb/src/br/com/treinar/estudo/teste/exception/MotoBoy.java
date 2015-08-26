package br.com.treinar.estudo.teste.exception;

public class MotoBoy {

	public void pagarConta() throws BancoFechadoException {
		
		System.out.println();
		
		if ("bancofechado".equalsIgnoreCase("bancofechado")) {
			BancoFechadoException ex = new BancoFechadoException();
			ex.setMotivo("Fiquei agarrado no transito e o banco fechou");
			throw ex;
		}
		System.out.println("pagando a conta");
	}
	
}
