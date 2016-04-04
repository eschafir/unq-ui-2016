package unq_ciu.gatoEncerrado.acciones

import unq_ciu.gatoEncerrado.Accion
import org.eclipse.xtend.lib.annotations.Accessors
import unq_ciu.gatoEncerrado.Item
import unq_ciu.gatoEncerrado.Juego
import unq_ciu.gatoEncerrado.Excepciones.NoHayItemNecesarioException
import unq_ciu.gatoEncerrado.Excepciones.NoEstaDisponibleEstaAccionException

@Accessors
class Usar extends Accion {
	Item item
	Accion accionConsecuencia

	new(Item i, Accion acc) {
		this.item = i
		this.accionConsecuencia = acc
	}

	override ejecutar(Juego juego) {

		if (juego.accionesPosibles.contains(this)) {
			if (juego.jugador.tiene(item)) {
				juego.jugador.habitacion.quitarAccion(this)
				juego.jugador.habitacion.agregarAccion(accionConsecuencia)
				juego.jugador.quitarDelInventario(item)
			} else {
				throw new NoHayItemNecesarioException()
			}
		} else {
			throw new NoEstaDisponibleEstaAccionException()
		}
	}
}
