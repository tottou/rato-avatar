package br.iesb.tottou.model;

public class Experimento {

	private boolean Agua;
	private boolean luz;
	private boolean auto;
	private boolean aprendendo;
	
	private double seAgua;	
	private double sede;
	private double muitaSede;
	private double tempoDemais;
	private double stress;
	private double desinteresse;
	private double respostaBarra;
	private double respostaBebedouro;
	private double respostaCaixa;
	private double respostaRato;
	

	private int tipoRespostaReforcada;
	private int ultimaTipoRespostaReforcada;
	

	public Experimento () {
		setSeAgua(0);
		setLuz(false);
		setAuto(false);
		setAgua(false);
		setSede(1);
		setMuitaSede(0);
		setTempoDemais(0);
		setStress(0);
		setDesinteresse(0);				
		setTipoRespostaReforcada(1);
		setUltimaTipoRespostaReforcada(1);
		setAprendendo(false);
		setRespostaBarra(0);
		setRespostaBebedouro(0);
		setRespostaCaixa(0);
		setRespostaRato(0);
		
		
	}
	public double getSede() {
		return sede;
	}

	public void setSede(double sede) {
		this.sede = sede;
	}

	public double getMuitaSede() {
		return muitaSede;
	}

	public void setMuitaSede(double muitaSede) {
		this.muitaSede = muitaSede;
	}

	public double getTempoDemais() {
		return tempoDemais;
	}

	public void setTempoDemais(double tempoDemais) {
		this.tempoDemais = tempoDemais;
	}

	public double getStress() {
		return stress;
	}

	public void setStress(double stress) {
		this.stress = stress;
	}

	public double getDesinteresse() {
		return desinteresse;
	}

	public void setDesinteresse(double desinteresse) {
		this.desinteresse = desinteresse;
	}



	public double getRespostaBarra() {
		return respostaBarra;
	}
	public void setRespostaBarra(double respostaBarra) {
		this.respostaBarra = respostaBarra;
	}
	public double getRespostaBebedouro() {
		return respostaBebedouro;
	}
	public void setRespostaBebedouro(double respostaBebedouro) {
		this.respostaBebedouro = respostaBebedouro;
	}
	public double getRespostaCaixa() {
		return respostaCaixa;
	}
	public void setRespostaCaixa(double respostaCaixa) {
		this.respostaCaixa = respostaCaixa;
	}
	public double getRespostaRato() {
		return respostaRato;
	}
	public void setRespostaRato(double respostaRato) {
		this.respostaRato = respostaRato;
	}
	public int getTipoRespostaReforcada() {
		return tipoRespostaReforcada;
	}

	public void setTipoRespostaReforcada(int tipoRespostaReforcada) {
		this.tipoRespostaReforcada = tipoRespostaReforcada;
	}




	public boolean isLuz() {
		return luz;
	}
	public void setLuz(boolean luz) {
		this.luz = luz;
	}
	public boolean isAuto() {
		return auto;
	}

	public void setAuto(boolean auto) {
		this.auto = auto;
	}
	public int getUltimaTipoRespostaReforcada() {
		return ultimaTipoRespostaReforcada;
	}
	public void setUltimaTipoRespostaReforcada(int ultimaTipoRespostaReforcada) {
		this.ultimaTipoRespostaReforcada = ultimaTipoRespostaReforcada;
	}
	public boolean isAprendendo() {
		return aprendendo;
	}
	public void setAprendendo(boolean aprendendo) {
		this.aprendendo = aprendendo;
	}
	public boolean isAgua() {
		return Agua;
	}
	public void setAgua(boolean agua) {
		Agua = agua;
	}
	public double getSeAgua() {
		return seAgua;
	}
	public void setSeAgua(double seAgua) {
		this.seAgua = seAgua;
	}



}
