package br.iesb.tottou.engine.brain;

import org.neuroph.core.learning.SupervisedTrainingElement;
import org.neuroph.core.learning.TrainingSet;


public class TreinoEmocional {
	
	public TrainingSet getRegras() {		
		//Sede	Muita sede	Tempo demais	-> Stress	Desinteresse
		TrainingSet trainingSet = new TrainingSet(3,2);
        trainingSet.addElement(new SupervisedTrainingElement(new double[]{0, 0, 0}, new double[]{0, 1}));
        trainingSet.addElement(new SupervisedTrainingElement(new double[]{1, 0, 0}, new double[]{0, 0}));
        trainingSet.addElement(new SupervisedTrainingElement(new double[]{0, 1, 0}, new double[]{1, 0}));
        trainingSet.addElement(new SupervisedTrainingElement(new double[]{1, 0, 1}, new double[]{1, 0}));
        trainingSet.addElement(new SupervisedTrainingElement(new double[]{0, 1, 1}, new double[]{1, 0}));
        trainingSet.addElement(new SupervisedTrainingElement(new double[]{0, 0, 1}, new double[]{0, 1}));
        return trainingSet;       
      
	
		}
	
	
	
	
	
	
	

}
