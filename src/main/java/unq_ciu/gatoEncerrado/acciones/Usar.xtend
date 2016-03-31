package unq_ciu.gatoEncerrado.acciones

import unq_ciu.gatoEncerrado.Accion
import org.eclipse.xtend.lib.annotations.Accessors
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

	override ejecutar(Juego juego) {

		if (juego.jugador.accionesPosibles().contains(this)) {
			if (juego.jugador.tiene(item)) {
				juego.jugador.habitacion.quitarAccion(this)
				juego.jugador.habitacion.agregarAccion(accionConsecuencia)
				juego.jugador.quitarDelInventario(item)
			} else {
				println("Aun no tienes el item necesario")
			}
		} else {
			println("No estas en la habitacion indicada para hacer esto.")
		}
	}
}
