package unq_ciu.gatoEncerrado.Excepciones

class NoHasGanadoException extends Exception {
	
	new(){
		super("No estás en la habitación final");
	}
}