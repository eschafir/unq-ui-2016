package unq_ciu.gatoEncerrado

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List
import org.uqbar.commons.utils.TransactionalAndObservable
import java.util.ArrayList
import org.uqbar.commons.model.UserException

@Accessors
@TransactionalAndObservable
class Juego {

	Jugador jugador
	List<Laberinto> laberintos

	new() {
		this.jugador = new Jugador()
		this.laberintos = new ArrayList<Laberinto>
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
	 * Agrega un laberinto al juego. Además se incluye en la lista de laberintos del jugador.
	 * @params lab : laberinto a agregar.
	 */
	def agregarLaberinto(Laberinto lab) {
		validarNombre(lab.nombre)
		getLaberintos.add(lab)
		jugador.laberintos.add(lab)
	}

	/**
	 * Remueve un laberinto del juego.
	 * @params lab : laberinto a quitar.
	 */
	def quitarLaberinto(Laberinto lab) {
		if (laberintos.contains(lab)) {
			laberintos.remove(lab)
			jugador.laberintos.remove(lab)
		}
	}

	/**
	 * Valida si el nombre de un laberinto ya se encuentra en uso en la lista de laberintos del juego.
	 * @params laberinto : el laberinto al cual se va a verificar el nombre. 
	 */
	def validarNombre(String nuevoNombre) {

		if (laberintos.exists[it.nombre.equals(nuevoNombre)]) {
			throw new UserException("Ya existe un laberinto con el nombre " + nuevoNombre)
		}
		if (nuevoNombre == "") {
			throw new UserException("Ingrese un nombre para el laberinto.")
		}
	}
}
