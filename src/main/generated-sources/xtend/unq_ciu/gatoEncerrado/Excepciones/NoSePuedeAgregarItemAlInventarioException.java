package unq_ciu.gatoEncerrado.Excepciones;

@SuppressWarnings("all")
public class NoSePuedeAgregarItemAlInventarioException extends Exception {
  public NoSePuedeAgregarItemAlInventarioException() {
    super("Inventario lleno.");
  }
}
