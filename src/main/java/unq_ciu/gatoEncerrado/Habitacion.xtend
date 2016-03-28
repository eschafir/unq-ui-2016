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

	new(String nombre, boolean eI, boolean eF, Item i) {
		this.nombre = nombre
		this.esInicial = eI
		this.esFinal = eF
		this.item = i
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
		getAcciones.remove(acc)
	}

	/**
	 * Indica si la habitacion tiene un item disponible para agarrar.
	 */
	def boolean hayItem() {
		return (item != null)
	}

}
