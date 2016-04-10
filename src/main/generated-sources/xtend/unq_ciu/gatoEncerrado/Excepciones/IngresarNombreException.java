package unq_ciu.gatoEncerrado.Excepciones;

@SuppressWarnings("all")
public class IngresarNombreException extends Exception {
  public IngresarNombreException() {
    super("Por favor ingrese un nombre");
  }
}
