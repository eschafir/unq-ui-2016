package unq_ciu.gatoEncerrado.acciones

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import unq_ciu.gatoEncerrado.Habitacion
import unq_ciu.gatoEncerrado.Item

@Accessors
class ResultadoAccion {
	List<Item> inventario
	Habitacion habitacion

	new(List<Item> inventario, Habitacion habitacion) {
		this.inventario = inventario
		this.habitacion = habitacion
	}
}
