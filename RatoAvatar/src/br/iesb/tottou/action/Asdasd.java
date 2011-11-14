package br.iesb.tottou.action;

import java.util.Random;
import java.util.Scanner;

import br.iesb.tottou.engine.brain.Interpretador;

public class Asdasd {
	
	public static void main(String[] args) {
//		Random random = new Random();
//		for (int i = 0; i < 100; i++) {
//			System.out.println(random.nextInt(20));
//		}
//		Interpretador lulz = new Interpretador();
//		System.out.println(lulz.interpretar(3, 0.1));
//		System.out.println(lulz.interpretar(1, 0.6));
//		System.out.println(lulz.interpretar(2, 0.4));
//		System.out.println(lulz.interpretar(4, 0.1));
//		System.out.println(lulz.interpretar(1, 1));
		
		CaixaDeSkinner cs = new CaixaDeSkinner();
		cs.action();
		Scanner scan = new Scanner(System.in); 
		for (int i = 0; i < 100; i++) {
			
		
        System.out.println("reforçar? s-n");  
        String nome = scan.next();  
        if ( nome.equals("s")) {
        	cs.experimento.setAgua(true);
        	cs.action();
           	System.out.println("lim1 : "+cs.frequencia.getLimite1()+" lim2: "+cs.frequencia.getLimite2()+" lim3: "+cs.frequencia.getLimite3()+" lim4: "+cs.frequencia.getLimite4());
           	System.out.println("bar : "+cs.experimento.getRespostaBarra()+ " beb : "+cs.experimento.getRespostaBebedouro()+" caix: "+cs.experimento.getRespostaCaixa()+" rat : "+cs.experimento.getRespostaRato());
        } else if (nome.equals("n")) {
        	cs.action();
        	System.out.println("lim1 : "+cs.frequencia.getLimite1()+" lim2: "+cs.frequencia.getLimite2()+" lim3: "+cs.frequencia.getLimite3()+" lim4: "+cs.frequencia.getLimite4());
        	System.out.println("bar : "+cs.experimento.getRespostaBarra()+ " beb : "+cs.experimento.getRespostaBebedouro()+" caix: "+cs.experimento.getRespostaCaixa()+" rat : "+cs.experimento.getRespostaRato());
        } else if (nome.equals("break")) {
        	break;
        } else {
        	
        System.out.println("caractere invalido -> " + nome); }
		}
			
		
	
		
	
		
		
		
		
	}

}
