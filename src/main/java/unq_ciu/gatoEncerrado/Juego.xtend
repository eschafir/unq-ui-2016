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

	new(Jugador jugador) {
		this.jugador = jugador
		laberintos = newArrayList
	}

	/**
	 * Devuelve la lista de acciones posibles dentro de la habitacion actual del juego.
	 */
	def accionesPosibles() {
		this.jugador.habitacion.acciones
	}

	/**
	 * Agrega un laberinto al juego.
	 * @params lab : laberinto a agregar.
	 */
	def agregarLaberinto(Laberinto lab) {
		getLaberintos.add(lab)
	}

	/**
	 * Remueve un laberinto del juego.
	 * @params lab : laberinto a quitar.
	 */
	def quitarLaberinto(Laberinto lab) {
		if (laberintos.contains(lab)) {
			laberintos.remove(lab)
		}
	}
}
