package br.com.treinar.estudo.atividade.fagner.metodo.conversor;

public class Unidades {

	public static void escolherUnidades(TipoUnidade entrada) {
		
		switch (entrada) {
		case TEMPERATURA:
			TelaConversor.temperatura();
			break;
		case FORCA:
			TelaConversor.forca();
			break;
		case PRESSAO:
			TelaConversor.pressao();
			break;
		case ENERGIA:
			TelaConversor.energia();
			break;

		default:
			break;
		}

	}

}
