package unq_ciu.gatoEncerrado.AppModel

import unq_ciu.gatoEncerrado.Laberinto
import unq_ciu.gatoEncerrado.Habitacion
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable
import org.uqbar.commons.model.UserException

@Accessors
@Observable
class CrearHabitacionAppModel {

	Laberinto laberinto
	Habitacion habitacion

	new(Laberinto laberinto) {
		this.laberinto = laberinto
		habitacion = new Habitacion()
	}

	def agregarHabitacion() {
		if (habitacion.nombre == null) {
			throw new UserException("Debe ingresar un nombre para la habitación.")
		} else {
			laberinto.agregarHabitacion(habitacion)
		}

	}
	
	def verificar() {
		if (laberinto == null){
			throw new UserException("Por favor seleccione un laberinto.")
		}
	}

}
