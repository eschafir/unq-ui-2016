package unq_ciu.gatoEncerrado

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.ArrayList
import unq_ciu.gatoEncerrado.acciones.Agarrar
import org.uqbar.commons.utils.Observable
import java.util.List

@Accessors
@Observable
class Habitacion {

	String nombre
	boolean esInicial
	boolean esFinal
	List<Accion> acciones

	new() {
		acciones = new ArrayList<Accion>
	}

	new(String nombre, boolean eI, boolean eF) {
		this.nombre = nombre
		this.esInicial = eI
		this.esFinal = eF
		this.acciones = new ArrayList<Accion>
	}

	/**
	 * Agrega una accion a la lista de acciones permitidas en la habitacion.
	 */
	def agregarAccion(Accion acc) {
		getAcciones.add(acc)
	}

	/**
	 * Quita una accion de la lista de acciones permitidas en la habitacion.
	 */
	def quitarAccion(Accion acc) {
		if (getAcciones.contains(acc)) {
			getAcciones.remove(acc)
		}
	}

	/**
	 * Indica si la habitacion tiene un item disponible para agarrar.
	 */
	def boolean hayItem() {
		val accionesAgarrar = acciones.filter(typeof(Agarrar))
		return !accionesAgarrar.isEmpty
	}
	
	def getItems(){
		this.acciones.map[it.item]
	}
}
