package br.com.agenda.aplicacao;

import java.util.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class Main {

	public static void main(String[] args) {
		ContatoDAO contatoDao = new ContatoDAO();

		Contato contato = new Contato();
		contato.setNome("Joao gabriel");
		contato.setIdade(44);
		contato.setDataCadastro(new Date());

		contatoDao.save(contato);

		// Atualizar o contato
		Contato c1 = new Contato();
		c1.setNome("Joao gabriel Silva");
		c1.setIdade(45);
		c1.setDataCadastro(new Date());
		c1.setId(8); // é o ID do banco de dados

		contatoDao.update(c1);

		// deletar o contato pelo ID
		contatoDao.deleteByID(1);
		// vizualização dos registros do banco de dados (TODOS)

		for (Contato c : contatoDao.getContatos()) {
			System.out.println("Contatos: " + c.getNome());
		}

	}

}
