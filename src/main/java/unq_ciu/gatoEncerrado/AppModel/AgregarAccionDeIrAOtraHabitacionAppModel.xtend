package unq_ciu.gatoEncerrado.AppModel

import unq_ciu.gatoEncerrado.Habitacion
import org.eclipse.xtend.lib.annotations.Accessors
import unq_ciu.gatoEncerrado.Laberinto
import org.uqbar.commons.utils.Observable

@Accessors
@Observable
class AgregarAccionDeIrAOtraHabitacionAppModel {
	
	//VER EJEMPLO DE AGREGARNOTA
	Habitacion habitacionActual
	Habitacion habitacionSeleccionada
	Laberinto laberinto

	new(Laberinto laberinto) {
		this.laberinto = laberinto
	}

}
