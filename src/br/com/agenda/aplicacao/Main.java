package br.com.agenda.aplicacao;

import java.util.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class Main {

	public static void main(String[] args) {
		ContatoDAO contatoDao = new ContatoDAO();

		Contato contato = new Contato();
		contato.setNome("Lider");
		contato.setIdade(44);
		contato.setDataCadastro(new Date());

		contatoDao.save(contato);
		
		Contato contato2 = new Contato();
		contato2.setNome("rocha");
		contato2.setIdade(56);
		contato2.setDataCadastro(new Date());

		contatoDao.save(contato2);
		
		//vizualização dos registros do banco de dados (TODOS)
		
		for (Contato c : contatoDao.getContatos()) {
			System.out.println("Contatos: " + c.getNome());
		}
		
	}

}
