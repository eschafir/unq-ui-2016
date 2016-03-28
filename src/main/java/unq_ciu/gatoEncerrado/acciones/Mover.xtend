package unq_ciu.gatoEncerrado.acciones

import unq_ciu.gatoEncerrado.Accion
import org.eclipse.xtend.lib.annotations.Accessors
import unq_ciu.gatoEncerrado.Juego
import unq_ciu.gatoEncerrado.Habitacion

@Accessors
class Mover extends Accion {
	Habitacion destino

	new(Habitacion destino) {
		this.destino = destino
	}

	override ejecutar(Juego juego) {
		if (juego.jugador.habitacion.acciones.contains(this)) {
			juego.jugador.habitacion = destino
		}
	}
}
