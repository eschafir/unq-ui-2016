package testAcciones

import org.junit.Test
import static org.junit.Assert.*
import unq_ciu.gatoEncerrado.Juego
import unq_ciu.gatoEncerrado.Laberinto
import unq_ciu.gatoEncerrado.Habitacion

class AccionTest {
	
	
	
	@Test def void testMover() {
		
		Habitacion cocina = new Habitacion("Cocina", )
		Laberinto laberinto = new Laberinto("Laberinto1", )
		Juego juego = new Juego()
		
		// string literals work with single or double quotes
		assertEquals('Hello', "Hello")
	}
}