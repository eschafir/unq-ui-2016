package unq_ciu.gatoEncerrado.acciones

import unq_ciu.gatoEncerrado.Accion
import org.eclipse.xtend.lib.annotations.Accessors
import unq_ciu.gatoEncerrado.Juego

@Accessors
class Salir extends Accion {

	override ejecutar(Juego juego) {

		if (juego.jugador.habitacion.isEsFinal) {
			juego.jugador.ganados = juego.jugador.ganados + 1
			println("Has Ganado") // USAR EXCEPTIONS
		} else {
			println("No es la habitacion final")
		}
	}

}
