package ejerc005;

import java.awt.Color;

public class Cuadrado extends Figura{
	
	private double lado;

	public Cuadrado(Coordenada centro, Color color, double lado) {
		super(centro, color);
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	
	
	

	
	

}
