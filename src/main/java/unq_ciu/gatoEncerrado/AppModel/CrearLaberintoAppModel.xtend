package unq_ciu.gatoEncerrado.AppModel

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable
import unq_ciu.gatoEncerrado.Laberinto
import unq_ciu.gatoEncerrado.Juego

@Accessors
@Observable
class CrearLaberintoAppModel {

	Juego juego
	Laberinto laberinto

	new(Juego juego) {
		this.juego = juego
	}

	def agregarLaberinto() {
		juego.agregarLaberinto(laberinto)
	}

}
