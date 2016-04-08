package unq_ciu.gatoEncerrado

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable
import java.util.List
import java.util.ArrayList
import unq_ciu.gatoEncerrado.Excepciones.YaHayUnaHabitacionInicialEnElLaberinto

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
				throw new YaHayUnaHabitacionInicialEnElLaberinto()
			} else {
				getHabitaciones.add(h)
				tieneHabInicial = true
			}
		} else {
			getHabitaciones.add(h)
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
