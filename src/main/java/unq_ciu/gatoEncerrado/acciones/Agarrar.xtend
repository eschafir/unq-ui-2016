package unq_ciu.gatoEncerrado.acciones

import unq_ciu.gatoEncerrado.Accion
import unq_ciu.gatoEncerrado.Jugador
import org.eclipse.xtend.lib.annotations.Accessors
import unq_ciu.gatoEncerrado.Juego

@Accessors
class Agarrar extends Accion {

	override ejecutar(Jugador jugador, Juego juego) {

		if (juego.getLaberinto().getHabitacionActual().item != null) {

			jugador.agregarAlInventario(juego.getLaberinto().getHabitacionActual().item)
			juego.getLaberinto().getHabitacionActual().item = null
			juego.getLaberinto().getHabitacionActual().quitarAccion(this)
		} else {
			println("Nada para agarrar")
		}

	}

}
