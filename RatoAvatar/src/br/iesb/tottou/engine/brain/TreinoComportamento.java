package br.iesb.tottou.engine.brain;

import org.neuroph.core.learning.SupervisedTrainingElement;
import org.neuroph.core.learning.TrainingSet;

public class TreinoComportamento {

	public TrainingSet getRegras() {
		// Água(se já bebeu agua) Stress Desinteresse  -> Resposta reforçada
		TrainingSet trainingSet = new TrainingSet(3,1);
		trainingSet.addElement(new SupervisedTrainingElement(new double[] { 0, 0, 0 }, new double[] { 0 }));
		trainingSet.addElement(new SupervisedTrainingElement(new double[] { 0, 0, 1 }, new double[] { 0 }));
		trainingSet.addElement(new SupervisedTrainingElement(new double[] { 0, 1, 0 }, new double[] { 0 }));
		trainingSet.addElement(new SupervisedTrainingElement(new double[] { 0, 1, 1 }, new double[] { 0 }));
		trainingSet.addElement(new SupervisedTrainingElement(new double[] { 1, 0, 0 }, new double[] { 1 }));
		trainingSet.addElement(new SupervisedTrainingElement(new double[] { 1, 0, 1 }, new double[] { 0 }));
		trainingSet.addElement(new SupervisedTrainingElement(new double[] { 1, 1, 0 }, new double[] { 1 }));
		trainingSet.addElement(new SupervisedTrainingElement(new double[] { 1, 1, 1 }, new double[] { 0 }));
		return trainingSet;

	}

}
