package unq_ciu.gatoEncerrado.acciones

import unq_ciu.gatoEncerrado.Accion
import org.eclipse.xtend.lib.annotations.Accessors
import unq_ciu.gatoEncerrado.Item
import unq_ciu.gatoEncerrado.Juego
import unq_ciu.gatoEncerrado.Excepciones.NoHayItemNecesarioException
import unq_ciu.gatoEncerrado.Excepciones.NoEstaDisponibleEstaAccionException
import org.uqbar.commons.model.UserException
import unq_ciu.gatoEncerrado.Jugador
import unq_ciu.gatoEncerrado.Habitacion

@Accessors
class Usar extends Accion {
	Item item
	Accion accionConsecuencia

	new(int id, Item i, Accion acc) {
		super(id, "Usar " + i.nombre + " habilita " + acc.nombre)
		this.item = i
		this.accionConsecuencia = acc
	}

	override getItem() {
		accionConsecuencia.item
	}

	override ejecutar(Habitacion h, Jugador j) {

		if (h.acciones.contains(this)) {
			if (j.tiene(item)) {
				h.quitarAccion(this)
				h.agregarAccion(accionConsecuencia)
				j.quitarDelInventario(item)
			} else {
				throw new NoHayItemNecesarioException()
			}
		} else {
			throw new UserException("No existe esta accion en la habitacion")
		}
		return accionConsecuencia
	}
	
	override execute(){
		return this
	}
}
