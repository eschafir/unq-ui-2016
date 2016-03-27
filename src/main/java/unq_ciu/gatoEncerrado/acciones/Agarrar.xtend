package unq_ciu.gatoEncerrado.acciones

import unq_ciu.gatoEncerrado.Accion
import unq_ciu.gatoEncerrado.Jugador
import org.eclipse.xtend.lib.annotations.Accessors
import unq_ciu.gatoEncerrado.Juego

@Accessors
class Agarrar extends Accion {

	override ejecutar(Jugador jugador, Juego juego) {

		if (juego.laberinto.habitacionActual.hayItem) {
			if (jugador.puedeAgegar) {
				jugador.agregarAlInventario(juego.laberinto.habitacionActual.item)
				juego.laberinto.habitacionActual.item = null
				juego.laberinto.habitacionActual.quitarAccion(this)
			}
		} else {
			println("nada que agarrar")
		}
	}
}
