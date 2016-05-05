package unq_ciu.gatoEncerrado.acciones

import unq_ciu.gatoEncerrado.Accion
import org.eclipse.xtend.lib.annotations.Accessors
import unq_ciu.gatoEncerrado.Juego
import unq_ciu.gatoEncerrado.Excepciones.NoHasGanadoException
import unq_ciu.gatoEncerrado.Laberinto
import unq_ciu.gatoEncerrado.Estado

@Accessors
class Salir extends Accion {

	Laberinto laberintoActual

	new(Laberinto laberinto) {
		this.laberintoActual = laberinto
	}

	override ejecutar(Juego juego) {

		var laberintoActual = juego.jugador.habitacion.getLaberinto(juego)

		if (juego.jugador.habitacion.isEsFinal) {
			juego.jugador.ganados = juego.jugador.ganados + 1
			laberintoActual.estado = Estado.RESUELTO
		} else {
			throw new NoHasGanadoException()
		}
	}
}
