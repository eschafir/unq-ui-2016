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
	Boolean tieneHabInicial

	new() {
		this.habitaciones = new ArrayList<Habitacion>
		this.tieneHabInicial = false
	}

	new(String nombre) {
		this.nombre = nombre
		this.habitaciones = new ArrayList<Habitacion>
		this.tieneHabInicial = false
	}

	def agregarHabitacion(Habitacion h) {
		if (h.isEsInicial) {
			if (getTieneHabInicial) {
				throw new UserException("Ya existe una habitacion inicial en este laberinto.")
			} else {
				validarNombre(h)
				getHabitaciones.add(h)
				tieneHabInicial = true
			}
		} else {
			validarNombre(h)
			getHabitaciones.add(h)
		}
	}

	def validarNombre(Habitacion habitacion) {
		/**
		 * Seguramente se puede hacer con la sentencia forEach.
		 */
		val nombresHabitaciones = new ArrayList
		for (Habitacion h : habitaciones) {
			nombresHabitaciones.add(h.nombre)
		}
		if (nombresHabitaciones.contains(habitacion.nombre)) {
			throw new UserException("Ya existe una habitacion con el nombre " + habitacion.nombre)
		}
	}

	def eliminarHabitacion(Habitacion h) {
		if (getHabitaciones.contains(h)) {
			if (h.isEsInicial) {
				getHabitaciones.remove(h)
				tieneHabInicial = false
			} else {
				getHabitaciones.remove(h)
			}
		}
	}

	def itemsDisponibles() {
		/**
		 * TODO
		 */
	}
}
