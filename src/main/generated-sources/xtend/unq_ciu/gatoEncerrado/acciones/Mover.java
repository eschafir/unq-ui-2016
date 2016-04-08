package unq_ciu.gatoEncerrado.acciones;

import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.Observable;
import unq_ciu.gatoEncerrado.Accion;
import unq_ciu.gatoEncerrado.Excepciones.NoEstaDisponibleEstaAccionException;
import unq_ciu.gatoEncerrado.Habitacion;
import unq_ciu.gatoEncerrado.Juego;
import unq_ciu.gatoEncerrado.Jugador;

@Accessors
@Observable
@SuppressWarnings("all")
public class Mover extends Accion {
  private String nombre;
  
  private Habitacion destino;
  
  public Mover(final Habitacion destino) {
    String _nombre = destino.getNombre();
    String _plus = ("Mover a " + _nombre);
    this.nombre = _plus;
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
  public String getNombre() {
    return this.nombre;
  }
  
  public void setNombre(final String nombre) {
    this.nombre = nombre;
  }
  
  @Pure
  public Habitacion getDestino() {
    return this.destino;
  }
  
  public void setDestino(final Habitacion destino) {
    this.destino = destino;
  }
}
