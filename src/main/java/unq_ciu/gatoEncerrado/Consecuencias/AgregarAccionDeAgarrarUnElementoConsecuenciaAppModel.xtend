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

	new(Habitacion habitacion, Item itemUtilizado) {
		this.habitacion = habitacion
		this.itemUtilizado = itemUtilizado
		this.itemDisponibleComoConsecuencia = new Item()
	}

	def agregarAccionUsar() {
		if (this.itemDisponibleComoConsecuencia.nombre == null) {
			throw new UserException("Por favor ingrese un nombre para el elemento.")
		} else {
			habitacion.agregarAccion(new Usar(1,this.itemUtilizado, new Agarrar(itemDisponibleComoConsecuencia)))
		}
	}
}
