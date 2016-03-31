package gatoEncerradoExcepciones

class NoHasGanadoException extends Exception {
	
	new(){
		super("No estás en la habitación final");
	}
}