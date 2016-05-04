package unq_ciu.gatoEncerrado.acciones

import unq_ciu.gatoEncerrado.Accion
import org.eclipse.xtend.lib.annotations.Accessors
import unq_ciu.gatoEncerrado.Juego
import unq_ciu.gatoEncerrado.Excepciones.NoHasGanadoException
import unq_ciu.gatoEncerrado.Laberinto

@Accessors
class Salir extends Accion {

	Laberinto laberintoActual

	new(Laberinto laberinto) {
		this.laberintoActual = laberinto
	}

	override ejecutar(Juego juego) {
		
		val laberintoActual = juego.jugador.habitacion.getLaberinto(juego)

		if (juego.jugador.habitacion.isEsFinal) {
			juego.jugador.ganados = juego.jugador.ganados + 1
			juego.jugador.laberintosGanados.add(laberintoActual)
		} else {
			throw new NoHasGanadoException()
		}
	}
}
