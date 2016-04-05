package unq_ciu.gatoEncerrado.AppModel

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable
import unq_ciu.gatoEncerrado.Habitacion
import java.util.Arrays
import unq_ciu.gatoEncerrado.Item

@Accessors
@Observable
class AgregarAccionAppModel {

	Habitacion habitacionActual

	def getItemsPosibles() {
		Arrays.asList(Item.values)
	}

}
