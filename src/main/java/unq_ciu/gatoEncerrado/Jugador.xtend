package unq_ciu.gatoEncerrado

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.ArrayList

@Accessors
class Jugador {
	String nombre
	ArrayList<Item> inventario
	Habitacion habitacion

	new(String n, Habitacion h) {
		this.nombre = n
		this.habitacion = h
		this.inventario = new ArrayList<Item>()
	}

}
