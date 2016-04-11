package testJugador

import unq_ciu.gatoEncerrado.Jugador
import unq_ciu.gatoEncerrado.Habitacion

class JugadorTest {
	var Jugador jugador
	var Habitacion habitacion

	def void setUp() {

		//Establezco el escenario para testear
		habitacion = new Habitacion("Living", false, false)
		jugador = new Jugador("Pepe", habitacion)
	}

	def void testAbandonar() {
		//Falta testear
	}

	def void testVerEstadisticas() {
		//Falta testear
	}

	def void testPuedoAgregar() {
		//Falta testear
	}

	def void testAgregarAlInventario() {
		//Falta testear
	}

	def void testQuitarDelInventario() {
		//Falta testear
	}

	def void testTiene() {
		//Falta testear
	}

}
