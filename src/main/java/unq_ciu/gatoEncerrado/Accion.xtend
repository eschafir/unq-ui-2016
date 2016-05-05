package unq_ciu.gatoEncerrado

import org.uqbar.commons.utils.Observable
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
@Observable
class Accion {
	
	int id
	String nombre
	
	new(){}

	def void ejecutar(Juego juego) {}

	def Item getItem() {}
}
