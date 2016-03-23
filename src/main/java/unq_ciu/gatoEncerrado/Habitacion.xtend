package unq_ciu.gatoEncerrado

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.ArrayList

@Accessors
class Habitacion {

	String nombre
	boolean esInicial
	boolean esFinal
	ArrayList<Accion> acciones
	Item item

	new(String nombre, boolean eI, boolean eF, ArrayList<Accion> acc, Item i) {
		this.nombre = nombre
		this.esInicial = eI
		this.esFinal = eF
		this.acciones = acc
		this.item = i
	}

}
