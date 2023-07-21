package ejerc005;



import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;

import java.awt.Color;
import java.util.ArrayList;

class LienzoImpTest {
	
	private LienzoImp cut;
	private Coordenada dependencia;
	
	@BeforeEach
	void setUp() throws Exception{
		this.cut= new LienzoImp();
		this.dependencia=mock(Coordenada.class);
	}

	@Test
	void testDefinirFigura() {
		Figura cuadrado= new Cuadrado (new Coordenada(23.23,23.23), Color.black, 234.34);
		Figura circulo= new Circulo (new Coordenada(23.23,23.23), Color.gray, 234.34);
		Figura linea= new Linea (Color.BLUE, new Coordenada(23.23,23.23),new Coordenada(23.23,23.23));
		cut.definir(circulo);
		cut.definir(cuadrado);
		cut.definir(linea);
		assertThat("Tamaño del array: 2", cut.getFiguras().size(), is(2));
	}

	@Test
	void testDefinirLinea() {
		
		Figura linea= new Linea (Color.BLUE, new Coordenada(23.23,23.23),new Coordenada(23.23,23.23));
		
		cut.definir(linea);
		assertThat("Tamaño del array: 1", cut.getFiguras().size(), is(0));
	}

	@Test
	void testBuscar() {
		Figura cuadrado= new Cuadrado (new Coordenada(23.23,23.23), Color.black, 234.34);
		Figura circulo= new Circulo (new Coordenada(23.23,23.23), Color.gray, 234.34);
		Figura linea= new Linea (Color.BLUE, new Coordenada(23.23,23.23),new Coordenada(23.23,23.23));
		cut.getFiguras().add(circulo);
		cut.getFiguras().add(cuadrado);
		cut.getFiguras().add(linea);
		Figura f=cut.buscar(circulo);
		assertThat("La figura encontrada debe ser un circulo", f.getClass(), is(Circulo.class));
	}

	@Test
	void testMostarLista() {
		Figura cuadrado= new Cuadrado (new Coordenada(23.23,23.23), Color.black, 234.34);
		Figura circulo= new Circulo (new Coordenada(23.23,23.23), Color.gray, 234.34);
		Figura linea= new Linea (Color.BLUE, new Coordenada(23.23,23.23),new Coordenada(23.23,23.23));
		cut.getFiguras().add(circulo);
		cut.getFiguras().add(cuadrado);
		cut.getFiguras().add(linea);
		ArrayList<Figura> figurasRes=cut.mostarLista();
		
		assertThat("El tamaño del array list debe ser el mismo que el de figuras", figurasRes.size(), is(cut.getFiguras().size()));

		

		
	}

	@Test
	void testEliminar() {
		Figura cuadrado= new Cuadrado (new Coordenada(23.23,23.23), Color.black, 234.34);
		Figura circulo2= new Cuadrado (new Coordenada(45.5,98.7), Color.magenta, 8.87);
		Figura cuadrado3= new Circulo (new Coordenada(23.23,23.23), Color.gray, 234.34);
		Figura linea= new Linea (Color.BLUE, new Coordenada(23.23,23.23),new Coordenada(23.23,23.23));
		
		cut.getFiguras().add(circulo2);
		cut.getFiguras().add(cuadrado);
		cut.getFiguras().add(cuadrado3);
		cut.getFiguras().add(linea);
		
		cut.eliminar(linea);
		
		assertThat("El tipo de tamaño del arraylist figuras debe ser 3", cut.getFiguras().size(), is(3));

		
	}

	@Test
	void testModificar() {
		Figura cuadrado= new Cuadrado (new Coordenada(23.23,23.23), Color.black, 234.34);
		Figura circulo2= new Cuadrado (new Coordenada(45.5,98.7), Color.magenta, 8.87);
		Figura cuadrado3= new Circulo (new Coordenada(23.23,23.23), Color.gray, 234.34);
		Figura linea= new Linea (Color.BLUE, new Coordenada(23.23,23.23),new Coordenada(23.23,23.23));
		cut.getFiguras().add(cuadrado3);
		cut.getFiguras().add(cuadrado);
		cut.getFiguras().add(linea);
		cut.modificar(cuadrado, circulo2);
		assertThat("El tipo de figura debe ser un circulo", cut.getFiguras().get(0).getClass(), is(Circulo.class));
		
	}

	@Test
	void testModificarColor() {
		Figura cuadrado= new Cuadrado (new Coordenada(23.23,23.23), Color.black, 234.34);
		Figura circulo= new Circulo (new Coordenada(23.23,23.23), Color.gray, 234.34);
		Figura linea= new Linea (Color.BLUE, new Coordenada(23.23,23.23),new Coordenada(23.23,23.23));
		cut.getFiguras().add(circulo);
		cut.getFiguras().add(cuadrado);
		cut.getFiguras().add(linea);
		cut.modificarColor(linea, Color.pink);
		assertThat("El color debe ser rosa", cut.getFiguras().get(2).getColor(), is(Color.pink));
		
	}

	@Test
	void testModificarTamanioDoubleCirculo() {
		Circulo circulo= new Circulo (new Coordenada(23.23,23.23), Color.gray, 234.34);
		cut.getFiguras().add(circulo);
		
		cut.modificarTamanio(34.34, circulo);
		Circulo c= (Circulo) cut.getFiguras().get(0);
		assertThat("El tamaño del circulo debe ser 34.34", c.getRadio(), is(34.34));

	}

	@Test
	void testModificarTamanioDoubleCuadrado() {
		Cuadrado cuadrado= new Cuadrado (new Coordenada(23.23,23.23), Color.black, 234.34);
		cut.getFiguras().add(cuadrado);
		cut.modificarTamanio(34.34, cuadrado);
		Cuadrado c= (Cuadrado) cut.getFiguras().get(0);
		assertThat("El tamaño del circulo debe ser 34.34", c.getLado(), is(34.34));

		
		
	}

	@Test
	void testModificarTamanioDoubleDoubleLinea() {
		Linea linea= new Linea (Color.BLUE, new Coordenada(23.23,23.23),new Coordenada(23.23,23.23));
		cut.getFiguras().add(linea);
		
		cut.modificarTamanio(34.34, 34.34, linea);
		Linea c= (Linea) cut.getFiguras().get(0);
		assertThat("La coordenada x debe ser 34.34", c.getPunto2().getX(), is(34.34));

	}

	@Test
	void testModificarPosicion() {
		Punto punto= new Punto (new Coordenada(78.65, 454.676), Color.DARK_GRAY);
		cut.getFiguras().add(punto);
		
		cut.modificarPosicion(23.34, 98.98, punto);
		
		assertThat("La coordenada y debe ser 98.98", punto.getCentro().getY(), is(98.98));
	}

	@Test
	void testComprobarPosicion() {
		this.dependencia.setX(34.34);
		this.dependencia.setY(10000004);
		boolean resultado=cut.comprobarPosicion(dependencia);
		assertThat("La posicion esta fuera del lienzo, por lo que debe dar false", resultado, is(false));

	}

}
