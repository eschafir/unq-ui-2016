package unq_ciu.gatoEncerrado.AppModel

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable
import unq_ciu.gatoEncerrado.Habitacion
import unq_ciu.gatoEncerrado.Item
import unq_ciu.gatoEncerrado.acciones.Agarrar

@Accessors
@Observable
class AgregarAccionDeAgarrarElementoAppModel {

	Habitacion habitacion
	Item item

	new(Habitacion habitacion) {
		this.habitacion = habitacion
	}

	def agregarAcccionAgarrar() {
		getHabitacion.agregarAccion(new Agarrar(item))
	}

}
