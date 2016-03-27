package unq_ciu.gatoEncerrado.Estado

import unq_ciu.gatoEncerrado.Estado.Estado
import unq_ciu.gatoEncerrado.Juego
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class Finalizado implements Estado {

	private Juego juego

	new(Juego juego) {
		this.juego = juego
	}

}
