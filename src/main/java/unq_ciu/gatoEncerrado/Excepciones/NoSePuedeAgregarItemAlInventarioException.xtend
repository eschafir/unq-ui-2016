package unq_ciu.gatoEncerrado.Excepciones

import java.lang.Exception

class NoSePuedeAgregarItemAlInventarioException extends Exception {
	new() {
		super("Inventario lleno.");
	}
}
