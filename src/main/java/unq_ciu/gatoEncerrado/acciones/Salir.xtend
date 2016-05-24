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

	new(int id) {
		super(id, "Salir")
		laberintoActual = null
	}

	override ejecutar(Habitacion h, Jugador j) {

		var laberintoActual = juego.jugador.habitacion.getLaberinto(juego)

		if (juego.jugador.habitacion.isEsFinal) {
			juego.jugador.ganados = juego.jugador.ganados + 1
			laberintoActual.estado = Estado.RESUELTO
		} else {
			throw new NoHasGanadoException()
		}
		
		return laberintoActual
	}

	override execute() {
		laberintoActual.estado = Estado.RESUELTO
		return laberintoActual.estado
	}
}
