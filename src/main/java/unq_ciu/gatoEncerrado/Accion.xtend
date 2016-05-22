package unq_ciu.gatoEncerrado

import org.uqbar.commons.utils.Observable
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
@Observable
class Accion {
	
	int id
	String nombre
	
	new(){}
	new(int id, String nombre){
		this.id = id
		this.nombre = nombre
	}

	def void ejecutar(Juego juego) {}

	def Item getItem() {}
}
