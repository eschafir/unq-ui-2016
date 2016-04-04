package unq_ciu.gatoEncerrado

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable

@Accessors
@Observable
class Juego {

	Jugador jugador
	Laberinto laberinto
	Habitacion habitacionSeleccionada
	new() {
	}

	new(Jugador jugador, Laberinto laberinto) {
		this.jugador = jugador
		this.laberinto = laberinto
	}

	/**
	 * Devuelve la lista de acciones posibles dentro de la habitacion actual del juego.
	 */
	def accionesPosibles() {
		this.jugador.habitacion.acciones
	}
}
