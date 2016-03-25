package unq_ciu.gatoEncerrado.acciones

import unq_ciu.gatoEncerrado.Accion
import unq_ciu.gatoEncerrado.Jugador
import org.eclipse.xtend.lib.annotations.Accessors
import unq_ciu.gatoEncerrado.Habitacion

@Accessors
class Agarrar extends Accion {
	Habitacion habitacion

	new(Habitacion h) {
		this.habitacion = h
	}

	override ejecutar(Jugador jugador) {

		if (getHabitacion.item != null) {
			jugador.agregarAlInventario(getHabitacion.item)
			getHabitacion.item = null
			getHabitacion.quitarAccion(this)
		} else {
			println("nada para agarrar")
		}

	}

}
