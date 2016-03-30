package unq_ciu.gatoEncerrado

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.ArrayList

@Accessors
class Jugador {
	String nombre
	ArrayList<Item> inventario
	Habitacion habitacion
	int ganados
	int abandonados

	new(String n, Habitacion h) {
		this.nombre = n
		this.habitacion = h
		this.inventario = new ArrayList<Item>()
		this.ganados = 0
		this.abandonados = 0
	}

	def abandonar() {

		// TODO
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

	//Verificar si este metodo lo ejecuta el Jugador
	def ejecutarAcciones() {
		while (!getHabitacion.isEsFinal) {
			for (Accion acc : getHabitacion.acciones) {
				//Muchachos hay que ver lo que se quiere hacer con este método,
				//ya que ahora el ejecutar toma 2 parametros: el Jugador y el Juego. Por eso lo comenté!!!
				//acc.ejecutar(this)
			}
		}
	}

	/**
	 * Este método verifica si el inventario del Jugador esta lleno. 
	 */
	def puedeAgegar() {
		return (getInventario.size < 15)
	}

	/**
	 * Agrega un item al inventario.
	 * @param i el item a agregar.
	 */
	def agregarAlInventario(Item i) {
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
			println("No se encuentra el item " + i + " en el inventario.")
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
