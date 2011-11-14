package br.iesb.tottou.engine.time;

import br.iesb.tottou.model.Resultado;

public class Frequenciador {
	
		
	
	public static void add(Resultado resultado, int tipo, double level) {
		
		switch (tipo) {
		case 1:
			if (level < 0.2) {
				 resultado.setUmUm(resultado.getUmUm()+1);
			} else if ((level > 0.2) && (level < 0.4)) {
				 resultado.setUmDois(resultado.getUmDois()+1);
			} else if ((level > 0.4) && (level < 0.6)) {
				 resultado.setUmTres(resultado.getUmTres()+1);
			} else if ((level > 0.6) && (level < 0.8)) {
				 resultado.setUmQuatro(resultado.getUmQuatro()+1);
			} else {
				 resultado.setUmCinco(resultado.getUmCinco()+1);
			}

		case 2:
			if (level < 0.2) {
				 resultado.setDoisUm(resultado.getDoisUm()+1);
			} else if ((level > 0.2) && (level < 0.4)) {
				 resultado.setDoisDois(resultado.getDoisDois()+1);
			} else if ((level > 0.4) && (level < 0.6)) {
				 resultado.setDoisTres(resultado.getDoisTres()+1);
			} else if ((level > 0.6) && (level < 0.8)) {
				 resultado.setDoisQuatro(resultado.getDoisQuatro()+1);
			} else {
				 resultado.setDoisCinco(resultado.getDoisCinco()+1);
			}

		case 3:
			if (level < 0.2) {
				 resultado.setTresUm(resultado.getTresUm()+1);
			} else if ((level > 0.2) && (level < 0.4)) {
				 resultado.setTresDois(resultado.getTresDois()+1);
			} else if ((level > 0.4) && (level < 0.6)) {
				 resultado.setTresTres(resultado.getTresTres()+1);
			} else if ((level > 0.6) && (level < 0.8)) {
				 resultado.setTresQuatro(resultado.getTresQuatro()+1);
			} else {
				 resultado.setTresCinco(resultado.getTresCinco()+1);
			}

		case 4:
			if (level < 0.2) {
				 resultado.setQuatroUm(resultado.getQuatroUm()+1);
			} else if ((level > 0.2) && (level < 0.4)) {
				 resultado.setQuatroDois(resultado.getQuatroDois()+1);
			} else if ((level > 0.4) && (level < 0.6)) {
				 resultado.setQuatroTres(resultado.getQuatroTres()+1);
			} else if ((level > 0.6) && (level < 0.8)) {
				 resultado.setQuatroQuatro(resultado.getQuatroQuatro()+1);
			} else {
				 resultado.setQuatroCinco(resultado.getQuatroCinco()+1);
			}

		}
		 
	}

	
}
