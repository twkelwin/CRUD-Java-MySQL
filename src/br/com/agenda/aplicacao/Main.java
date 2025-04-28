package br.com.agenda.aplicacao;

import java.util.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class Main {

	public static void main(String[] args) {
		ContatoDAO contatoDao = new ContatoDAO();

		Contato contato = new Contato();
		contato.setNome("Kelwin Eduardo");
		contato.setIdade(17);
		contato.setDataCadastro(new Date());

		contatoDao.save(contato);
		
		Contato contato2 = new Contato();
		contato2.setNome("Cleber Silva");
		contato2.setIdade(34);
		contato2.setDataCadastro(new Date());

		contatoDao.save(contato2);
	}

}
