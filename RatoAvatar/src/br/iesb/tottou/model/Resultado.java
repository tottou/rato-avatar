package br.iesb.tottou.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="RESULTADO")
public class Resultado {
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	private int Id;
	
	@Column
	private String nome;
	
	@ManyToOne
	@JoinColumn(name="rato_fk")
	private Rato rato;
	
	@Column
	private  int reforcos;
	
	@Column
	private  int umUm;
	@Column
	private  int umDois; 
	@Column
	private  int umTres; 
	@Column
	private  int umQuatro; 
	@Column
	private  int umCinco; 
	
	@Column
	private  int doisUm; 
	@Column
	private  int doisDois;
	@Column
	private  int doisTres; 
	@Column
	private  int doisQuatro; 
	@Column
	private  int doisCinco; 
	
	@Column
	private  int tresUm; 
	@Column
	private  int tresDois; 
	@Column
	private  int tresTres;
	@Column
	private  int tresQuatro;
	@Column
	private  int tresCinco; 
	
	@Column
	private  int quatroUm; 
	@Column
	private  int quatroDois;
	@Column
	private  int quatroTres;
	@Column
	private  int quatroQuatro;
	@Column
	private  int quatroCinco;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getUmUm() {
		return umUm;
	}
	public void setUmUm(int umUm) {
		this.umUm = umUm;
	}
	public int getUmDois() {
		return umDois;
	}
	public void setUmDois(int umDois) {
		this.umDois = umDois;
	}
	public int getUmTres() {
		return umTres;
	}
	public void setUmTres(int umTres) {
		this.umTres = umTres;
	}
	public int getUmQuatro() {
		return umQuatro;
	}
	public void setUmQuatro(int umQuatro) {
		this.umQuatro = umQuatro;
	}
	public int getUmCinco() {
		return umCinco;
	}
	public void setUmCinco(int umCinco) {
		this.umCinco = umCinco;
	}
	public int getDoisUm() {
		return doisUm;
	}
	public void setDoisUm(int doisUm) {
		this.doisUm = doisUm;
	}
	public int getDoisDois() {
		return doisDois;
	}
	public void setDoisDois(int doisDois) {
		this.doisDois = doisDois;
	}
	public int getDoisTres() {
		return doisTres;
	}
	public void setDoisTres(int doisTres) {
		this.doisTres = doisTres;
	}
	public int getDoisQuatro() {
		return doisQuatro;
	}
	public void setDoisQuatro(int doisQuatro) {
		this.doisQuatro = doisQuatro;
	}
	public int getDoisCinco() {
		return doisCinco;
	}
	public void setDoisCinco(int doisCinco) {
		this.doisCinco = doisCinco;
	}
	public int getTresUm() {
		return tresUm;
	}
	public void setTresUm(int tresUm) {
		this.tresUm = tresUm;
	}
	public int getTresDois() {
		return tresDois;
	}
	public void setTresDois(int tresDois) {
		this.tresDois = tresDois;
	}
	public int getTresTres() {
		return tresTres;
	}
	public void setTresTres(int tresTres) {
		this.tresTres = tresTres;
	}
	public int getTresQuatro() {
		return tresQuatro;
	}
	public void setTresQuatro(int tresQuatro) {
		this.tresQuatro = tresQuatro;
	}
	public int getTresCinco() {
		return tresCinco;
	}
	public void setTresCinco(int tresCinco) {
		this.tresCinco = tresCinco;
	}
	public int getQuatroUm() {
		return quatroUm;
	}
	public void setQuatroUm(int quatroUm) {
		this.quatroUm = quatroUm;
	}
	public int getQuatroDois() {
		return quatroDois;
	}
	public void setQuatroDois(int quatroDois) {
		this.quatroDois = quatroDois;
	}
	public int getQuatroTres() {
		return quatroTres;
	}
	public void setQuatroTres(int quatroTres) {
		this.quatroTres = quatroTres;
	}
	public int getQuatroQuatro() {
		return quatroQuatro;
	}
	public void setQuatroQuatro(int quatroQuatro) {
		this.quatroQuatro = quatroQuatro;
	}
	public int getQuatroCinco() {
		return quatroCinco;
	}
	public void setQuatroCinco(int quatroCinco) {
		this.quatroCinco = quatroCinco;
	}
	public Rato getRato() {
		return rato;
	}
	public void setRato(Rato rato) {
		this.rato = rato;
	}
	public void setReforcos(int reforcos) {
		this.reforcos = reforcos;
	}
	public int getReforcos() {
		return reforcos;
	}
	
	
	

}
