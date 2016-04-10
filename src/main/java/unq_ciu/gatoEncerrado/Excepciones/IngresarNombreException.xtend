package unq_ciu.gatoEncerrado.Excepciones

import java.lang.Exception

class IngresarNombreException extends Exception {
	new() {
		super("Por favor ingrese un nombre");
	}
}
