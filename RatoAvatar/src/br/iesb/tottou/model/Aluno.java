package br.iesb.tottou.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table (name="ALUNO")
public class Aluno {
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	private int Id;
	
	@Column(name="LOGIN")
	private String Login;
	
	@Column(name="SENHA", nullable=false)
	private String Senha;
	
	@Column(name="NOME", nullable=false)
	private String Nome;
	
	@Column(name="MATRICULA", nullable=false)
	private String Matricula;
	
	
	@OneToMany(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="aluno_fk")
	private List<Rato> Ratos = new ArrayList<Rato>();
	
	

	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	

	public String getSenha() {
		return Senha;
	}
	public void setSenha(String senha) {
		Senha = senha;
	}
	

	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public String getMatricula() {
		return Matricula;
	}
	public void setMatricula(String matricula) {
		Matricula = matricula;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public List<Rato> getRatos() {
		return Ratos;
	}
	public void setRatos(List<Rato> ratos) {
		this.Ratos = ratos;
	}
	
	public void addRato (Rato rato) {
		Ratos.add(rato);
	}
	public void inicializar() {
	for (Rato rato : Ratos) {
		rato.inicializar();
	}
		
	}

}
