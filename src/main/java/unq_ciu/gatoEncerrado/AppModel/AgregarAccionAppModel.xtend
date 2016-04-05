package unq_ciu.gatoEncerrado.AppModel

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable
import unq_ciu.gatoEncerrado.Habitacion
import unq_ciu.gatoEncerrado.Laberinto

@Accessors
@Observable
class AgregarAccionAppModel {
	
	//VER EJEMPLO DE AGREGARNOTA
	Habitacion habitacionActual
	Habitacion habitacionSeleccionada
	Laberinto laberinto

	new(Laberinto laberinto) {
		this.laberinto = laberinto
	}
}