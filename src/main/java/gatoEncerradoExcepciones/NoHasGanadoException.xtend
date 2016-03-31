package gatoEncerradoExcepciones

import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class NoHasGanadoException extends Exception {
	
	String message
	
	new(String message){
		this.message = message
	}
}