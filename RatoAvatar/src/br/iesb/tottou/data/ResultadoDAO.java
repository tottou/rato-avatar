package br.iesb.tottou.data;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.iesb.tottou.model.Aluno;
import br.iesb.tottou.model.Rato;
import br.iesb.tottou.model.Resultado;

public class ResultadoDAO {
	
	public static void salvarResultado(Resultado resultado) {		

		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction t = sessao.beginTransaction();
		sessao.save(resultado);
		t.commit();
		sessao.close();
	}


	
	public static List<String> recuperaExperimentos(String login, String nomeRato) {			
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
