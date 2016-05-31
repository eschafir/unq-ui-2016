package unq_ciu.gatoEncerrado.acciones

import unq_ciu.gatoEncerrado.Accion
import org.eclipse.xtend.lib.annotations.Accessors
import unq_ciu.gatoEncerrado.Juego
import unq_ciu.gatoEncerrado.Excepciones.NoHasGanadoException
import unq_ciu.gatoEncerrado.Laberinto
import unq_ciu.gatoEncerrado.Estado
import unq_ciu.gatoEncerrado.Jugador
import unq_ciu.gatoEncerrado.Habitacion

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

		if (j.habitacion.esFinal) {
			j.ganados = j.ganados + 1
			//laberintoActual.estado = Estado.RESUELTO
		} else {
			throw new NoHasGanadoException()
		}

		return new ResultadoAccion(j.inventario, h, true)
	}

	override execute() {
		laberintoActual.estado = Estado.RESUELTO
		return laberintoActual.estado
	}
}
