package br.iesb.tottou.data;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.Transaction;

import br.iesb.tottou.model.Aluno;

public class AlunoDAO {

	public static void salvarAluno(Aluno aluno) {

		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction t = sessao.beginTransaction();
		sessao.save(aluno); 
		t.commit();
		sessao.close();
	}
	
	public static void atualizarAluno(Aluno aluno) {

		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction t = sessao.beginTransaction();
		sessao.update(aluno); 
		t.commit();
		sessao.close();
	}


	@SuppressWarnings("unchecked")
	public static boolean seLoginIgualSenha(String login, String senha) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction t = sessao.beginTransaction();
		List<Aluno> alunos = sessao.createQuery("from Aluno").list();

		for (Aluno aluno : alunos) {
			if ((aluno.getLogin().equals(login))
					&& (aluno.getSenha().equals(senha))) {
				t.commit();
				sessao.close();
				return true;

			}

		}

		t.commit();
		sessao.close();
		return false;

	}
	
	@SuppressWarnings("unchecked")
	public static boolean seLoginUnico (String login) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction t = sessao.beginTransaction();		
		List<Aluno> alunos = sessao.createQuery("from Aluno").list();

		for (Aluno aluno : alunos) {
			if (aluno.getLogin().equals(login))
					 {
				t.commit();
				sessao.close();
				return true;

			}

		}

		t.commit();
		sessao.close();
		return false;
		
	}
	
	
	@SuppressWarnings("unchecked")
	public static Aluno buscarAluno (String login) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction t = sessao.beginTransaction();		
		List<Aluno> alunos = sessao.createQuery("from Aluno").list();

		for (Aluno aluno : alunos) {
			if (aluno.getLogin().equals(login))
					 {
				t.commit();
				sessao.close();
				return aluno;

			}

		}

		t.commit();
		sessao.close();
		return null;
		
	}
	
	
	
	
	

}