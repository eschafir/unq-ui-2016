package unq_ciu.gatoEncerrado

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable
import java.util.List

@Accessors
@Observable
class Juego {

	Jugador jugador
	List<Laberinto> laberintos

	new() {
	}

	new(Jugador jugador, Laberinto laberinto) {
		this.jugador = jugador
		laberintos = newArrayList
	}

	/**
	 * Devuelve la lista de acciones posibles dentro de la habitacion actual del juego.
	 */
	def accionesPosibles() {
		this.jugador.habitacion.acciones
	}

	def agregarLaberinto(Laberinto lab) {
		laberintos.add(lab)
	}
}
