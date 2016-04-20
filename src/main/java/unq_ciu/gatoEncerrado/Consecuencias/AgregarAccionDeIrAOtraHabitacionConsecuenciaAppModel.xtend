package unq_ciu.gatoEncerrado.Consecuencias

import org.uqbar.commons.utils.Observable
import org.eclipse.xtend.lib.annotations.Accessors
import unq_ciu.gatoEncerrado.Laberinto
import unq_ciu.gatoEncerrado.Habitacion
import unq_ciu.gatoEncerrado.Item
import unq_ciu.gatoEncerrado.acciones.Mover
import unq_ciu.gatoEncerrado.acciones.Usar
import java.util.List
import unq_ciu.gatoEncerrado.AppModel.AgregarAccionTemplateAppModel

@Accessors
@Observable
class AgregarAccionDeIrAOtraHabitacionConsecuenciaAppModel extends AgregarAccionTemplateAppModel {

	Laberinto laberinto
	Habitacion habitacion
	Habitacion habitacionSeleccionada
	Item item

	new(Laberinto lab, Habitacion hab, Item item) {
		this.laberinto = lab
		this.habitacion = hab
		this.item = item
	}

	override agregarAccion() {
		validarHabitacion(habitacionSeleccionada)
		habitacion.agregarAccion(new Usar(item, new Mover(habitacionSeleccionada)))
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
