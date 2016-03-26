package unq_ciu.gatoEncerrado.acciones

import unq_ciu.gatoEncerrado.Accion
import org.eclipse.xtend.lib.annotations.Accessors
import unq_ciu.gatoEncerrado.Habitacion
import unq_ciu.gatoEncerrado.Jugador
import unq_ciu.gatoEncerrado.Juego

@Accessors
class Mover extends Accion {

	new(){}

	override ejecutar(Jugador jugador, Juego juego) {
		juego.getLaberinto().setHabitacionActual = juego.getLaberinto().getHabitacionNueva() 
	}
}
