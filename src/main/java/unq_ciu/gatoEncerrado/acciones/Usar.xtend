package unq_ciu.gatoEncerrado.acciones

import unq_ciu.gatoEncerrado.Accion
import org.eclipse.xtend.lib.annotations.Accessors
import unq_ciu.gatoEncerrado.Jugador
import unq_ciu.gatoEncerrado.Item
import unq_ciu.gatoEncerrado.Juego

@Accessors
class Usar extends Accion {
	Item item
	Accion accionConsecuencia

	new(Item i, Accion acc) {
		this.item = i
		this.accionConsecuencia = acc
	}

	override ejecutar(Jugador jugador, Juego juego) {

		if (juego.getLaberinto().getHabitacionActual().getAcciones().contains(this)) {
			juego.getLaberinto().getHabitacionActual().quitarAccion(this)
			juego.getLaberinto().getHabitacionActual().agregarAccion(getAccionConsecuencia)
			jugador.quitarDelInventario(getItem)
		} else {
			println("Aun no tienes el item necesario")
		}
	}

}
