package unq_ciu.gatoEncerrado

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.ArrayList
import java.util.List
import org.uqbar.commons.model.UserException

@Accessors
class Jugador {
	int id
	String nombre
	List<Item> inventario
	Habitacion habitacion
	List<Laberinto> laberintosGanados
	int ganados
	int abandonados

	new() {
		this.nombre = ""
		this.inventario = new ArrayList<Item>()
		this.laberintosGanados = new ArrayList<Laberinto>()
		this.habitacion = null
	}

	new(String n, Habitacion h) {
		this.nombre = n
		this.habitacion = h
		this.inventario = new ArrayList<Item>()
		this.ganados = 0
		this.abandonados = 0
		this.laberintosGanados = new ArrayList<Laberinto>()
	}

	new(int id, String n) {
		this.id = id
		this.nombre = n
		this.habitacion = new Habitacion("final", false, true)
		this.inventario = new ArrayList<Item>()
		this.ganados = 0
		this.abandonados = 0
		this.laberintosGanados = new ArrayList<Laberinto>()
	}

	def abandonar() {
		abandonados = abandonados + 1
	}

	/**
	 * Muestra las estadísticas del jugador mostrando su nombre y la cantidad de juegos ganados y abandonados.
	 */
	def verEstadisticas() {
		println("Estadísticas del jugador: " + getNombre)
		println("Juegos ganados: " + ganados)
		println("Juegos abandonados: " + abandonados)
	}

	/**
	 * Este método verifica si el inventario del Jugador esta lleno. 
	 */
	def puedeAgregar() {
		return (getInventario.size < 15)
	}

	/**
	 * Agrega un item al inventario.
	 * @param i el item a agregar.
	 */
	def void agregarAlInventario(Item i) {
		getInventario.add(i)
	}

	/**
	 * Quita un item al inventario. Primero verifica si lo tiene en el inventario, luego lo quita.
	 * @param i el item a quitar.
	 */
	def quitarDelInventario(Item i) {
		if (getInventario.contains(i)) {
			getInventario.remove(i)
		} else {
			throw new UserException("No se encuentra el item " + i + " en el inventario.")
		}
	}

	/**
	 * Verifica si un item está dentro del inventario del jugador.
	 * @param i : el item que verifica si tiene en el inventario.
	 */
	def boolean tiene(Item i) {
		getInventario.contains(i)
	}

}
