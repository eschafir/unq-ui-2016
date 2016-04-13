package unq_ciu.gatoEncerrado.AppModel

import org.uqbar.commons.utils.Observable
import org.eclipse.xtend.lib.annotations.Accessors
import unq_ciu.gatoEncerrado.Laberinto
import unq_ciu.gatoEncerrado.Habitacion
import unq_ciu.gatoEncerrado.Juego
import unq_ciu.gatoEncerrado.Accion
import org.uqbar.commons.model.UserException
import org.uqbar.commons.model.ObservableUtils
import unq_ciu.gatoEncerrado.Login.Usuario

@Accessors
@Observable
class GatoEncerradoAppModel {

	Juego juego
	Usuario usuario
	Laberinto laberintoSeleccionado
	Habitacion habitacionSeleccionada
	Accion accionSeleccionada

	new(Juego juego, Usuario usuario) {
		this.juego = juego
		this.usuario = usuario
	}

	new() {
	}

	def void setHabitacionSeleccionada(Habitacion h) {
		habitacionSeleccionada = h
		ObservableUtils.firePropertyChanged(this, "nombreHabitacion")
	}

	def void setLaberintoSeleccionado(Laberinto l) {
		laberintoSeleccionado = l
		ObservableUtils.firePropertyChanged(this, "nombreLaberinto")
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

	def String getNombreLaberinto() {
		this.laberintoSeleccionado.nombre
	}

	def void setNombreLaberinto(String nuevoNombre) {
		this.juego.validarNombre(nuevoNombre)
		this.laberintoSeleccionado.nombre = nuevoNombre
	}

}
