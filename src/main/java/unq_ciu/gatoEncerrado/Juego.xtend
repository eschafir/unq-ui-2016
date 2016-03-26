package unq_ciu.gatoEncerrado

import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class Juego {

	Jugador jugador
	Laberinto laberinto
	Estado estado

	new(Jugador jugador, Laberinto laberinto) {
		this.jugador = jugador
		this.laberinto = laberinto
		this.estado = new Iniciado()
	}
}
