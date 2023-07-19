package ejerc005;


import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Lienzo {
	
	private final double x=1000000;
	private final double y=1000000;
	private List<Figura> figuras;
	
	
	
	public Lienzo() {
		this.figuras = new ArrayList();;
	}


	public List<Figura> getFiguras() {
		return figuras;
	}



	public void setFiguras(List<Figura> figuras) {
		this.figuras = figuras;
	}

	

	public double getX() {
		return x;
	}



	public double getY() {
		return y;
	}



	/**
	 * metodo que coprueba la posicion del centro del objeto y,
	 * si esta dentro del lienzo, añade la figura al lienzo.
	 * @param figura
	 */
	public void definir(Figura figura) {
		if(comprobarPosicion(figura.centro)) {
			figuras.add(figura);
		}
	}
	
	/**
	 * Buscamos la figura en el ArrayList y, si existe, la devolvemos
	 * @param figura
	 * @return
	 */
	public Figura buscar(Figura figura) {
		if(figuras.contains(figura)) {
			return figura;
		}else{
			return null;
		}
		
	}
	
	/**
	 * recorremos la lista de figuras y devolvemos el centro de todas
	 * @return
	 */
	public void mostarLista(){
		figuras.forEach(figura-> figura.getCentro());
	}
	/**
	 * Buscamos la figura y, de existir, la borramos.
	 * @param figura
	 * @return
	 */
	public boolean eliminar(Figura figura) {
		if(buscar(figura)!=null) {
			figuras.remove(figuras.indexOf(figura));
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * Recibimos la figura a modificar y la nueva figura. comprobamos si existe.
	 * si existe, la modificamos.
	 * @param vieja
	 * @param nueva
	 */
	public void modificar(Figura vieja, Figura nueva) {
		if(buscar(vieja)!=null) {
			figuras.set(figuras.indexOf(vieja), nueva);
		}
		
	}
	/**
	 * modificamos el color de la figura pasada si esta existe
	 * @param figura
	 * @param color
	 */
	public void modificarColor(Figura figura, Color color) {
		if(buscar(figura)!=null) {
		figura.setColor(color);
		}
	
	}
	
	/**
	 * modificamos el tamaño de un circulo modificando su radio con los valores pasados como parametros
	 * @param figura
	 * @param tamanio
	 */
	public void modificarTamanio(double tamanio, Circulo figura) {
		if(buscar(figura)!=null && figura.getClass()==Circulo.class) {
		figura.setRadio(tamanio);
		} 
	}
	
	/**
	 * modificamos el tamaño de un cuadrado modificando su lado con los valores pasados como parametros
	 * @param figura
	 * @param tamanio
	 */
	public void modificarTamanio(double tamanio, Cuadrado figura) {
		if(buscar(figura)!=null && figura.getClass()==Cuadrado.class) {
			figura.setLado(tamanio);
		}
	}

	
	/**
	 * modificamos el tamaño de la linea 
	 * cambiando los valores de su punto2
	 * @param tamanio
	 * @param figura
	 */
	public void modificarTamanio(double newX, double newY, Linea figura) {
		if(buscar(figura)!=null) {
			figura.getPunto2().cambioCoordenada(newX, newY);
		}
	}
	
	
	/**
	 * Cambiamos al posicion del centro de la figura dada. a menos que sea una linea
	 * @param x
	 * @param y
	 * @param figura
	 */
	public void modificarPosicion(double x, double y, Figura figura) {
		if(buscar(figura)!=null && figura.getClass()!=Linea.class) {
			figura.getCentro().cambioCoordenada(x, y);
				if(!comprobarPosicion(figura.getCentro())) {
					eliminar(figura);
				}
		}
	}
	
	
	
	
	
	
	/**
	 * Comprobamos  si las coordenadas entan dentro o fuera del lienzo del dibujo, es decir
	 * entre las coordenadas 1000000x1000000. 
	 * Devuelve true si esta dentro del lienzo y false en caso contrario.
	 * @return
	 */
	public boolean comprobarPosicion(Coordenada coordenada) {
		if(coordenada.getX()>0 && coordenada.getX()<x) {
			if(coordenada.getY()>=0 && coordenada.getY()<y) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
		
	}


}
