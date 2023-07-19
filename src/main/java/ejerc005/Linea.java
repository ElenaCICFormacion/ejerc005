package ejerc005;

import java.awt.Color;

public class Linea extends Figura{


	public Linea(Color color, Coordenada punto1, Coordenada punto2) {
		super(color);
		this.punto1 = punto1;
		this.punto2 = punto2;
		this.centro=null;
	}




	private Coordenada punto1;
	private Coordenada punto2;
	
	

	public Coordenada getPunto1() {
		return punto1;
	}



	public void setPunto1(Coordenada punto1) {
		this.punto1 = punto1;
	}



	public Coordenada getPunto2() {
		return punto2;
	}



	public void setPunto2(Coordenada punto2) {
		this.punto2 = punto2;
	}
	



	

}
