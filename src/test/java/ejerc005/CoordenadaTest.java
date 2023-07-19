package ejerc005;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CoordenadaTest {
	
	Coordenada cut;

	@Test
	void testCambioCoordenada() {
		cut= new Coordenada(87.98, 45.45);
		cut.cambioCoordenada(234.45, 9876.6);
	}

}
