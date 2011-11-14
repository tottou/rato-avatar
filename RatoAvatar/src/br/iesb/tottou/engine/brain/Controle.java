package br.iesb.tottou.engine.brain;

import java.util.Vector;

public class Controle {

	public static Vector<Double> fazerUmaIteracao(RedeNeuralArtificial rna,
			double[] entrada) {

		rna.getRegra().doOneLearningIteration(rna.getTreino());
		rna.getMlp().setInput(entrada);
		rna.getMlp().calculate();	
		return rna.getMlp().getOutput();
	}
	
	public static double[] converter (Vector<Double> saida) {
			int tam = saida.size();
		double[] entrada = new double[tam];
		for (int i = 0; i < tam; i++) {
			entrada[i] = saida.get(i);			
			
		}
		return entrada;
	}

}
