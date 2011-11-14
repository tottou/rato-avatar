package br.iesb.tottou.engine.time;

public class Frequencia {

	private int limite1;
	private int limite2;
	private int limite3;
	private int limite4;
	
	
	
	
	public Frequencia () {
		setLimite1(0);
		setLimite2(1);
		setLimite3(2);
		setLimite4(3);
	}
	
	public void remove1 () {
		if (getLimite1() >0) {
			setLimite1(getLimite1()-1);
			remove2();
		}
		
	}
	
	public void remove2 () {
		if (getLimite2() > (getLimite1()+1)) {
		setLimite2(getLimite2()-1);
		remove3();
		}
	}
	
	public void remove3 () {
		if (getLimite3() > (getLimite2()+1)) {
		setLimite3(getLimite3()-1);
		remove4();
		}
	}
	
	public void remove4 () {
		if (getLimite4() > (getLimite3()+1)) {
		setLimite4(getLimite4()-1);
		}
	
	}
	

	public void add1() {
		
		setLimite1(getLimite1()+1);
		add2();

	}

	public void add2() {
		setLimite2(getLimite2()+1);
		add3();
	}

	public void add3() {
		setLimite3(getLimite3()+1);
		add4();
	}

	public void add4() {
		setLimite4(getLimite4()+1);
		
	}
	
	

	public int getLimite1() {
		return limite1;
	}

	public void setLimite1(int limite1) {
		this.limite1 = limite1;
	}

	public int getLimite2() {
		return limite2;
	}

	public void setLimite2(int limite2) {
		this.limite2 = limite2;
	}

	public int getLimite3() {
		return limite3;
	}

	public void setLimite3(int limite3) {
		this.limite3 = limite3;
	}

	public int getLimite4() {
		return limite4;
	}

	public void setLimite4(int limite4) {
		this.limite4 = limite4;
	}

}
