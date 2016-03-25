package unq_ciu.gatoEncerrado.acciones

import unq_ciu.gatoEncerrado.Accion
import unq_ciu.gatoEncerrado.Jugador
import org.eclipse.xtend.lib.annotations.Accessors
import unq_ciu.gatoEncerrado.Habitacion

@Accessors
class Salir extends Accion {
	Habitacion habitacion

	new(Habitacion h) {
		this.habitacion = h
	}

	override ejecutar(Jugador jugador) {
		if (getHabitacion.isEsFinal) {
			println("Juego ganado")
			jugador.ganados = jugador.ganados + 1
		} else {
			println("No es la habitacion final")
		}
	}

}
