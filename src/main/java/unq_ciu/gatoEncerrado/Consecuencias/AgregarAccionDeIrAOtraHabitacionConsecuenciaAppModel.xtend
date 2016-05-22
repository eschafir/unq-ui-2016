package unq_ciu.gatoEncerrado.Consecuencias

import org.uqbar.commons.utils.Observable
import org.eclipse.xtend.lib.annotations.Accessors
import unq_ciu.gatoEncerrado.Laberinto
import unq_ciu.gatoEncerrado.Habitacion
import unq_ciu.gatoEncerrado.Item
import org.uqbar.commons.model.UserException
import unq_ciu.gatoEncerrado.acciones.Mover
import unq_ciu.gatoEncerrado.acciones.Usar
import java.util.List

@Accessors
@Observable
class AgregarAccionDeIrAOtraHabitacionConsecuenciaAppModel {

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
			habitacion.agregarAccion(new Usar(1, item, new Mover(habitacionSeleccionada)))
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
