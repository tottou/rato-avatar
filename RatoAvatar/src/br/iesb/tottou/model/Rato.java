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
	
	@Column
	private int Limite1=0;
	
	@Column
	private int Limite2=1;
	
	@Column
	private int Limite3=2;
	
	@Column
	private int Limite4=3;
	
	
	
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

	public int getLimite1() {
		return Limite1;
	}

	public void setLimite1(int limite1) {
		Limite1 = limite1;
	}

	public int getLimite2() {
		return Limite2;
	}

	public void setLimite2(int limite2) {
		Limite2 = limite2;
	}

	public int getLimite3() {
		return Limite3;
	}

	public void setLimite3(int limite3) {
		Limite3 = limite3;
	}

	public int getLimite4() {
		return Limite4;
	}

	public void setLimite4(int limite4) {
		Limite4 = limite4;
	}

	

	
}
