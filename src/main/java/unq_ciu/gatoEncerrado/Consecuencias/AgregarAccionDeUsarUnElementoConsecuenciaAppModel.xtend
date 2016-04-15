package unq_ciu.gatoEncerrado.Consecuencias

import unq_ciu.gatoEncerrado.Habitacion
import unq_ciu.gatoEncerrado.Item
import org.uqbar.commons.model.UserException
import unq_ciu.gatoEncerrado.acciones.Usar
import unq_ciu.gatoEncerrado.Accion
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable

@Accessors
@Observable
class AgregarAccionDeUsarUnElementoConsecuenciaAppModel {
	
	Habitacion habitacion
	Accion accionConsecuencia
	Item itemUtilizado

	new(Habitacion habitacion, Item item, Accion acc) {
		this.habitacion = habitacion
		this.itemUtilizado = item
		this.accionConsecuencia = acc
	}

	def agregarAccionUsar() {
		if (this.itemUtilizado == null) {
			throw new UserException("Por favor ingrese .")
		} else {
			habitacion.agregarAccion(new Usar(this.itemUtilizado, accionConsecuencia))
		}
	}
}