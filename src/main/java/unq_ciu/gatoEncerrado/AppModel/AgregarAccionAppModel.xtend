package unq_ciu.gatoEncerrado.AppModel

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable
import unq_ciu.gatoEncerrado.Habitacion

@Accessors
@Observable
class AgregarAccionAppModel {

	Habitacion habitacionActual

	new(Habitacion habitacion) {
		habitacionActual = habitacion
	}

}
