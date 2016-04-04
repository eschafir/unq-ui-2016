package unq_ciu.gatoEncerrado.Excepciones;

@SuppressWarnings("all")
public class NoHayItemNecesarioException extends Exception {
  public NoHayItemNecesarioException() {
    super("No tienes el item necesario.");
  }
}
