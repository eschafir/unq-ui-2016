package unq_ciu.gatoEncerrado.acciones

import unq_ciu.gatoEncerrado.Accion
import org.eclipse.xtend.lib.annotations.Accessors
import unq_ciu.gatoEncerrado.Juego
import unq_ciu.gatoEncerrado.Habitacion
import unq_ciu.gatoEncerrado.Excepciones.NoEstaDisponibleEstaAccionException
import org.uqbar.commons.utils.Observable
import unq_ciu.gatoEncerrado.Item
import unq_ciu.gatoEncerrado.Jugador

@Accessors
@Observable
class Mover extends Accion {
	String nombre
	Habitacion destino

	new(Habitacion destino) {
		this.nombre = "Mover a " + destino.nombre
		this.destino = destino
	}
	
	new(int id, Habitacion destino) {
		this.id = id
		this.nombre = "Mover a " + destino.nombre
		this.destino = destino
	}

	override ejecutar(Habitacion h, Jugador j) {
		if (h.acciones.contains(this)) {
			j.habitacion = destino
		} else {
			throw new NoEstaDisponibleEstaAccionException()
		}
		return new ResultadoAccion(j.inventario, j.habitacion, false)
	}

	override getItem() {
		new Item()
	}
	
	override execute(){
		return destino
	}
}
