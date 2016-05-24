package unq_ciu.gatoEncerrado

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.ArrayList
import unq_ciu.gatoEncerrado.acciones.Agarrar
import org.uqbar.commons.utils.Observable
import java.util.List
import org.uqbar.commons.model.UserException

@Accessors
@Observable
class Habitacion {

	int id
	String nombre
	boolean esInicial
	boolean esFinal
	List<Accion> acciones
	String path

	new() {
		acciones = new ArrayList<Accion>
	}

	new(String nombre, boolean eI, boolean eF) {
		this.nombre = nombre
		this.esInicial = eI
		this.esFinal = eF
		this.acciones = new ArrayList<Accion>
	}

	//New para el servicio rest 2
	new(int id, String nombre, List<Accion> acciones, String path) {
		this.nombre = nombre
		this.id = id
		this.path = path
		this.acciones = acciones
	}

	new(int id, String nombre, boolean eI, boolean eF, String path) {
		this.nombre = nombre
		this.esInicial = eI
		this.esFinal = eF
		this.id = id
		this.path = path
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

	def getItems() {
		this.acciones.map[it.item]
	}

	/**
	 * Devuelve el laberinto en el cual está la habitación.
	 */
	def getLaberinto(Juego juego) {

		for (Laberinto l : juego.laberintos) {
			if (l.habitaciones.contains(this)) {
				return l
			}
		}
	}

	def buscarAccion(long id) {
		getAcciones.findFirst[it.id == id]
	}
	
	def ejecutarAccion(Accion acc){
		if (getAcciones.contains(acc)){
			acc.execute()
		}
	}

}
