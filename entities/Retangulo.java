package entities;

import entities.enuns.Corobj;

public class Retangulo extends Forma {

	private Double largura;
	private Double altura;
	
	
	public Retangulo() {
		
		
	}
	
	
	public Retangulo(Corobj cor, Double largura, Double altura) {
		super(cor);
		this.largura = largura;
		this.altura = altura;
	}


	@Override
	public  Double Area() {
		
		
		return largura * altura;
		
	}
	
	
	
}
