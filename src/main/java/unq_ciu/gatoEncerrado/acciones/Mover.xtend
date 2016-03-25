package unq_ciu.gatoEncerrado.acciones

import unq_ciu.gatoEncerrado.Accion
import org.eclipse.xtend.lib.annotations.Accessors
import unq_ciu.gatoEncerrado.Habitacion
import unq_ciu.gatoEncerrado.Jugador

@Accessors
class Mover extends Accion {
	Habitacion habitacion_actual
	Habitacion habitacion_nueva

	new(Habitacion actual, Habitacion nueva) {
		this.habitacion_actual = actual
		this.habitacion_nueva = nueva
	}

	override ejecutar(Jugador jugador) {
		jugador.habitacion = habitacion_nueva
	}
}
