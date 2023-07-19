package ejerc005;

import java.awt.Color;

public abstract class Figura {
	
	protected Coordenada centro;
	
	protected Color color;
	
	
	public Figura(Color color) {
		this.color = color;
	}


	public Figura(Coordenada centro, Color color) {
		this.centro = centro;
		this.color = color;
	}


	public Coordenada getCentro() {
		return centro;
	}


	public void setCentro(Coordenada centro) {
		this.centro = centro;
	}
	

	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}
	
	
	
	
	
	
	
	

}
