package unq_ciu.gatoEncerrado.acciones

import unq_ciu.gatoEncerrado.Accion
import org.eclipse.xtend.lib.annotations.Accessors
import unq_ciu.gatoEncerrado.Juego
import unq_ciu.gatoEncerrado.Item

@Accessors
class Agarrar extends Accion {

	Item item

	new(Item item) {
		this.item = item
	}

	override ejecutar(Juego juego) {

		if (juego.jugador.habitacion.acciones.contains(this)) {
			if (juego.jugador.puedeAgegar) {
				juego.jugador.agregarAlInventario(item)
				juego.jugador.habitacion.quitarAccion(this)
			} else {
				println("nada que agarrar") // REEMPLAZAR POR EXCEPCION
			}
		}
	}
}
