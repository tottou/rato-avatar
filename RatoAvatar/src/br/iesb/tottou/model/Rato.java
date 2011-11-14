package br.iesb.tottou.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table (name="RATO")
public class Rato {

	
	@Id
	@GeneratedValue
	@Column(name="ID")
	private int Id;
	
	@ManyToOne
	@JoinColumn(name="aluno_fk")
	private Aluno aluno;

	
	@Column(name="NOME", nullable=false)
	private String Nome;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="rato_fk")
	private List<Resultado> Resultados = new ArrayList<Resultado>();
	


	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}


	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public List<Resultado> getResultados() {
		return Resultados;
	}

	public void setResultados(List<Resultado> resultados) {
		Resultados = resultados;
	}
	public void addResultado (Resultado resultado) {
		Resultados.add(resultado);
	}

	

	
}
