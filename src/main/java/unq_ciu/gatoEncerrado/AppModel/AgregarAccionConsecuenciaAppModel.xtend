package unq_ciu.gatoEncerrado.AppModel

import unq_ciu.gatoEncerrado.Laberinto
import unq_ciu.gatoEncerrado.Habitacion
import unq_ciu.gatoEncerrado.Item
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable

@Accessors
@Observable
class AgregarAccionConsecuenciaAppModel {
	Laberinto laberinto
	Habitacion habitacion
	Item item

	new(Laberinto l, Habitacion h, Item i) {
		laberinto = l
		habitacion = h
		item = i
	}
}
