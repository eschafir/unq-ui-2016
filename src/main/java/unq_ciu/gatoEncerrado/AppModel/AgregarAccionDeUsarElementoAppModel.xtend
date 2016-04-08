package unq_ciu.gatoEncerrado.AppModel

import org.eclipse.xtend.lib.annotations.Accessors
import unq_ciu.gatoEncerrado.Laberinto
import unq_ciu.gatoEncerrado.Habitacion
import unq_ciu.gatoEncerrado.Item
import org.uqbar.commons.utils.Observable

@Accessors
@Observable
class AgregarAccionDeUsarElementoAppModel {

	Laberinto laberinto
	Habitacion habitacion
	Item itemSeleccinado

	new(Laberinto lab, Habitacion habitacion) {
		laberinto = lab
		this.habitacion = habitacion
	}

}
