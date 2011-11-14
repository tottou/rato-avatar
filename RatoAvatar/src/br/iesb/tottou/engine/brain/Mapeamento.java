package br.iesb.tottou.engine.brain;

public class Mapeamento {
	
	/* tipoLevel 
	 * 
	 * Tipos: 
	 * 1 - Barra de Presão
	 * 2 - Bebedouro
	 * 3 - Caixa de Skinner (Geral)
	 * 4 - Rato Avatar */
	
	private final String umUm = "está farejando a barra de pressão";
	private final String umDois = "está próximo e observando a barra de pressão";
	private final String umTres = "encosta as duas patas na barra de pressão";
	private final String umQuatro = "morde a barra de pressão";
	private final String umCinco = "pressiona a barra de pressão.";
	
	private final String doisUm = "está farejando o bebedouro";
	private final String doisDois = " está lambendo o bebedouro";
	private final String doisTres = "está com o focinho encostado na entrada do bebedouro";
	private final String doisQuatro = "morde o bebedouro";
	private final String doisCinco = "coloca as duas patas dianteiras sobre o bebedouro";
	
	private final String tresUm = "está farejando partes diversas da Caixa de Skinner";
	private final String tresDois = "coloca as patas dianteiras sobre as paredes da Caixa de Skinner";
	private final String tresTres = "coloca as patas dianteiras sobre o auto-falante ";
	private final String tresQuatro = "coloca as patas dianteiras sobre o componente de luz";
	private final String tresCinco = "está farejando partes diversas da Caixa de Skinner";
	
	private final String quatroUm = "esfrega as patas dianteiras no focinho";
	private final String quatroDois = "está lambendo suas patas";
	private final String quatroTres = "girou em torno de si mesmo";
	private final String quatroQuatro = "girou duas vezes em torno de si mesmo";
	private final String quatroCinco = "está parado";
	
	public String getUmUm() {
		return umUm;
	}
	public String getUmDois() {
		return umDois;
	}
	public String getUmTres() {
		return umTres;
	}
	public String getUmQuatro() {
		return umQuatro;
	}
	public String getUmCinco() {
		return umCinco;
	}
	public String getDoisUm() {
		return doisUm;
	}
	public String getDoisDois() {
		return doisDois;
	}
	public String getDoisTres() {
		return doisTres;
	}
	public String getDoisQuatro() {
		return doisQuatro;
	}
	public String getDoisCinco() {
		return doisCinco;
	}
	public String getTresUm() {
		return tresUm;
	}
	public String getTresDois() {
		return tresDois;
	}
	public String getTresTres() {
		return tresTres;
	}
	public String getTresQuatro() {
		return tresQuatro;
	}
	public String getTresCinco() {
		return tresCinco;
	}
	public String getQuatroUm() {
		return quatroUm;
	}
	public String getQuatroDois() {
		return quatroDois;
	}
	public String getQuatroTres() {
		return quatroTres;
	}
	public String getQuatroQuatro() {
		return quatroQuatro;
	}
	public String getQuatroCinco() {
		return quatroCinco;
	}


	
}
