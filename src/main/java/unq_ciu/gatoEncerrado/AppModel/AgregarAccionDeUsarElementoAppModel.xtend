package unq_ciu.gatoEncerrado.AppModel

import org.eclipse.xtend.lib.annotations.Accessors
import unq_ciu.gatoEncerrado.Laberinto
import unq_ciu.gatoEncerrado.Habitacion
import unq_ciu.gatoEncerrado.Item
import org.uqbar.commons.utils.Observable
import java.util.List
import java.util.ArrayList
import java.util.HashSet

@Accessors
@Observable
class AgregarAccionDeUsarElementoAppModel extends AgregarAccionTemplateAppModel {

	Item itemSeleccionado

	new(Laberinto lab, Habitacion habitacion) {
		this.laberinto = lab
		this.habitacion = habitacion
		itemSeleccionado = new Item()
	}

	override validarItem(Item item) {
		super.validarItem(item)
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
