package unq_ciu.gatoEncerrado.AppModel

import unq_ciu.gatoEncerrado.Laberinto
import unq_ciu.gatoEncerrado.Habitacion
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable

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
		laberinto.agregarHabitacion(habitacion)
	}

}
