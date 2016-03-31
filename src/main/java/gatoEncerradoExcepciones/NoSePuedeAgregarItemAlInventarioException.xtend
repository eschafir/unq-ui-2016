package gatoEncerradoExcepciones

import java.lang.Exception

class NoSePuedeAgregarItemAlInventarioException extends Exception {
	new() {
		super("Inventario lleno.");
	}
}
