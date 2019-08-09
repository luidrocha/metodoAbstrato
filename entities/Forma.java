package entities;

import entities.enuns.Corobj;

public abstract class Forma {

	private Corobj cor;
	
	
	public Forma() {
		
	}


	public Forma(Corobj cor) {
		
		this.cor = cor;
	}
	
	
	
	public Corobj getCor() {
		return cor;
	}


	public void setCor(Corobj cor) {
		this.cor = cor;
	}


	public abstract Double Area(); 
	
	
}
