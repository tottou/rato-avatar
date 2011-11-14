package br.iesb.tottou.action;

import java.util.List;

import br.iesb.tottou.data.AlunoDAO;
import br.iesb.tottou.data.RatoDAO;
import br.iesb.tottou.model.Aluno;
import br.iesb.tottou.model.Rato;
import br.iesb.tottou.model.Resultado;


public class Lab {

	public static void criarRato(String nomeAluno, String nomeRato) {

		Aluno aluno = new Aluno();
		Rato rato = new Rato();
		aluno = AlunoDAO.buscarAluno(nomeAluno);
		rato.setNome(nomeRato);				
		aluno.addRato(rato);
		AlunoDAO.atualizarAluno(aluno);

	}
	
	public static void criarResultado(String nomeAluno, String nomeRato, Resultado resultado) {
		Aluno aluno = new Aluno();		
		aluno = AlunoDAO.buscarAluno(nomeAluno);
		List<Rato> ratos = aluno.getRatos();
		for (Rato rat : ratos) {
			if (rat.getNome().equals(nomeRato)) {
				rat.addResultado(resultado);
				RatoDAO.atualizarRato(rat);
			}
		}
		
	}

	public static boolean seRatoUnico(String nomeAluno, String nomeRato ) {
		Aluno aluno = new Aluno();		
		aluno = AlunoDAO.buscarAluno(nomeAluno);
		List<Rato> lista = aluno.getRatos();
		
		if (lista != null)
		{
			for (Rato rato : lista) {
				if (rato.getNome().equalsIgnoreCase(nomeRato)){
					return false;
				}
			}
		}
		
		
		return true;

	}
	
	public static List<String> ratosALuno (String login) {
		List<String> lista = RatoDAO.recuperaRatos(login);		
		return lista;
		
	}

}
