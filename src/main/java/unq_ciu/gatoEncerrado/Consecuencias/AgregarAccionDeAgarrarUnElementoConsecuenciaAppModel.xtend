package unq_ciu.gatoEncerrado.Consecuencias

import unq_ciu.gatoEncerrado.Habitacion
import unq_ciu.gatoEncerrado.Item
import org.uqbar.commons.model.UserException
import unq_ciu.gatoEncerrado.acciones.Agarrar
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable
import unq_ciu.gatoEncerrado.acciones.Usar

@Accessors
@Observable
class AgregarAccionDeAgarrarUnElementoConsecuenciaAppModel {

	Habitacion habitacion
	Item itemDisponibleComoConsecuencia
	Item itemUtilizado

	new(Habitacion habitacion) {
		this.habitacion = habitacion
		this.itemUtilizado = new Item()
		this.itemDisponibleComoConsecuencia = new Item()
	}

	def agregarAccionAgarrar() {
		if (this.itemDisponibleComoConsecuencia.nombre == null) {
			throw new UserException("Por favor ingrese un nombre para el elemento.")
		} else {
			habitacion.agregarAccion(new Usar(this.itemUtilizado, new Agarrar(itemDisponibleComoConsecuencia)))
		}
	}
}
