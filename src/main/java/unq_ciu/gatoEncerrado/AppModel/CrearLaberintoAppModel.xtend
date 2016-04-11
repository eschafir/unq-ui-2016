package unq_ciu.gatoEncerrado.AppModel

import org.eclipse.xtend.lib.annotations.Accessors
import unq_ciu.gatoEncerrado.Laberinto
import unq_ciu.gatoEncerrado.Juego
import org.uqbar.commons.utils.Observable
import org.uqbar.commons.model.UserException

@Accessors
@Observable
class CrearLaberintoAppModel {

	Juego juego
	Laberinto laberinto

	new(Juego juego) {
		this.juego = juego
		laberinto = new Laberinto()
	}

	def agregarLaberinto() {
		if (laberinto.nombre == null) {
			throw new UserException("Debe ingresar un nombre para el laberinto.")
		} else {
			juego.agregarLaberinto(laberinto)
		}
	}
}
