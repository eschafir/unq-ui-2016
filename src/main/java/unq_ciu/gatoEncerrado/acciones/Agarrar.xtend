package unq_ciu.gatoEncerrado.acciones

import unq_ciu.gatoEncerrado.Accion
import org.eclipse.xtend.lib.annotations.Accessors
import unq_ciu.gatoEncerrado.Juego

@Accessors
class Agarrar extends Accion {

	override ejecutar(Juego juego) {

		if (juego.jugador.habitacion.acciones.contains(this)) {
			if (juego.jugador.habitacion.hayItem) {
				if (juego.jugador.puedeAgegar) {
					juego.jugador.agregarAlInventario(juego.jugador.habitacion.item)
					juego.jugador.habitacion.item = null
					juego.jugador.habitacion.quitarAccion(this)
				}
			} else {
				println("nada que agarrar") // REEMPLAZAR POR EXCEPCION
			}
		}
	}
}
