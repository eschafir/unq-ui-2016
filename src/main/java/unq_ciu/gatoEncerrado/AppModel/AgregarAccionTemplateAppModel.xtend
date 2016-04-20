package unq_ciu.gatoEncerrado.AppModel

import org.uqbar.commons.utils.Observable
import org.eclipse.xtend.lib.annotations.Accessors
import unq_ciu.gatoEncerrado.Laberinto
import unq_ciu.gatoEncerrado.Habitacion
import unq_ciu.gatoEncerrado.Item
import org.uqbar.commons.model.UserException

@Accessors
@Observable
abstract class AgregarAccionTemplateAppModel {

	Laberinto laberinto
	Habitacion habitacion
	Habitacion habitacionSeleccionada
	Item itemUtilizado
	Item itemDisponibleConsecuencia

	def agregarAccion() {
	}

	protected def validarItem(Item item) {
		if (item.nombre == null) {
			throw new UserException("Por favor ingrese un item.")
		}
	}

	def validarHabitacion(Habitacion habitacion) {
		if (habitacion == null) {
			throw new UserException("Por favor seleccione una habitación.")
		}
	}
}
