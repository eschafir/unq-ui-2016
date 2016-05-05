package unq_ciu.gatoEncerrado

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable
import org.apache.commons.lang.math.RandomUtils

@Accessors
@Observable
class Item {
	
	int id
	String nombre
	
	new(){
		this.id = RandomUtils.nextInt
		this.nombre = null
	}

	new(String nombre) {
		this.id = RandomUtils.nextInt
		this.nombre = nombre
	}
}
