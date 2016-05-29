package unq_ciu.gatoEncerrado

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable
import org.apache.commons.lang.math.RandomUtils

@Accessors
@Observable
class Item {
	
	int id
	String nombre
	String descripcion
	
	new(){
		this.id = RandomUtils.nextInt
		this.nombre = ""
	}

	new(String nombre) {
		this.id = RandomUtils.nextInt
		this.nombre = nombre
	}
	
	//new para el servicio rest 2
	new(String nombre, String descripcion){
		this.id = RandomUtils.nextInt
		this.nombre = nombre
		this.descripcion = descripcion
	}
}
