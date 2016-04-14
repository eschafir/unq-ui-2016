package unq_ciu.gatoEncerrado.AppModel

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable
import unq_ciu.gatoEncerrado.Habitacion
import unq_ciu.gatoEncerrado.Item
import unq_ciu.gatoEncerrado.acciones.Agarrar
import org.uqbar.commons.model.UserException

@Accessors
@Observable
class AgregarAccionDeAgarrarUnElementoAppModel {

	String nombre
	Habitacion habitacion
	Item itemDisponibleComoConsecuencia
	Item itemUtilizado

	new(Item item) {
		this.itemDisponibleComoConsecuencia = item
		this.nombre = "Agarrar " + item.nombre
	}

	def agregarAcccionAgarrar() {
		if (itemDisponibleComoConsecuencia.nombre == null) {
			throw new UserException("Por favor ingrese un nombre para el elemento.")
		} else {
			habitacion.agregarAccion(new Agarrar(itemUtilizado))
		}
	}
}