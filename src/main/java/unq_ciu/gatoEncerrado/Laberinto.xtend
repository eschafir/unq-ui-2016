package unq_ciu.gatoEncerrado

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable
import java.util.List
import java.util.ArrayList

@Accessors
@Observable
class Laberinto {

	String nombre
	List<Habitacion> habitaciones

	new(){}
	
	new(String nombre) {
		this.nombre = nombre
		this.habitaciones = new ArrayList<Habitacion>
	}

	def agregarHabitacion(Habitacion h) {
		getHabitaciones.add(h)
	}

	def eliminarHabitacion(Habitacion h) {
		if (getHabitaciones.contains(h)) {
			getHabitaciones.remove(h)
		} else {
			println("No se encuentra la habitacion " + h.nombre)
		}
	}

	def itemsDisponibles() {
		/**
		 * TODO
		 */
	}
}
