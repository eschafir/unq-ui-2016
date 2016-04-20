package unq_ciu.gatoEncerrado.AppModel

import unq_ciu.gatoEncerrado.Habitacion
import org.eclipse.xtend.lib.annotations.Accessors
import unq_ciu.gatoEncerrado.Laberinto
import org.uqbar.commons.utils.Observable
import unq_ciu.gatoEncerrado.acciones.Mover
import java.util.List

@Accessors
@Observable
class AgregarAccionDeIrAOtraHabitacionAppModel extends AgregarAccionTemplateAppModel {

	Habitacion habitacionSeleccionada

	new(Laberinto laberinto, Habitacion habitacion) {
		this.laberinto = laberinto
		this.habitacion = habitacion
	}

	@Override
	override agregarAccion() {
		validarHabitacion(habitacionSeleccionada)
		habitacion.agregarAccion(new Mover(habitacionSeleccionada))
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
