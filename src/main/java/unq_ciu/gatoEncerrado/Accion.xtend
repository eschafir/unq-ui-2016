package unq_ciu.gatoEncerrado

import org.uqbar.commons.utils.Observable
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
@Observable
abstract class Accion {
	
	String nombre

	def void ejecutar(Juego juego) {}
}
