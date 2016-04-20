package unq_ciu.gatoEncerrado.Consecuencias

import unq_ciu.gatoEncerrado.Habitacion
import unq_ciu.gatoEncerrado.Item
import unq_ciu.gatoEncerrado.acciones.Agarrar
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable
import unq_ciu.gatoEncerrado.acciones.Usar
import unq_ciu.gatoEncerrado.AppModel.AgregarAccionTemplateAppModel

@Accessors
@Observable
class AgregarAccionDeAgarrarUnElementoConsecuenciaAppModel extends AgregarAccionTemplateAppModel {

	Habitacion habitacion
	Item itemDisponibleComoConsecuencia
	Item itemUtilizado

	new(Habitacion habitacion, Item itemUtilizado) {
		this.habitacion = habitacion
		this.itemUtilizado = itemUtilizado
		this.itemDisponibleComoConsecuencia = new Item()
	}

	override agregarAccion() {
		validarItem(itemDisponibleComoConsecuencia)
		habitacion.agregarAccion(new Usar(this.itemUtilizado, new Agarrar(itemDisponibleComoConsecuencia)))
	}
}
