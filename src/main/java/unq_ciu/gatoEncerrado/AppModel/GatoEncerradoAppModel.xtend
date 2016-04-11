package unq_ciu.gatoEncerrado.AppModel

import org.uqbar.commons.utils.Observable
import org.eclipse.xtend.lib.annotations.Accessors
import unq_ciu.gatoEncerrado.Laberinto
import unq_ciu.gatoEncerrado.Habitacion
import unq_ciu.gatoEncerrado.Juego
import unq_ciu.gatoEncerrado.Accion
import org.uqbar.commons.model.UserException
import org.uqbar.commons.model.ObservableUtils

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

	def void setHabitacionSeleccionada(Habitacion h) {
		habitacionSeleccionada = h
		ObservableUtils.firePropertyChanged(this, "nombreHabitacion")
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

	def verificar() {
		if (habitacionSeleccionada == null) {
			throw new UserException("Por favor seleccione una habitación.")
		}
	}

	def String getNombreHabitacion() {
		this.habitacionSeleccionada.nombre
	}

	def void setNombreHabitacion(String nuevoNombre) {
		this.laberintoSeleccionado.validarNombre(nuevoNombre)
		this.habitacionSeleccionada.nombre = nuevoNombre
	}

}
