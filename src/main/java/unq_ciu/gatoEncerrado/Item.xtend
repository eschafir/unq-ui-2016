package unq_ciu.gatoEncerrado

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable

@Accessors
@Observable
class Item {

	String nombre
	
	new(){
		this.nombre = null
	}

	new(String nombre) {
		this.nombre = nombre
	}
}
