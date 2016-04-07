package unq_ciu.gatoEncerrado.acciones

import unq_ciu.gatoEncerrado.Accion
import org.eclipse.xtend.lib.annotations.Accessors
import unq_ciu.gatoEncerrado.Juego
import unq_ciu.gatoEncerrado.Excepciones.NoHasGanadoException

@Accessors
class Salir extends Accion {
	
	new(){}
	
	override ejecutar(Juego juego) {

		if (juego.jugador.habitacion.isEsFinal) {
			juego.jugador.ganados = juego.jugador.ganados + 1
			println("Has Ganado")
		} else {
			throw new NoHasGanadoException()
		}
	}
}
