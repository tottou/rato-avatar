package br.iesb.tottou.engine.brain;

public class Interpretador extends Mapeamento {

	public String interpretar(int tipo, double level) {

		switch (tipo) {
		case 1:
			if (level < 0.2) {
				return getUmUm();
			} else if ((level > 0.2) && (level < 0.4)) {
				return getUmDois();
			} else if ((level > 0.4) && (level < 0.6)) {
				return getUmTres();
			} else if ((level > 0.6) && (level < 0.8)) {
				return getUmQuatro();
			} else {
				return getUmCinco();
			}

		case 2:
			if (level < 0.2) {
				return getDoisUm();
			} else if ((level > 0.2) && (level < 0.4)) {
				return getDoisDois();
			} else if ((level > 0.4) && (level < 0.6)) {
				return getDoisTres();
			} else if ((level > 0.6) && (level < 0.8)) {
				return getDoisQuatro();
			} else {
				return getDoisCinco();
			}

		case 3:
			if (level < 0.2) {
				return getTresUm();
			} else if ((level > 0.2) && (level < 0.4)) {
				return getTresDois();
			} else if ((level > 0.4) && (level < 0.6)) {
				return getTresTres();
			} else if ((level > 0.6) && (level < 0.8)) {
				return getTresQuatro();
			} else {
				return getTresCinco();
			}

		case 4:
			if (level < 0.2) {
				return getQuatroUm();
			} else if ((level > 0.2) && (level < 0.4)) {
				return getQuatroDois();
			} else if ((level > 0.4) && (level < 0.6)) {
				return getQuatroTres();
			} else if ((level > 0.6) && (level < 0.8)) {
				return getQuatroQuatro();
			} else {
				return getQuatroCinco();
			}

		}
		return "erro";
	}

}
