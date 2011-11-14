package br.iesb.tottou.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.iesb.tottou.engine.brain.Cerebro;
import br.iesb.tottou.engine.brain.Controle;
import br.iesb.tottou.engine.brain.Interpretador;
import br.iesb.tottou.engine.time.Frequencia;
import br.iesb.tottou.engine.time.Frequenciador;
import br.iesb.tottou.model.Experimento;
import br.iesb.tottou.model.Resultado;

public class CaixaDeSkinner extends HttpServlet {
	
	 private static final long serialVersionUID = 1L;


	Cerebro brain = new Cerebro();
	Experimento experimento = new Experimento();
	Frequencia frequencia = new Frequencia();
	Interpretador interpretador = new Interpretador();
	Resultado resultado = new Resultado();

	
	public CaixaDeSkinner () {
		super();
	}
	
	 protected void doGet(HttpServletRequest request,
	            HttpServletResponse response) throws ServletException, IOException {
		 experimento.setAgua(true);
		 response.setContentType("text/plain");
	        PrintWriter out = response.getWriter();
	        out.println("Sistema de reforço ativado no bebedouro.");
	        out.flush();
	        out.close();
		 
	    }
	
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
 
    	
        String resposta = action();
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.println("O rato avatar " + resposta + ".");
        out.flush();
        out.close();
    }
	
	

	public String action () { //ação a ser disparada pela camada de apres. (verificar later.
		
		if (verificaAgua()) {
			return "bebeu água no bebedouro";
		} else {
		iterar(); //continua treino e/ou setar novos valores
		
		//experimento.setUltimaTipoRespostaReforcada(experimento.getTipoRespostaReforcada()); //salva ultimo valor da ultima ação
		int tipo = qualTipoComportamento(); // verifica qual chance da ação acionar
		experimento.setTipoRespostaReforcada(tipo); //seta o tipo no experimento
		Double level = qualInterpretar(tipo);
		String respostaFrase = interpretador.interpretar(tipo, level); //imprimir isso	
		Frequenciador.add(resultado, tipo, level);
		
		return respostaFrase; //verificando
		
		}
		
		
	}
	
	public boolean verificaAgua () { //verificar depois na camada de apresenta pra imprimir "bebeu água no bebedouro" e etc
		if (experimento.isAgua()) {
			experimento.setSeAgua(1); //rato tem conhecimento do reforço
			experimento.setAgua(false);
			return true;
		} else
		return false;
			
	}
	
	
	public double qualInterpretar (int num) {
		switch (num) {
		case 1 : return experimento.getRespostaBarra(); 
		case 2 : return experimento.getRespostaBebedouro();
		case 3 : return experimento.getRespostaCaixa();
		case 4 : return experimento.getRespostaRato();
		}
		 return 0;
	}
	
	
	
	
	public void iterar() {
		if ((experimento.getTipoRespostaReforcada() == experimento
				.getUltimaTipoRespostaReforcada()) && (!experimento.isAgua())) {
			
			qualTreinar();
			qualLimiteDown();
		} 
		else if (experimento.isAgua()) {
			qualLimiteUp();
		} 
		else {
			qualLimiteDown();
		}

	}
	
	
	
	public int qualTipoComportamento() {
		Random random = new Random();
		int tipo = random.nextInt(frequencia.getLimite4()+1);
		if (tipo <= frequencia.getLimite1()) {
			return 1;
		} else if (tipo > frequencia.getLimite1() && tipo <= frequencia.getLimite2()) {
			return 2;
		} else if (tipo > frequencia.getLimite2() && tipo <= frequencia.getLimite3()) {
			return 3;
		} else {

			return 4;
		}
	}

	
	
	
	
	private void qualLimiteDown () {
		switch (experimento.getTipoRespostaReforcada()) {
		case 1 : frequencia.remove1(); break;
		case 2 : frequencia.remove2(); break;
		case 3 : frequencia.remove3(); break;
		case 4 : frequencia.remove4(); break;
		}
	}
	
	private void qualLimiteUp () {
		switch (experimento.getTipoRespostaReforcada()) {
		case 1 : frequencia.add1(); break;
		case 2 : frequencia.add2(); break;
		case 3 : frequencia.add3(); break;
		case 4 : frequencia.add4(); break;
		}
	}
	
	private void qualTreinar () {
		switch (experimento.getTipoRespostaReforcada()) {
		case 1 : treinarBarra(); break;
		case 2 : treinarBebedouro(); break;
		case 3 : treinarCaixa();break;
		case 4 : treinarRato();break;
		
		}
		
	}

	public void treinarBarra() {

		double[] entradaE = { experimento.getSede(),
				experimento.getMuitaSede(), experimento.getTempoDemais() };
		double[] saidaE = Controle.converter(brain.respostaE(entradaE));
		experimento.setStress(saidaE[0]);
		experimento.setDesinteresse(saidaE[1]);
		double[] entradaC = { experimento.getSeAgua(), experimento.getStress(),
				experimento.getDesinteresse() };
		double saidaC = brain.respostaC1(entradaC).get(0);
		experimento.setRespostaBarra(saidaC);

	}

	public void treinarBebedouro() {

		double[] entradaE = { experimento.getSede(),
				experimento.getMuitaSede(), experimento.getTempoDemais() };
		double[] saidaE = Controle.converter(brain.respostaE(entradaE));
		experimento.setStress(saidaE[0]);
		experimento.setDesinteresse(saidaE[1]);
		double[] entradaC = { experimento.getSeAgua(), experimento.getStress(),
				experimento.getDesinteresse() };
		double saidaC = brain.respostaC2(entradaC).get(0);
		experimento.setRespostaBebedouro(saidaC);

	}

	public void treinarCaixa() {

		double[] entradaE = { experimento.getSede(),
				experimento.getMuitaSede(), experimento.getTempoDemais() };
		double[] saidaE = Controle.converter(brain.respostaE(entradaE));
		experimento.setStress(saidaE[0]);
		experimento.setDesinteresse(saidaE[1]);
		double[] entradaC = { experimento.getSeAgua(), experimento.getStress(),
				experimento.getDesinteresse() };
		double saidaC = brain.respostaC3(entradaC).get(0);
		experimento.setRespostaCaixa(saidaC);

	}

	public void treinarRato() {

		double[] entradaE = { experimento.getSede(),
				experimento.getMuitaSede(), experimento.getTempoDemais() };
		double[] saidaE = Controle.converter(brain.respostaE(entradaE));
		experimento.setStress(saidaE[0]);
		experimento.setDesinteresse(saidaE[1]);
		double[] entradaC = { experimento.getSeAgua(), experimento.getStress(),
				experimento.getDesinteresse() };
		double saidaC = brain.respostaC4(entradaC).get(0);
		experimento.setRespostaRato(saidaC);

	}



}
