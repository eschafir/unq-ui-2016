package unq_ciu.gatoEncerrado.AppModel

import org.eclipse.xtend.lib.annotations.Accessors
import unq_ciu.gatoEncerrado.Laberinto
import unq_ciu.gatoEncerrado.Habitacion
import unq_ciu.gatoEncerrado.Item
import org.uqbar.commons.utils.Observable
import java.util.List
import org.uqbar.commons.model.UserException
import java.util.ArrayList
import java.util.HashSet

@Accessors
@Observable
class AgregarAccionDeUsarElementoAppModel {

	Laberinto laberinto
	Habitacion habitacion
	Item itemSeleccionado

	new(Laberinto lab, Habitacion habitacion) {
		this.laberinto = lab
		this.habitacion = habitacion
	}

	def validarItem() {
		if (itemSeleccionado == null) {
			throw new UserException("Por favor seleccione un item.")
		}
	}

	def List<Item> getItemsDisponibles() {
		val lista = newArrayList()

		for (Item i : laberinto.itemsDisponibles) {
			if (i.nombre != null) {
				lista.add(i)
			}
		}

		quitarDuplicados(lista)
		return lista
	}

	def quitarDuplicados(ArrayList<Item> lista) {

		val hs = new HashSet<Item>();
		hs.addAll(lista);
		lista.clear();
		lista.addAll(hs);
		return lista;

	}

}
