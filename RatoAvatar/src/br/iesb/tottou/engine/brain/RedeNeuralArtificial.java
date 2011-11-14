package br.iesb.tottou.engine.brain;

import org.neuroph.core.learning.TrainingSet;
import org.neuroph.nnet.MultiLayerPerceptron;
import org.neuroph.nnet.learning.DynamicBackPropagation;
import org.neuroph.util.TransferFunctionType;

public class RedeNeuralArtificial {
	
	private final MultiLayerPerceptron mlp;
	private final DynamicBackPropagation regra;
	private final TrainingSet treino;
	
	
	public RedeNeuralArtificial (int entrada, int intermediario, int saida, TrainingSet trainingSet) {
		
		this.mlp = new MultiLayerPerceptron(TransferFunctionType.TANH, entrada, intermediario, saida);		
		this.regra = new DynamicBackPropagation();
		this.treino = trainingSet;
		
		this.regra.setNeuralNetwork(this.mlp);
		this.mlp.setLearningRule(this.regra);
	}
	
	
	


	public MultiLayerPerceptron getMlp() {
		return mlp;
	}


	public DynamicBackPropagation getRegra() {
		return regra;
	}



	public TrainingSet getTreino() {
		return treino;
	}

	
	
	

}
