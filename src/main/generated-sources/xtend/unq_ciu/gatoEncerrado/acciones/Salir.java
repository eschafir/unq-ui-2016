package unq_ciu.gatoEncerrado.acciones;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import unq_ciu.gatoEncerrado.Accion;
import unq_ciu.gatoEncerrado.Estado;
import unq_ciu.gatoEncerrado.Laberinto;

@Accessors
@SuppressWarnings("all")
public class Salir extends Accion {
  private Laberinto laberintoActual;
  
  public Salir(final Laberinto laberinto) {
    this.laberintoActual = laberinto;
  }
  
  public Salir(final int id) {
    super(id, "Salir");
    this.laberintoActual = null;
  }
  
  public Object ejecutar(final /* Habitacion */Object h, final /* Jugador */Object j) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field juego is undefined for the type Salir"
      + "\nThe method or field juego is undefined for the type Salir"
      + "\nThe method or field juego is undefined for the type Salir"
      + "\nThe method or field juego is undefined for the type Salir"
      + "\nThe method or field juego is undefined for the type Salir"
      + "\njugador cannot be resolved"
      + "\nhabitacion cannot be resolved"
      + "\ngetLaberinto cannot be resolved"
      + "\njugador cannot be resolved"
      + "\nhabitacion cannot be resolved"
      + "\nisEsFinal cannot be resolved"
      + "\njugador cannot be resolved"
      + "\nganados cannot be resolved"
      + "\njugador cannot be resolved"
      + "\nganados cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nestado cannot be resolved");
  }
  
  public Object execute() {
    this.laberintoActual.setEstado(Estado.RESUELTO);
    return this.laberintoActual.getEstado();
  }
  
  @Pure
  public Laberinto getLaberintoActual() {
    return this.laberintoActual;
  }
  
  public void setLaberintoActual(final Laberinto laberintoActual) {
    this.laberintoActual = laberintoActual;
  }
}
