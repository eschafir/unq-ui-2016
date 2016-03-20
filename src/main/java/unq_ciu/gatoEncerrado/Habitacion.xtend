package unq_ciu.gatoEncerrado

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.ArrayList

@Accessors
class Habitacion {
	boolean esInicial
	boolean esFinal
	ArrayList<Accion> acciones
	Item item
}
