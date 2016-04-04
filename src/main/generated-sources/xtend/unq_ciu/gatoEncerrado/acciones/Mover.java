package unq_ciu.gatoEncerrado.acciones;

import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pure;
import unq_ciu.gatoEncerrado.Accion;
import unq_ciu.gatoEncerrado.Excepciones.NoEstaDisponibleEstaAccionException;
import unq_ciu.gatoEncerrado.Habitacion;
import unq_ciu.gatoEncerrado.Juego;
import unq_ciu.gatoEncerrado.Jugador;

@Accessors
@SuppressWarnings("all")
public class Mover extends Accion {
  private Habitacion destino;
  
  public Mover(final Habitacion destino) {
    this.destino = destino;
  }
  
  public void ejecutar(final Juego juego) {
    try {
      List<Accion> _accionesPosibles = juego.accionesPosibles();
      boolean _contains = _accionesPosibles.contains(this);
      if (_contains) {
        Jugador _jugador = juego.getJugador();
        _jugador.setHabitacion(this.destino);
      } else {
        throw new NoEstaDisponibleEstaAccionException();
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Pure
  public Habitacion getDestino() {
    return this.destino;
  }
  
  public void setDestino(final Habitacion destino) {
    this.destino = destino;
  }
}
