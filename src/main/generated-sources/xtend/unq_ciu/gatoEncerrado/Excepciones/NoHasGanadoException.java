package unq_ciu.gatoEncerrado.Excepciones;

@SuppressWarnings("all")
public class NoHasGanadoException extends Exception {
  public NoHasGanadoException() {
    super("No estás en la habitación final");
  }
}
