package br.iesb.tottou.action;
import org.hibernate.Session;  
import org.hibernate.Transaction;  

import br.iesb.tottou.data.HibernateUtil;
import br.iesb.tottou.engine.brain.Cerebro;
import br.iesb.tottou.engine.brain.Controle;
import br.iesb.tottou.model.Aluno;
  
public class Teste {  
	
	
	public static void main(String[] args) {
		Cerebro brain = new Cerebro();
		
		
		double[] in = {0,1,1};		
		for (int i = 0; i < 100; i++) {
			double[] out =  Controle.converter(brain.respostaE(in));
			System.out.println("E: "+out[0]+ " , "+out[1]);
			double[] out2 = {1, out[0], out[1]};
			System.out.println("C: "+brain.respostaC1(out2));
		}
		System.out.println("==================================");
		
		for (int i = 0; i < 100; i++) {
			double[] out =  Controle.converter(brain.respostaE(in));
			System.out.println("E: "+out[0]+ " , "+out[1]);
			double[] out2 = {0, out[0], out[1]};
			System.out.println("C: "+brain.respostaC1(out2));
		}
		System.out.println("==================================");
		double[] out =  Controle.converter(brain.respostaE(in));
		System.out.println("E: "+out[0]+ " , "+out[1]);
		double[] out2 = {1, out[0], out[1]};
		System.out.println("C: "+brain.respostaC1(out2));
	}
	
   public static void teste() {  
      Session sessao = HibernateUtil.getSessionFactory().openSession();  
Transaction t = sessao.beginTransaction();  
  
      Aluno aluno = new Aluno();       
      aluno.setNome("Parvo");  
      aluno.setMatricula("123456l");
      aluno.setLogin("login");
      aluno.setSenha("senha");
            
      sessao.save(aluno);  
      t.commit();  
      
      
      
       
Transaction t2 = sessao.beginTransaction();  
  
      Aluno aluno2 = new Aluno();       
      aluno2.setNome("Champz da Siva");  
      aluno2.setMatricula("12l");
      aluno2.setLogin("champ");
      aluno2.setSenha("swordfish");
            
      sessao.save(aluno2);  
      t2.commit();  
      sessao.close(); 
        
        
   }     
   
   public String disparar() {
	   return "sdas";
	   
   }
   
   
   
}