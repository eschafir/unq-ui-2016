package unq_ciu.gatoEncerrado.Excepciones;

@SuppressWarnings("all")
public class NoEstaDisponibleEstaAccionException extends Exception {
  public NoEstaDisponibleEstaAccionException() {
    super("No se puede realizar esta accion en la habitacion actual!");
  }
}
