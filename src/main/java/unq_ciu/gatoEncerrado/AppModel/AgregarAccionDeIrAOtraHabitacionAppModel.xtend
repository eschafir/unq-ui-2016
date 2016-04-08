package unq_ciu.gatoEncerrado.AppModel

import unq_ciu.gatoEncerrado.Habitacion
import org.eclipse.xtend.lib.annotations.Accessors
import unq_ciu.gatoEncerrado.Laberinto
import org.uqbar.commons.utils.Observable
import unq_ciu.gatoEncerrado.acciones.Mover

@Accessors
@Observable
class AgregarAccionDeIrAOtraHabitacionAppModel {

	Habitacion habitacion
	Habitacion habitacionSeleccionada
	Laberinto laberinto

	new(Laberinto laberinto, Habitacion habitacion) {
		this.laberinto = laberinto
		this.habitacion = habitacion
	}

	def agregarAccion() {
		habitacion.agregarAccion(new Mover(habitacionSeleccionada))
	}

}
