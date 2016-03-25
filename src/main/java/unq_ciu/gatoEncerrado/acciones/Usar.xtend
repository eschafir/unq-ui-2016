package unq_ciu.gatoEncerrado.acciones

import unq_ciu.gatoEncerrado.Accion
import org.eclipse.xtend.lib.annotations.Accessors
import unq_ciu.gatoEncerrado.Habitacion
import unq_ciu.gatoEncerrado.Jugador
import unq_ciu.gatoEncerrado.Item

@Accessors
class Usar extends Accion {
	Habitacion habitacion
	Item item
	Accion accion_consecuencia

	new(Habitacion h, Item i, Accion acc) {
		this.habitacion = h
		this.item = i
		this.accion_consecuencia = acc
	}

	override ejecutar(Jugador jugador) {
		if (jugador.inventario.contains(getItem)) {
			jugador.quitarDelInventario(getItem)
			getHabitacion.quitarAccion(this)
			getHabitacion.agregarAccion(getAccion_consecuencia)
		} else {
			println("Aun no tienes el item necesario")
		}
	}

}
