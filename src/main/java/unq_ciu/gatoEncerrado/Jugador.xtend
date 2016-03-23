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

}
