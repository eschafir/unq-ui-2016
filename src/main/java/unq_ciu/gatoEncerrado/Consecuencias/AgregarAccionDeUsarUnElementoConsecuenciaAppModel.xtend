package unq_ciu.gatoEncerrado.Consecuencias

import unq_ciu.gatoEncerrado.Habitacion
import unq_ciu.gatoEncerrado.Item
import org.uqbar.commons.model.UserException
import unq_ciu.gatoEncerrado.acciones.Usar
import unq_ciu.gatoEncerrado.Accion
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable
import unq_ciu.gatoEncerrado.Laberinto
import java.util.List
import java.util.ArrayList
import java.util.HashSet

@Accessors
@Observable
class AgregarAccionDeUsarUnElementoConsecuenciaAppModel {

	Laberinto laberinto
	Habitacion habitacion
	Accion accionConsecuencia
	Item itemSeleccionado
	Item itemUtilizado

	new(Habitacion habitacion, Item item, Laberinto lbo) {
		this.habitacion = habitacion
		this.itemUtilizado = item
		this.laberinto = lbo
	}

	def agregarAccionUsar() {
		if (this.itemSeleccionado == null) {
			throw new UserException("Por favor ingrese un item .")
		} else {
			habitacion.agregarAccion(new Usar(1, this.itemUtilizado, new Usar(2, itemSeleccionado, new Accion())))
		}
	}

	def List<Item> getItemsDisponibles() {
		val lista = new ArrayList<Item>
		for (Item i : laberinto.itemsDisponibles) {
			if (i.nombre != null) {
				lista.add(i)
			}
		}

		quitarDuplicadosYElementoUtilizado(lista)
		return lista
	}

	def quitarDuplicadosYElementoUtilizado(ArrayList<Item> items) {
		val hs = new HashSet<Item>();
		hs.addAll(items)
		items.clear()
		items.addAll(hs)
		items.remove(itemUtilizado)
	}

}
