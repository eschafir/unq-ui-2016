package unq_ciu.gatoEncerrado.acciones

import unq_ciu.gatoEncerrado.Accion
import org.eclipse.xtend.lib.annotations.Accessors
import unq_ciu.gatoEncerrado.Juego
import unq_ciu.gatoEncerrado.Item
import gatoEncerradoExcepciones.NoEstaDisponibleEstaAccionException
import gatoEncerradoExcepciones.NoSePuedeAgregarItemAlInventarioException

@Accessors
class Agarrar extends Accion {

	Item item

	new(Item item) {
		this.item = item
	}

	override ejecutar(Juego juego) {

		if (juego.jugador.habitacion.acciones.contains(this)) {
			if (juego.jugador.puedeAgegar) {
				juego.jugador.agregarAlInventario(item)
				juego.jugador.habitacion.quitarAccion(this)
			} else {
				throw new NoSePuedeAgregarItemAlInventarioException()
			}
		}
		else {
			throw new NoEstaDisponibleEstaAccionException() 
		}
	}
}
