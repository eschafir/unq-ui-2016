package unq_ciu.gatoEncerrado.AppModel

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable
import unq_ciu.gatoEncerrado.Habitacion
import unq_ciu.gatoEncerrado.Item
import unq_ciu.gatoEncerrado.acciones.Agarrar
import org.uqbar.commons.model.UserException

@Accessors
@Observable
class AgregarAccionDeAgarrarElementoAppModel {

	Habitacion habitacion
	Item item

	new(Habitacion habitacion) {
		this.habitacion = habitacion
		item = new Item()
	}

	def agregarAcccionAgarrar() {
		if (item.nombre == null) {
			throw new UserException("Por favor ingrese un nombre para el elemento.")
		} else {
			habitacion.agregarAccion(new Agarrar(item))
		}
	}
}
