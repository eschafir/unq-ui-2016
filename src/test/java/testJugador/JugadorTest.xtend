package testJugador

import unq_ciu.gatoEncerrado.Jugador
import unq_ciu.gatoEncerrado.Habitacion
import org.junit.Test
import unq_ciu.gatoEncerrado.Item
import org.junit.Before
import static org.junit.Assert.*;

class JugadorTest {
	var Jugador jugador
	var Habitacion habitacion
	
	@Before
	def void setUp() {
		
		//Establezco el escenario para testear
		habitacion = new Habitacion("Living", false, false)
		jugador = new Jugador("Pepe", habitacion)
		}
	
	@Test
	def void testAbandonar() {
		var resultadoEsperado1 = 0
		var resultadoEsperado2 = 1
		var resultadoEsperado3 = 2
		
		assertEquals(resultadoEsperado1, jugador.abandonados)
		
		jugador.abandonar()
		
		assertEquals(resultadoEsperado2, jugador.abandonados)
		
		jugador.abandonar()
		
		assertEquals(resultadoEsperado3, jugador.abandonados)
	}
	
	@Test
	def void testVerEstadisticas() {
		//Hay que ver si esto hay que testearlo
	}
		
	@Test
	def void testPuedoAgregar() {
		//se crean 15 items
		var Item pala1 = new Item("pala1")
		var Item pala2 = new Item("pala2")
		var Item pala3 = new Item("pala3")
		var Item pala4 = new Item("pala4")
		var Item pala5 = new Item("pala5")
		var Item llave1 = new Item("llave1")
		var Item llave2 = new Item("llave2")
		var Item llave3 = new Item("llave3")
		var Item llave4 = new Item("llave4")
		var Item llave5 = new Item("llave5")
		var Item piedra1 = new Item("piedra1")
		var Item piedra2 = new Item("piedra2")
		var Item piedra3 = new Item("piedra3")
		var Item piedra4 = new Item("piedra4")
		var Item piedra5 = new Item("piedra5")
		
		//tamaño del inventario: 0. 
		assertEquals(true, jugador.puedeAgregar())
		
		//agrego 15 items
		jugador.agregarAlInventario(pala1)
		jugador.agregarAlInventario(pala2)
		jugador.agregarAlInventario(pala3)
		jugador.agregarAlInventario(pala4)
		jugador.agregarAlInventario(pala5)
		jugador.agregarAlInventario(llave1)
		jugador.agregarAlInventario(llave2)
		jugador.agregarAlInventario(llave3)
		jugador.agregarAlInventario(llave4)
		jugador.agregarAlInventario(llave5)
		jugador.agregarAlInventario(piedra1)
		jugador.agregarAlInventario(piedra2)
		jugador.agregarAlInventario(piedra3)
		jugador.agregarAlInventario(piedra4)
		jugador.agregarAlInventario(piedra5)
		
		//el jugador esta lleno
		assertEquals(false, jugador.puedeAgregar())
	}
	
	@Test
	def void testAgregarAlInventario() {
		var clavos = new Item("Clavos")
		
		var resultadoEsperado1 = 0
		var resultadoEsperado2 = 1
		
		assertEquals(resultadoEsperado1, jugador.inventario.size)
		assertFalse(jugador.tiene(clavos))
		
		jugador.agregarAlInventario(clavos)
		
		assertEquals(resultadoEsperado2, jugador.inventario.size)
		assertTrue(jugador.tiene(clavos))
	}
	
	@Test
	def void testQuitarDelInventario() {
		var llave = new Item("llave")
		
		var resultadoEsperado1 = 1
		var resultadoEsperado2 = 0
		
		jugador.agregarAlInventario(llave)
		
		assertEquals(resultadoEsperado1, jugador.inventario.size)
		assertTrue(jugador.tiene(llave))
		
		jugador.quitarDelInventario(llave)
		
		assertEquals(resultadoEsperado2, jugador.inventario.size)
		assertFalse(jugador.tiene(llave))
	}
		
	@Test
	def void testTiene() {
		var piedra = new Item("piedra")
		
		assertFalse(jugador.tiene(piedra))
			
		jugador.agregarAlInventario(piedra)
		
		assertTrue(jugador.tiene(piedra))
	}
}