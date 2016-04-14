package unq_ciu.gatoEncerrado.Consecuencias

import unq_ciu.gatoEncerrado.Habitacion
import unq_ciu.gatoEncerrado.Item
import org.uqbar.commons.model.UserException
import unq_ciu.gatoEncerrado.acciones.Agarrar
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable

@Accessors
@Observable
class AgregarAccionDeAgarrarUnElementoConsecuenciaAppModel {

	Habitacion habitacion
	Item itemDisponibleComoConsecuencia
	Item itemUtilizado

	new(Habitacion habitacion) {
		this.habitacion = habitacion
		this.itemDisponibleComoConsecuencia = new Item()
	}

	def agregarAcccionAgarrar() {
		if (this.itemDisponibleComoConsecuencia.nombre == null) {
			throw new UserException("Por favor ingrese un nombre para el elemento.")
		} else {
			habitacion.agregarAccion(new Agarrar(this.itemUtilizado))
		}
	}
}
