package br.com.treinar.estudo.teste.exception;

public class Secretaria {

	
	public void mandarSecretariaPagarConta() {
		
		MotoBoy boy = new MotoBoy();
		
		try {
			boy.pagarConta();
		} catch (BancoFechadoException e) {
			//pagou pela internet
			System.out.println("conta nao foi paga motivo: " + e.getMotivo());;
		}
		
		System.out.println("mandar motoboy pagar conta");
	}
	
}
