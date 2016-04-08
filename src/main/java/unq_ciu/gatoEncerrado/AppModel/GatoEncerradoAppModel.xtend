package unq_ciu.gatoEncerrado.AppModel

import org.uqbar.commons.utils.Observable
import org.eclipse.xtend.lib.annotations.Accessors
import unq_ciu.gatoEncerrado.Laberinto
import unq_ciu.gatoEncerrado.Habitacion
import unq_ciu.gatoEncerrado.Juego
import unq_ciu.gatoEncerrado.Accion

@Accessors
@Observable
class GatoEncerradoAppModel {

	Juego juego
	Laberinto laberintoSeleccionado
	Habitacion habitacionSeleccionada
	Accion accionSeleccionada

	new(Juego juego) {
		this.juego = juego
	}

	new() {
	}

	def eliminarLaberinto() {
		juego.quitarLaberinto(laberintoSeleccionado)
	}

	def eliminarHabitacion() {
		laberintoSeleccionado.eliminarHabitacion(habitacionSeleccionada)
	}

	def quitarAccion() {
		habitacionSeleccionada.quitarAccion(accionSeleccionada)
	}

}
