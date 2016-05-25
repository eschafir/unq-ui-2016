package unq_ciu.gatoEncerrado.acciones;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pure;
import unq_ciu.gatoEncerrado.Accion;
import unq_ciu.gatoEncerrado.Estado;
import unq_ciu.gatoEncerrado.Excepciones.NoHasGanadoException;
import unq_ciu.gatoEncerrado.Habitacion;
import unq_ciu.gatoEncerrado.Jugador;
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
  
  public Object ejecutar(final Habitacion h, final Jugador j) {
    try {
      Habitacion _habitacion = j.getHabitacion();
      boolean _isEsFinal = _habitacion.isEsFinal();
      if (_isEsFinal) {
        int _ganados = j.getGanados();
        int _plus = (_ganados + 1);
        j.setGanados(_plus);
      } else {
        throw new NoHasGanadoException();
      }
      return Integer.valueOf(j.getGanados());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
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
