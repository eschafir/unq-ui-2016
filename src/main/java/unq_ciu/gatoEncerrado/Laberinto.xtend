package unq_ciu.gatoEncerrado

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.ArrayList

@Accessors
class Laberinto {

	String nombre
	ArrayList<Habitacion> habitaciones
	Habitacion habitacionActual
	Habitacion habitacionNueva

	new(String nombre, ArrayList<Habitacion> habitaciones) {
		this.nombre = nombre
		this.habitaciones = habitaciones
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
}
