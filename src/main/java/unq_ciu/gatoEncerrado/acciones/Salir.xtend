package unq_ciu.gatoEncerrado.acciones

import unq_ciu.gatoEncerrado.Accion
import unq_ciu.gatoEncerrado.Jugador
import org.eclipse.xtend.lib.annotations.Accessors
import unq_ciu.gatoEncerrado.Juego
import unq_ciu.gatoEncerrado.Finalizado

@Accessors
class Salir extends Accion {

	new(){}

	override ejecutar(Jugador jugador, Juego juego) {
		
		if (juego.getLaberinto().getHabitacionActual().isEsFinal) {
			juego.setEstado = new Finalizado()
			jugador.ganados = jugador.ganados + 1
			println("Has Ganado")
		} else {
			println("No es la habitacion final")
		}
	}

}
