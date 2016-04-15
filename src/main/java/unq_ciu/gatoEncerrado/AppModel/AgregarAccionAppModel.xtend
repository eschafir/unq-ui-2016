package unq_ciu.gatoEncerrado.AppModel

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable
import unq_ciu.gatoEncerrado.Habitacion
import unq_ciu.gatoEncerrado.Laberinto
import unq_ciu.gatoEncerrado.Accion

@Accessors
@Observable
class AgregarAccionAppModel {

	Habitacion habitacionActual
	Laberinto laberinto
	Accion accion

	new(Laberinto laberinto, Habitacion habitacion, Accion acc) {
		this.laberinto = laberinto
		habitacionActual = habitacion
		this.accion =  acc
	}

}
