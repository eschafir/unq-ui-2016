package unq_ciu.gatoEncerrado.Estado

import unq_ciu.gatoEncerrado.Estado.Estado
import unq_ciu.gatoEncerrado.Juego

class Finalizado implements Estado {

	private Juego juego

	new(Juego juego) {
		this.juego = juego
	}

}
