package br.com.treinar.estudo.teste.jdbc;

import java.util.Calendar;

import br.com.treinar.estudo.teste.jdbc.dao.ContatoDAO;
import br.com.treinar.estudo.teste.jdbc.modelo.Contato;

public class CriaContato {

	public static void main(String[] args) {
		// pronto para gravar
		Contato contato = new Contato();
		contato.setNome("Roger");
		contato.setEmail("roger@gmail.com.br");
		contato.setEndereco("R. Vergueiro 3185 cj87");
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, 5);
		calendar.set(Calendar.MONTH, 10);
		calendar.set(Calendar.YEAR, 2000);
		contato.setDataNascimento(calendar.getTime());

		// grave nessa conexão!!!
		ContatoDAO bd = new ContatoDAO();

		// método elegante
		bd.adicionar(contato);

		System.out.println("Gravado!");
	}

}
