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

	def puedeAgegar() {
		return (getInventario.size < 15)
	}

	def agregarAlInventario(Item i) {
		getInventario.add(i)
	}

	def quitarDelInventario(Item i) {
		if (getInventario.contains(i)) {
			getInventario.remove(i)
		} else {
			println("No se encuentra el item " + i + " en el inventario.")
		}
	}
}
