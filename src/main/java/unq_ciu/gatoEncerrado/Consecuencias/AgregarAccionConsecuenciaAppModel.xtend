package unq_ciu.gatoEncerrado.Consecuencias

import unq_ciu.gatoEncerrado.Laberinto
import unq_ciu.gatoEncerrado.Habitacion
import unq_ciu.gatoEncerrado.Item
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable
import unq_ciu.gatoEncerrado.Accion

@Accessors
@Observable
class AgregarAccionConsecuenciaAppModel {
	Laberinto laberinto
	Habitacion habitacion
	Item item
	Accion accion

	new(Laberinto l, Habitacion h, Item i, Accion acc) {
		laberinto = l
		habitacion = h
		item = i
		accion = acc
	}
}
