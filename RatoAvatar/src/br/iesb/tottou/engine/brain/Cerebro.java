package br.iesb.tottou.engine.brain;

import java.util.Vector;

import org.neuroph.core.learning.TrainingSet;

public class Cerebro {

	TrainingSet treinoE = new TreinoEmocional().getRegras();
	RedeNeuralArtificial rnaE = new RedeNeuralArtificial(3, 5, 2, treinoE);

	TrainingSet treinoC = new TreinoComportamento().getRegras();
	RedeNeuralArtificial rnaC1 = new RedeNeuralArtificial(3, 5, 1, treinoC); //barra
	
	RedeNeuralArtificial rnaC2 = new RedeNeuralArtificial(3, 5, 1, treinoC); //bebedouro

	RedeNeuralArtificial rnaC3 = new RedeNeuralArtificial(3, 5, 1, treinoC); //geral	
	
	RedeNeuralArtificial rnaC4 = new RedeNeuralArtificial(3, 5, 1, treinoC); //rato
	
	

	public Vector<Double> respostaE(double[] entrada) {
		return Controle.fazerUmaIteracao(rnaE, entrada);
	}

	public Vector<Double> respostaC1(double[] entrada) {
		return Controle.fazerUmaIteracao(rnaC1, entrada);
	}
	
	public Vector<Double> respostaC2(double[] entrada) {
		return Controle.fazerUmaIteracao(rnaC2, entrada);
	}
	
	public Vector<Double> respostaC3(double[] entrada) {
		return Controle.fazerUmaIteracao(rnaC3, entrada);
	}
	
	public Vector<Double> respostaC4(double[] entrada) {
		return Controle.fazerUmaIteracao(rnaC4, entrada);
	}
	
	
	public void setTaxaAprendizadoE (double taxa) {
		rnaE.getRegra().setLearningRate(taxa);
		
	}
	
	public void setTaxaAprendizadoC1 (double taxa) {
		rnaC1.getRegra().setLearningRate(taxa);
		
	}
	
	public void setTaxaAprendizadoC2 (double taxa) {
		rnaC2.getRegra().setLearningRate(taxa);
		
	}
	public void setTaxaAprendizadoC3 (double taxa) {
		rnaC3.getRegra().setLearningRate(taxa);
		
	}
	public void setTaxaAprendizadoC4 (double taxa) {
		rnaC4.getRegra().setLearningRate(taxa);
		
	}

}