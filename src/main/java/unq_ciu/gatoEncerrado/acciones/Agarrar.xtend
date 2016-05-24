package unq_ciu.gatoEncerrado.acciones

import unq_ciu.gatoEncerrado.Accion
import org.eclipse.xtend.lib.annotations.Accessors
import unq_ciu.gatoEncerrado.Juego
import unq_ciu.gatoEncerrado.Item
import unq_ciu.gatoEncerrado.Excepciones.NoSePuedeAgregarItemAlInventarioException
import unq_ciu.gatoEncerrado.Excepciones.NoEstaDisponibleEstaAccionException
import org.uqbar.commons.utils.Observable
import unq_ciu.gatoEncerrado.Jugador
import unq_ciu.gatoEncerrado.Habitacion

@Accessors
@Observable
class Agarrar extends Accion {

	String nombre
	Item item

	new(Item item) {
		this.item = item
		this.nombre = "Agarrar " + item.nombre
	}

	new(int id, Item item) {
		super(id, "Agarrar " + item.nombre)
		this.item = item
	}

	override ejecutar(Habitacion h, Jugador j) {

		if (h.acciones.contains(this)) {
			if (j.puedeAgregar) {
				j.agregarAlInventario(item)
				h.quitarAccion(this)
			} else {
				throw new NoSePuedeAgregarItemAlInventarioException()
			}
		} else {
			throw new NoEstaDisponibleEstaAccionException()
		}

		return j.inventario
	}

	override execute() {
		return this
	}
}
