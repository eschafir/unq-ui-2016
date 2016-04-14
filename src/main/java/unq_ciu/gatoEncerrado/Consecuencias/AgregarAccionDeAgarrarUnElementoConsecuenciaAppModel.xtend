package unq_ciu.gatoEncerrado.Consecuencias

import unq_ciu.gatoEncerrado.Laberinto
import unq_ciu.gatoEncerrado.Habitacion
import unq_ciu.gatoEncerrado.Item
import org.uqbar.commons.model.UserException
import unq_ciu.gatoEncerrado.acciones.Agarrar
import unq_ciu.gatoEncerrado.acciones.Usar
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable

@Accessors
@Observable
class AgregarAccionDeAgarrarUnElementoConsecuenciaAppModel {

	Laberinto laberinto
	Habitacion habitacion
	Habitacion habitacionSeleccionada
	Item item

	new(Laberinto lab, Habitacion hab, Item item) {
		this.laberinto = lab
		this.habitacion = hab
		this.item = item
	}

	def agregarConsecuencia() {

		if (habitacionSeleccionada == null) {
			throw new UserException("Por favor seleccione una habitación.")
		} else {
			habitacion.agregarAccion(new Usar(item, new Agarrar(item)))
		}
	}

	def List<Habitacion> getHabitacionesDisponibles() {
		val lista = newArrayList()
		for (Habitacion h : laberinto.habitaciones) {
			if (h != habitacion) {
				lista.add(h)
			}
		}
		return lista

	}
}
