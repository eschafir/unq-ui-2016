package unq_ciu.gatoEncerrado

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable
import java.util.List
import java.util.ArrayList
import org.uqbar.commons.model.UserException

@Accessors
@Observable
class Laberinto {

	String nombre
	List<Habitacion> habitaciones

	new() {
		this.habitaciones = new ArrayList<Habitacion>
	}

	new(String nombre) {
		this.nombre = nombre
		this.habitaciones = new ArrayList<Habitacion>
	}

	def agregarHabitacion(Habitacion h) {
		if (h.isEsInicial && tieneHabInicial) {
			throw new UserException("Ya existe una habitacion inicial en este laberinto.")
		}

		validarNombre(h.nombre)
		getHabitaciones.add(h)
	}

	def Boolean getTieneHabInicial() {
		habitaciones.exists[it.esInicial]
	}

	def validarNombre(String nuevoNombre) {
		if (habitaciones.exists[it.nombre.equals(nuevoNombre)]) {
			throw new UserException("Ya existe una habitacion con el nombre " + nuevoNombre)
		}
		if (nuevoNombre == "") {
			throw new UserException("Ingrese un nombre para la habitacion")
		}
	}

	def eliminarHabitacion(Habitacion h) {
		if (getHabitaciones.contains(h)) {
			if (h.isEsInicial) {
				getHabitaciones.remove(h)
			} else {
				getHabitaciones.remove(h)
			}
		}
	}

	/**
	* Guarda en un ArrayList de todas las habitaciones los items disponibles
	*/
	def getItemsDisponibles() {
		/*
		 * TODO
		 */
	}
}
