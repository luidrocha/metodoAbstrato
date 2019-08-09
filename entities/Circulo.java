package entities;

import entities.enuns.Corobj;

public class Circulo extends Forma {

	private Double raio;

	public Circulo() {

	}

	public Circulo(Corobj cor, Double raio) {
		super(cor);
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	@Override
	public Double Area() {

		return Math.PI * raio * raio;
	}
}
