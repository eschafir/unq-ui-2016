package unq_ciu.gatoEncerrado

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable
import java.util.List
import java.util.ArrayList
import org.uqbar.commons.model.UserException
import org.apache.commons.lang.math.RandomUtils

@Accessors
@Observable
class Laberinto {

	int id
	String nombre
	List<Habitacion> habitaciones
	String path
	Estado estado

	new() {
		this.habitaciones = new ArrayList<Habitacion>
		this.estado = Estado.NO_RESUELTO
	}

	new(String nombre) {
		this.id = RandomUtils.nextInt
		this.nombre = nombre
		this.habitaciones = new ArrayList<Habitacion>
		this.path = ""
		this.estado = Estado.NO_RESUELTO
	}

	new(String nombre, int id) {
		this.nombre = nombre
		this.habitaciones = new ArrayList<Habitacion>
		this.id = id
		this.path = ""
		this.estado = Estado.NO_RESUELTO
	}

	new(int id, String nombre, String path) {
		this.id = id
		this.nombre = nombre
		this.habitaciones = new ArrayList<Habitacion>
		this.path = path
		this.estado = Estado.NO_RESUELTO
	}
	
	//new para el servicio rest 2
	new(int id, String nombre, String path, List<Habitacion> habitaciones){
		this.id = id
		this.nombre = nombre
		this.habitaciones = habitaciones
		this.path = path
		this.estado = Estado.NO_RESUELTO
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
	def List<Item> getItemsDisponibles() {
		getHabitaciones.map[Habitacion h|h.items].flatten.toList
	}
}
