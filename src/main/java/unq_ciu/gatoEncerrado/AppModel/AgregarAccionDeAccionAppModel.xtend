package unq_ciu.gatoEncerrado.AppModel

import org.uqbar.commons.utils.Observable
import org.eclipse.xtend.lib.annotations.Accessors
import unq_ciu.gatoEncerrado.Laberinto
import unq_ciu.gatoEncerrado.Habitacion

@Accessors
@Observable
abstract class AgregarAccionDeAccionAppModel {
	
	Laberinto laberinto
	Habitacion habitacion
	
	def agregarAccion() {}
}