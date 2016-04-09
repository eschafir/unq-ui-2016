package testLaberinto

import unq_ciu.gatoEncerrado.Laberinto
import org.junit.Before
import org.junit.Test
import static org.junit.Assert.*;
import unq_ciu.gatoEncerrado.Habitacion


class LaberintoTest {
	
	var Laberinto laberinto
	var Habitacion habitacion1
	var Habitacion habitacion2
	
	@Before
	def void setUp() {
		
		//Establezco el escenario para testear
		laberinto = new Laberinto("Casa Embrujada")
		habitacion1 = new Habitacion("Living", false, false)
		habitacion2 = new Habitacion("Baño", false, false)
		
	}
	
	@Test
	def void testAgregarHabitacion() {
		
		assertFalse(laberinto.habitaciones.contains(habitacion1))
		assertEquals(0, laberinto.habitaciones.size)
		
		laberinto.agregarHabitacion(habitacion1)
		
		assertTrue(laberinto.habitaciones.contains(habitacion1))
		assertEquals(1, laberinto.habitaciones.size)
	}
	
	@Test
	def void testEliminarHabitacion() {
		
		laberinto.agregarHabitacion(habitacion1)
		
		assertEquals(1, laberinto.habitaciones.size)
		assertTrue(laberinto.habitaciones.contains(habitacion1))
		
		laberinto.eliminarHabitacion(habitacion1)
		
		assertFalse(laberinto.habitaciones.contains(habitacion1))
		assertEquals(0, laberinto.habitaciones.size)
	}
}