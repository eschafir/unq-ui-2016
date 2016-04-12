package unq_ciu.gatoEncerrado.Consecuencias

import org.uqbar.commons.utils.Observable
import org.eclipse.xtend.lib.annotations.Accessors
import unq_ciu.gatoEncerrado.Laberinto
import unq_ciu.gatoEncerrado.Habitacion
import unq_ciu.gatoEncerrado.Item
import org.uqbar.commons.model.UserException
import unq_ciu.gatoEncerrado.acciones.Mover
import unq_ciu.gatoEncerrado.acciones.Usar

@Accessors
@Observable
class AgregarAccionDeIrAOtraHabitacionConsecuenciaAppModel {

	Laberinto laberinto
	Habitacion habitacion
	Habitacion habitacionSeleccionada
	Item item

	new(Laberinto lab, Habitacion hab, Item item) {
		this.laberinto = lab
		this.habitacion = hab
		this.item = item
	}

	def agregarConsecuencia() {
		if (habitacionSeleccionada == null) {
			throw new UserException("Por favor seleccione una habitación.")
		} else {
			habitacion.agregarAccion(new Usar(item, new Mover(habitacionSeleccionada)))
		}
	}

}
