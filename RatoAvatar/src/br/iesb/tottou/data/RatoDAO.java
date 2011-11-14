package br.iesb.tottou.data;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.Transaction;

import br.iesb.tottou.model.Aluno;
import br.iesb.tottou.model.Rato;

public class RatoDAO {

	public static void salvarRato(Rato rato) {		

		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction t = sessao.beginTransaction();
		sessao.save(rato);
		t.commit();
		sessao.close();
	}


	
	public static List<String> recuperaRatos(String login) {			
		List<String> lista = new ArrayList<String>();
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction t = sessao.beginTransaction();
		Aluno aluno = AlunoDAO.buscarAluno(login);

		for (Rato rato : aluno.getRatos()) {
		lista.add(rato.getNome());

		}

		t.commit();
		sessao.close();
		return lista;

	}

}
