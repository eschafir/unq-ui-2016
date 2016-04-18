package unq_ciu.gatoEncerrado

import org.uqbar.commons.utils.Observable
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
@Observable
class Accion {

	String nombre
	String borrar
	
	new(){}

	def void ejecutar(Juego juego) {}

	def Item getItem() {}
}
