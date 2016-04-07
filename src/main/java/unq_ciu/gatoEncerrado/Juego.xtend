package unq_ciu.gatoEncerrado

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List
import org.uqbar.commons.utils.TransactionalAndObservable
import java.util.ArrayList

@Accessors
@TransactionalAndObservable
class Juego {

	Jugador jugador
	List<Laberinto> laberintos

	new() {
	}

	new(Jugador jugador) {
		this.jugador = jugador
		this.laberintos = new ArrayList<Laberinto>
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
