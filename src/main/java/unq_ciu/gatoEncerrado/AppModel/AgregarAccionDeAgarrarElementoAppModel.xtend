package unq_ciu.gatoEncerrado.AppModel

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable
import unq_ciu.gatoEncerrado.Habitacion
import unq_ciu.gatoEncerrado.Item
import java.util.Arrays

@Accessors
@Observable
class AgregarAccionDeAgarrarElementoAppModel {

	Habitacion habitacion
	Item itemSeleccionado

	/*
	 * Ver si lleva contructor
	 */
	 
	 new(Habitacion habitacion){
	 	this.habitacion = habitacion
	 }
	 
	def getItemsPosibles() {
		Arrays.asList(Item.values)
	}
}
