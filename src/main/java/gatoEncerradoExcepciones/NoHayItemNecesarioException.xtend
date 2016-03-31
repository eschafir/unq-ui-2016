package gatoEncerradoExcepciones

import java.lang.Exception

class NoHayItemNecesarioException extends Exception {
	new(){
		super("No tienes el item necesario.");
	}
}