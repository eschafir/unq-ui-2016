package unq_ciu.gatoEncerrado_DummyData

import unq_ciu.gatoEncerrado.Juego
import unq_ciu.gatoEncerrado.Habitacion
import unq_ciu.gatoEncerrado.Jugador
import unq_ciu.gatoEncerrado.Laberinto
import org.uqbar.commons.utils.Observable

/**
 * Esta clase es simplemente un utils para crear objetos tontos
 * que sirva de ejemplo para mostrar en las ventanas.
 * 
 * NO es ningun patron, NO es una practica recomendada, pero 
 * cuando queremos mostrar un ejemplo nos interesa que tenga datos.
 * 
 * Es solo UNA forma de crearlos.
 * 
 */
 
 @Observable
class DummyData {

	def crearJuegoDummy() {
		new Juego => [
			val living = new Habitacion("Living", true, false)
			val cocina = new Habitacion("Cocina", false, false)
			val patio = new Habitacion("Patio", false, false)
			val laberinto = new Laberinto("Casa Abandonada")
			jugador = new Jugador("Esteban", living)
			laberinto.agregarHabitacion(living)
			laberinto.agregarHabitacion(cocina)
			laberinto.agregarHabitacion(patio)
			agregarLaberinto(laberinto)
		]

	}

}
