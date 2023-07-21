package ejerc005;

import java.awt.Color;
import java.util.ArrayList;

public interface Lienzo {
	

	/**
	 * metodo que coprueba la posicion del centro del objeto y,
	 * si esta dentro del lienzo, añade la figura al lienzo.
	 * @param figura
	 */
	public void definir(Figura figura);
	
	/**
	 * Buscamos la figura en el ArrayList y, si existe, la devolvemos
	 * @param figura
	 * @return
	 */
	public Figura buscar(Figura figura) ;
	
	
	/**
	 * recorremos la lista de figuras y devolvemos el centro de todas
	 * @return
	 */
	public ArrayList<Figura> mostarLista();
	
	/**
	 * Buscamos la figura y, de existir, la borramos.
	 * @param figura
	 * @return
	 */
	public boolean eliminar(Figura figura) ;
	
	/**
	 * Recibimos la figura a modificar y la nueva figura. comprobamos si existe.
	 * si existe, la modificamos.
	 * @param vieja
	 * @param nueva
	 */
	public void modificar(Figura vieja, Figura nueva);
	
	
	/**
	 * modificamos el color de la figura pasada si esta existe
	 * @param figura
	 * @param color
	 */
	public void modificarColor(Figura figura, Color color) ;
	
	/**
	 * modificamos el tamaño de un circulo modificando su radio con los valores pasados como parametros
	 * @param figura
	 * @param tamanio
	 */
	public void modificarTamanio(double tamanio, Circulo figura);
	
	/**
	 * modificamos el tamaño de un cuadrado modificando su lado con los valores pasados como parametros
	 * @param figura
	 * @param tamanio
	 */
	public void modificarTamanio(double tamanio, Cuadrado figura);
	
	/**
	 * modificamos el tamaño de la linea 
	 * cambiando los valores de su punto2.
	 * despues se comprueba si los dos puntos de la linea estan fuera del lienzo.
	 * si es asi, se elimina la figura.
	 * @param tamanio
	 * @param figura
	 */
	public void modificarTamanio(double newX, double newY, Linea figura);

	/**
	 * Cambiamos al posicion del centro de la figura dada. a menos que sea una linea
	 * @param x
	 * @param y
	 * @param figura
	 */
	public void modificarPosicion(double x, double y, Figura figura);
	
	
	/**
	 * Comprobamos  si las coordenadas entan dentro o fuera del lienzo del dibujo, es decir
	 * entre las coordenadas 1000000x1000000. 
	 * Devuelve true si esta dentro del lienzo y false en caso contrario.
	 * @return
	 */
	
	public boolean comprobarPosicion(Coordenada coordenada);


}



