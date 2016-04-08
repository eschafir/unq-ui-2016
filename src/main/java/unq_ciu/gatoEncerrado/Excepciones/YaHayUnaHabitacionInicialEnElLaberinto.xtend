package unq_ciu.gatoEncerrado.Excepciones

import java.lang.Exception

class YaHayUnaHabitacionInicialEnElLaberinto extends Exception {
	new() {
		super("No se puede haber más de una habitacion inicial en el laberitno");
	}
}
