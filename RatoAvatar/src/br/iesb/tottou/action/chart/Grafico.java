package br.iesb.tottou.action.chart;

import java.awt.Color;
import java.io.File;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import br.iesb.tottou.data.ResultadoDAO;
import br.iesb.tottou.model.Resultado;

public class Grafico extends HttpServlet {	
	
	 static final long serialVersionUID = 1L;
	 private String nomeAluno;
	 private String nomeRato;
	 private String nomeExperimento;
	 public Resultado resultado = new Resultado();
	 private String caminho;

	
	protected void doGet(HttpServletRequest request,
	            HttpServletResponse response) throws ServletException, IOException {
		 setNomeAluno(request.getSession().getAttribute("loginUsuario").toString());
		 setNomeRato(request.getSession().getAttribute("ratoAvatar").toString());
		 setNomeExperimento(request.getParameter("resultados")); 
		 caminho =request.getSession().getServletContext().getRealPath("")+ File.separator;
		 popularResultado();
		 criargrafico();		 
		 RequestDispatcher dispatcher = request.getRequestDispatcher("Resultados.jsp");  
         dispatcher.forward(request, response);  
	 }
	
	protected void popularResultado () {
		resultado = ResultadoDAO.recuperaResultado(getNomeAluno(), getNomeRato(), getNomeExperimento());
	}
		
	  private CategoryDataset criarDataset() {
	       
	        
	        //linhas
		  	String series0 = "Reforços";
	        String series1 = "Barra de Pressão";
	        String series2 = "Bebedouro";
	        String series3 = "Componentes gerais";
	        String series4 = "Comportamentos Intrísecos";

	       //colunas
	          String umUm = "farejou";
	    	  String umDois = "observou";
	    	  String umTres = "encostou as duas patas";
	    	  String umQuatro = "mordeu";
	    	  String umCinco = "pressionou";
	    	
	    	  String doisUm = "farejou";
	    	  String doisDois = "lambeu";
	    	  String doisTres = "encostou";
	    	  String doisQuatro = "mordeu";
	    	  String doisCinco = "encostou as patas";
	    	
	    	  String tresUm = "farejou";
	    	  String tresDois = "paredes";
	    	  String tresTres = "auto-falantes";
	    	  String tresQuatro = "sinal luminoso";
	    	  String tresCinco = "farejou partes diversas ";
	    	
	    	  String quatroUm = "esfregou as patas ";
	    	  String quatroDois = "lambeu as patas";
	    	  String quatroTres = "girou em torno de si mesmo";
	    	  String quatroQuatro = "girou duas vezes ";
	    	  String quatroCinco = "ficou imóvel";
	       

	        //criando o datasheet
	        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

	        dataset.addValue(resultado.getReforcos(), series0, "Reforços");
	        
	        dataset.addValue(resultado.getUmUm(), series1, umUm);
	        dataset.addValue(resultado.getUmDois(), series1, umDois);
	        dataset.addValue(resultado.getUmTres(), series1, umTres);
	        dataset.addValue(resultado.getUmQuatro(), series1, umQuatro);
	        dataset.addValue(resultado.getUmCinco(), series1, umCinco);
	       

	        dataset.addValue(resultado.getDoisUm(), series2, doisUm);
	        dataset.addValue(resultado.getDoisDois(), series2, doisDois);
	        dataset.addValue(resultado.getDoisTres(), series2, doisTres);
	        dataset.addValue(resultado.getDoisQuatro(), series2, doisQuatro);
	        dataset.addValue(resultado.getDoisCinco(), series2, doisCinco);
	        

	        dataset.addValue(resultado.getTresUm(), series3, tresUm);
	        dataset.addValue(resultado.getTresDois(), series3, tresDois);
	        dataset.addValue(resultado.getTresTres(), series3, tresTres);
	        dataset.addValue(resultado.getTresQuatro(), series3, tresQuatro);
	        dataset.addValue(resultado.getTresCinco(), series3, tresCinco);
	        
	        dataset.addValue(resultado.getQuatroUm(), series4, quatroUm);
	        dataset.addValue(resultado.getQuatroDois(), series4, quatroDois);
	        dataset.addValue(resultado.getQuatroTres(), series4, quatroTres);
	        dataset.addValue(resultado.getQuatroQuatro(), series4, quatroQuatro);
	        dataset.addValue(resultado.getQuatroCinco(), series4, quatroCinco);
	        
	    
	        
	        return dataset;
	        
	    }
	
	public  void criargrafico ()  {
	
						 
			 CategoryDataset dataset = criarDataset();
			 JFreeChart chart = ChartFactory.createBarChart(
			  "Resultados do Rato Avatar"+nomeRato, "", "Frequência", dataset, 
			   PlotOrientation.VERTICAL,
			  true, false, false);


			 final CategoryPlot plot = chart.getCategoryPlot();
			plot.setForegroundAlpha(1f);
			 
			 
			 chart.setBackgroundPaint(new Color(255, 255, 255));

			 try {
			  final ChartRenderingInfo info = new ChartRenderingInfo
			   (new StandardEntityCollection());

			 final File file1 = new File(caminho+"/charts/chart"+nomeAluno+nomeRato+nomeExperimento+".png");

			 ChartUtilities.saveChartAsPNG(file1, chart, 2600, 600, info);
			  } catch (Exception e) {
			  System.out.println(e);
			  }


}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getNomeRato() {
		return nomeRato;
	}

	public void setNomeRato(String nomeRato) {
		this.nomeRato = nomeRato;
	}

	public String getNomeExperimento() {
		return nomeExperimento;
	}

	public void setNomeExperimento(String nomeExperimento) {
		this.nomeExperimento = nomeExperimento;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
