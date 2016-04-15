package unq_ciu.gatoEncerrado.Consecuencias

import unq_ciu.gatoEncerrado.Habitacion
import unq_ciu.gatoEncerrado.Item
import org.uqbar.commons.model.UserException
import unq_ciu.gatoEncerrado.acciones.Usar
import unq_ciu.gatoEncerrado.Accion
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable
import unq_ciu.gatoEncerrado.Laberinto

@Accessors
@Observable
class AgregarAccionDeUsarUnElementoConsecuenciaAppModel {
	
	Laberinto laberinto
	Habitacion habitacion
	Accion accionConsecuencia
	Item itemSeleccionado
	Item itemUtilizado

	new(Habitacion habitacion, Item item, Accion acc, Laberinto lbo) {
		this.habitacion = habitacion
		this.itemUtilizado = item
		this.laberinto = lbo
		this.accionConsecuencia = acc
	}

	def agregarAccionUsar() {
		if (this.itemSeleccionado == null) {
			throw new UserException("Por favor ingrese un item .")
		} else {
			habitacion.agregarAccion(new Usar(this.itemUtilizado, accionConsecuencia))
		}
	}
}