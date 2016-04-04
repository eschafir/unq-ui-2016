package unq_ciu.gatoEncerrado.Excepciones

import java.lang.Exception

class NoEstaDisponibleEstaAccionException extends Exception {
	new(){
		super("No se puede realizar esta accion en la habitacion actual!");
	}
}