package unq_ciu.gatoEncerrado.acciones

import unq_ciu.gatoEncerrado.Accion
import org.eclipse.xtend.lib.annotations.Accessors
import unq_ciu.gatoEncerrado.Juego
import unq_ciu.gatoEncerrado.Habitacion
import unq_ciu.gatoEncerrado.Excepciones.NoEstaDisponibleEstaAccionException
import org.uqbar.commons.utils.Observable
import unq_ciu.gatoEncerrado.Item

@Accessors
@Observable
class Mover extends Accion {
	String nombre
	Habitacion destino

	new(Habitacion destino) {
		this.nombre = "Mover a " + destino.nombre
		this.destino = destino
	}

	override ejecutar(Juego juego) {
		if (juego.accionesPosibles.contains(this)) {
			juego.jugador.habitacion = destino
		} else {
			throw new NoEstaDisponibleEstaAccionException()
		}
	}

	override getItem() {
		new Item()
	}
}
