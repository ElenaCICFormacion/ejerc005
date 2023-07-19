package ejerc005;

import java.awt.Color;

public class Circulo extends Figura{
	
	private double radio;

	public Circulo(Coordenada centro, Color color, double radio) {
		super(centro, color);
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

}
