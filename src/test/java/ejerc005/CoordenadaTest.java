package ejerc005;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CoordenadaTest {
	
	Coordenada cut;

	@Test
	void testCambioCoordenada() {
		cut= new Coordenada(87.98, 45.45);
		cut.cambioCoordenada(234.45, 9876.6);
		assertThat("El valor de x debia ser '234.45'", cut.getX(), is(234.45));
		assertThat("El valor de x debia ser '9876.6'", cut.getY(), is(9876.6));
	}

}
