package br.iesb.tottou.action;

import br.iesb.tottou.data.AlunoDAO;
import br.iesb.tottou.model.Aluno;

public class Cadastro {
	
	
	
	
	public Cadastro() {
		// TODO Auto-generated constructor stub
	}
	
	public static void preenche (String login, String senha, String matr, String nome) {
		
		Aluno aluno = new Aluno(); 
		
		aluno.setLogin(login);
		aluno.setSenha(senha);
		aluno.setMatricula(matr);
		aluno.setNome(nome);
		
		
		AlunoDAO.salvarAluno(aluno);
	}
	      
	
	
    
	
	
	
	

}
