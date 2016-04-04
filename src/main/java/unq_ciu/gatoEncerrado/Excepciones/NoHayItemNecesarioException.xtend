package unq_ciu.gatoEncerrado.Excepciones

import java.lang.Exception

class NoHayItemNecesarioException extends Exception {
	new(){
		super("No tienes el item necesario.");
	}
}