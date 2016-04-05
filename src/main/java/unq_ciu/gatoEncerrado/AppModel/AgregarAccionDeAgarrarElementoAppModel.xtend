package unq_ciu.gatoEncerrado.AppModel

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable
import unq_ciu.gatoEncerrado.Habitacion
import unq_ciu.gatoEncerrado.Item
import unq_ciu.gatoEncerrado.Laberinto

@Accessors
@Observable
class AgregarAccionDeAgarrarElementoAppModel {
	
	Habitacion habitacionActual
	Habitacion habitacionSeleccionada
	Laberinto laberinto
	Item item

	new(Laberinto laberinto) {
		this.laberinto = laberinto
	}
}