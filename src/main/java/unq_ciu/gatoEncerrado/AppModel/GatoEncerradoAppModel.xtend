package unq_ciu.gatoEncerrado.AppModel

import org.uqbar.commons.utils.Observable
import org.eclipse.xtend.lib.annotations.Accessors
import unq_ciu.gatoEncerrado.Laberinto
import unq_ciu.gatoEncerrado.Habitacion
import unq_ciu.gatoEncerrado.Juego

@Accessors
@Observable
class GatoEncerradoAppModel {

	Juego juego
	Laberinto laberintoSeleccionado
	Habitacion habitacionSeleccionada
	
	new(Juego juego){
		this.juego = juego
	}
	
	def eliminarLaberinto(){
		juego.quitarLaberinto(laberintoSeleccionado)
	}

}
