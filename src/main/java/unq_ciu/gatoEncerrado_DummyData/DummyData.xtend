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
			val entrada = new Habitacion("Entrada principal", true, false)
			val cocina = new Habitacion("Cocina", false, false)
			val comedor = new Habitacion("Comedor", false, false)
			val pasillo = new Habitacion("Pasillo", false, false)
			val sotano = new Habitacion("Sótano", false, false)
			val patio = new Habitacion("Patio", false, true)
			val laberinto = new Laberinto("Casa Abandonada")
			jugador = new Jugador("Esteban", entrada)
			laberinto.agregarHabitacion(entrada)
			laberinto.agregarHabitacion(cocina)
			laberinto.agregarHabitacion(comedor)
			laberinto.agregarHabitacion(pasillo)
			laberinto.agregarHabitacion(sotano)
			laberinto.agregarHabitacion(patio)
			agregarLaberinto(laberinto)
		]

	}

}
